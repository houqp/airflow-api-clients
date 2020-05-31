package openapi

import (
	"encoding/json"
	"testing"
)

type TestConf struct {
	Arg1 float64  `json:"arg1"`
	Arg2 []string `json:"arg2"`
}

type Event struct {
	Name string  `json:"name"`
	Ts   float64 `json:"ts"`
}

type Test2Conf struct {
	Event Event `json:"event"`
}

func TestHandleDagRunConfig(t *testing.T) {
	serverResponse := []byte(`[
	{
		"dag_run_id": "123",
		"dag_id": "test",
		"state": "success",
		"conf": {
			"arg1": 404,
			"arg2": ["a", "b", "c"]
		}
	},
	{
		"dag_run_id": "456",
		"dag_id": "testv2",
		"state": "success",
		"conf": {
			"event": {
				"name": "foo",
				"ts": 100
			}
		}
	}
]`)

	runs := []DagRun{}
	err := json.Unmarshal(serverResponse, &runs)
	if err != nil {
		panic(err)
	}

	// example of how to inspect conf dynamically at runtime
	for _, dr := range runs {
		if dr.DagId == "test" {
			conf := TestConf{
				Arg1: dr.Conf["arg1"].(float64),
				Arg2: []string{},
			}
			for _, s := range dr.Conf["arg2"].([]interface{}) {
				conf.Arg2 = append(conf.Arg2, s.(string))
			}
			// Do somethings with conf
			if conf.Arg1 != 404 {
				t.Error("failed to get arg1 from dagrun conf")
			}
		} else if dr.DagId == "testv2" {
			event := dr.Conf["event"].(map[string]interface{})
			conf := Test2Conf{
				Event: Event{
					Name: event["name"].(string),
					Ts:   event["ts"].(float64),
				},
			}
			// Do somethings with conf
			if conf.Event.Name != "foo" {
				t.Error("failed to get event name from dagrun conf")
			}
		} else {
			// unknown dag with, leave conf as dynamic type
		}
	}
}
