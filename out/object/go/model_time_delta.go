/*
 * Airflow API (Stable)
 *
 * Apache Airflow management API.
 *
 * API version: 1.0.0
 * Contact: dev@airflow.apache.org
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// TimeDelta struct for TimeDelta
type TimeDelta struct {
	Type string `json:"__type"`
	Days int32 `json:"days,omitempty"`
	Seconds int32 `json:"seconds,omitempty"`
	Microsecond int32 `json:"microsecond,omitempty"`
}
