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

// TaskState the model 'TaskState'
type TaskState string

// List of TaskState
const (
	SUCCCESS          TaskState = "succcess"
	UPSTREAM_FAILED   TaskState = "upstream_failed"
	SKIPPED           TaskState = "skipped"
	UP_FOR_RETRY      TaskState = "up_for_retry"
	UP_FOR_RESCHEDULE TaskState = "up_for_reschedule"
	QUEUED            TaskState = "queued"
	NONE              TaskState = "none"
	SCHEDULED         TaskState = "scheduled"
)
