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

import org.openapitools.client.model.ClearTaskInstance;
import org.openapitools.client.model.DAG;
import org.openapitools.client.model.DAGCollection;
import org.openapitools.client.model.DAGDetail;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.Task;
import org.openapitools.client.model.TaskCollection;
import org.openapitools.client.model.TaskInstanceReferenceCollection;

import org.openapitools.client.Configuration;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.runner.RunWith;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.core.Vertx;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import io.vertx.ext.unit.junit.RunTestOnContext;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.Async;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DagApi
 */
@RunWith(VertxUnitRunner.class)
@Ignore
public class DagApiTest {

    private DagApi api;

    @Rule
    public RunTestOnContext rule = new RunTestOnContext();

    @BeforeClass
    public void setupApiClient() {
        JsonObject config = new JsonObject();
        Vertx vertx = rule.vertx();
        Configuration.setupDefaultApiClient(vertx, config);

        api = new DagApiImpl();
    }
    
    /**
     * Clears a set of task instances associated with the DAG for a specified date range.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void clearTaskInstanceTest(TestContext context) {
        Async async = context.async();
        String dagId = null;
        ClearTaskInstance clearTaskInstance = null;
        api.clearTaskInstance(dagId, clearTaskInstance, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Get basic information about a DAG
     * Presents only information available in database (DAGModel). If you need detailed information, consider using GET /dags/{dag_id}/detail. 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void getDagTest(TestContext context) {
        Async async = context.async();
        String dagId = null;
        api.getDag(dagId, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Get a simplified representation of DAG.
     * The response contains many DAG attributes, so the response can be large. If possible, consider using GET /dags/{dag_id}. 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void getDagDetailTest(TestContext context) {
        Async async = context.async();
        String dagId = null;
        api.getDagDetail(dagId, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Get source code using file token
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void getDagSourceTest(TestContext context) {
        Async async = context.async();
        String fileToken = null;
        api.getDagSource(fileToken, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Get all DAGs
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void getDagsTest(TestContext context) {
        Async async = context.async();
        Integer limit = null;
        Integer offset = null;
        api.getDags(limit, offset, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Get simplified representation of a task.
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void getTaskTest(TestContext context) {
        Async async = context.async();
        String dagId = null;
        String taskId = null;
        api.getTask(dagId, taskId, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Get tasks for DAG
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void getTasksTest(TestContext context) {
        Async async = context.async();
        String dagId = null;
        api.getTasks(dagId, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Update a DAG
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void updateDagTest(TestContext context) {
        Async async = context.async();
        String dagId = null;
        DAG DAG = null;
        api.updateDag(dagId, DAG, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
}
