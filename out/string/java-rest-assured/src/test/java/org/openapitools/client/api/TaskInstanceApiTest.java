/*
 * Airflow API (Stable)
 * Apache Airflow management API.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: dev@airflow.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import java.math.BigDecimal;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ExtraLinkCollection;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.ListTaskInstanceForm;
import org.threeten.bp.OffsetDateTime;
import org.openapitools.client.model.TaskInstance;
import org.openapitools.client.model.TaskInstanceCollection;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.TaskInstanceApi;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static org.openapitools.client.GsonObjectMapper.gson;

/**
 * API tests for TaskInstanceApi
 */
@Ignore
public class TaskInstanceApiTest {

    private TaskInstanceApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("http://localhost/api/v1"))).taskInstance();
    }

    /**
     * Successful response.
     */
    @Test
    public void shouldSee200AfterGetExtraLinks() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        api.getExtraLinks()
                .dagIdPath(dagId)
                .dagRunIdPath(dagRunId)
                .taskIdPath(taskId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Request not authenticated due to missing, invalid, authentication info.
     */
    @Test
    public void shouldSee401AfterGetExtraLinks() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        api.getExtraLinks()
                .dagIdPath(dagId)
                .dagRunIdPath(dagRunId)
                .taskIdPath(taskId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Client does not have sufficient permission.
     */
    @Test
    public void shouldSee403AfterGetExtraLinks() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        api.getExtraLinks()
                .dagIdPath(dagId)
                .dagRunIdPath(dagRunId)
                .taskIdPath(taskId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * A specified resource is not found.
     */
    @Test
    public void shouldSee404AfterGetExtraLinks() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        api.getExtraLinks()
                .dagIdPath(dagId)
                .dagRunIdPath(dagRunId)
                .taskIdPath(taskId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Content of logs.
     */
    @Test
    public void shouldSee200AfterGetLogs() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        Integer taskTryNumber = null;
        Boolean fullContent = null;
        String token = null;
        api.getLogs()
                .dagIdPath(dagId)
                .dagRunIdPath(dagRunId)
                .taskIdPath(taskId)
                .taskTryNumberPath(taskTryNumber).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Client specified an invalid argument.
     */
    @Test
    public void shouldSee400AfterGetLogs() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        Integer taskTryNumber = null;
        Boolean fullContent = null;
        String token = null;
        api.getLogs()
                .dagIdPath(dagId)
                .dagRunIdPath(dagRunId)
                .taskIdPath(taskId)
                .taskTryNumberPath(taskTryNumber).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Request not authenticated due to missing, invalid, authentication info.
     */
    @Test
    public void shouldSee401AfterGetLogs() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        Integer taskTryNumber = null;
        Boolean fullContent = null;
        String token = null;
        api.getLogs()
                .dagIdPath(dagId)
                .dagRunIdPath(dagRunId)
                .taskIdPath(taskId)
                .taskTryNumberPath(taskTryNumber).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Client does not have sufficient permission.
     */
    @Test
    public void shouldSee403AfterGetLogs() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        Integer taskTryNumber = null;
        Boolean fullContent = null;
        String token = null;
        api.getLogs()
                .dagIdPath(dagId)
                .dagRunIdPath(dagRunId)
                .taskIdPath(taskId)
                .taskTryNumberPath(taskTryNumber).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * A specified resource is not found.
     */
    @Test
    public void shouldSee404AfterGetLogs() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        Integer taskTryNumber = null;
        Boolean fullContent = null;
        String token = null;
        api.getLogs()
                .dagIdPath(dagId)
                .dagRunIdPath(dagRunId)
                .taskIdPath(taskId)
                .taskTryNumberPath(taskTryNumber).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Successful response.
     */
    @Test
    public void shouldSee200AfterGetTaskInstance() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        api.getTaskInstance()
                .dagIdPath(dagId)
                .dagRunIdPath(dagRunId)
                .taskIdPath(taskId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Request not authenticated due to missing, invalid, authentication info.
     */
    @Test
    public void shouldSee401AfterGetTaskInstance() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        api.getTaskInstance()
                .dagIdPath(dagId)
                .dagRunIdPath(dagRunId)
                .taskIdPath(taskId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Client does not have sufficient permission.
     */
    @Test
    public void shouldSee403AfterGetTaskInstance() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        api.getTaskInstance()
                .dagIdPath(dagId)
                .dagRunIdPath(dagRunId)
                .taskIdPath(taskId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * A specified resource is not found.
     */
    @Test
    public void shouldSee404AfterGetTaskInstance() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        api.getTaskInstance()
                .dagIdPath(dagId)
                .dagRunIdPath(dagRunId)
                .taskIdPath(taskId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * List of task instances.
     */
    @Test
    public void shouldSee200AfterGetTaskInstances() {
        String dagId = null;
        String dagRunId = null;
        OffsetDateTime executionDateGte = null;
        OffsetDateTime executionDateLte = null;
        OffsetDateTime startDateGte = null;
        OffsetDateTime startDateLte = null;
        OffsetDateTime endDateGte = null;
        OffsetDateTime endDateLte = null;
        BigDecimal durationGte = null;
        BigDecimal durationLte = null;
        List<String> state = null;
        List<String> pool = null;
        List<String> queue = null;
        Integer limit = null;
        Integer offset = null;
        api.getTaskInstances()
                .dagIdPath(dagId)
                .dagRunIdPath(dagRunId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Request not authenticated due to missing, invalid, authentication info.
     */
    @Test
    public void shouldSee401AfterGetTaskInstances() {
        String dagId = null;
        String dagRunId = null;
        OffsetDateTime executionDateGte = null;
        OffsetDateTime executionDateLte = null;
        OffsetDateTime startDateGte = null;
        OffsetDateTime startDateLte = null;
        OffsetDateTime endDateGte = null;
        OffsetDateTime endDateLte = null;
        BigDecimal durationGte = null;
        BigDecimal durationLte = null;
        List<String> state = null;
        List<String> pool = null;
        List<String> queue = null;
        Integer limit = null;
        Integer offset = null;
        api.getTaskInstances()
                .dagIdPath(dagId)
                .dagRunIdPath(dagRunId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Client does not have sufficient permission.
     */
    @Test
    public void shouldSee403AfterGetTaskInstances() {
        String dagId = null;
        String dagRunId = null;
        OffsetDateTime executionDateGte = null;
        OffsetDateTime executionDateLte = null;
        OffsetDateTime startDateGte = null;
        OffsetDateTime startDateLte = null;
        OffsetDateTime endDateGte = null;
        OffsetDateTime endDateLte = null;
        BigDecimal durationGte = null;
        BigDecimal durationLte = null;
        List<String> state = null;
        List<String> pool = null;
        List<String> queue = null;
        Integer limit = null;
        Integer offset = null;
        api.getTaskInstances()
                .dagIdPath(dagId)
                .dagRunIdPath(dagRunId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * List of task instances.
     */
    @Test
    public void shouldSee200AfterGetTaskInstancesBatch() {
        ListTaskInstanceForm listTaskInstanceForm = null;
        api.getTaskInstancesBatch()
                .body(listTaskInstanceForm).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Request not authenticated due to missing, invalid, authentication info.
     */
    @Test
    public void shouldSee401AfterGetTaskInstancesBatch() {
        ListTaskInstanceForm listTaskInstanceForm = null;
        api.getTaskInstancesBatch()
                .body(listTaskInstanceForm).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Client does not have sufficient permission.
     */
    @Test
    public void shouldSee403AfterGetTaskInstancesBatch() {
        ListTaskInstanceForm listTaskInstanceForm = null;
        api.getTaskInstancesBatch()
                .body(listTaskInstanceForm).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * A specified resource is not found.
     */
    @Test
    public void shouldSee404AfterGetTaskInstancesBatch() {
        ListTaskInstanceForm listTaskInstanceForm = null;
        api.getTaskInstancesBatch()
                .body(listTaskInstanceForm).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}