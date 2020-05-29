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

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Pool;
import org.openapitools.client.model.PoolCollection;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PoolApi
 */
@Ignore
public class PoolApiTest {

    private final PoolApi api = new PoolApi();

    
    /**
     * Create a pool
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void createPoolTest() throws IOException {
        Pool pool = null;
        Pool response = api.createPool(pool);

        // TODO: test validations
    }
    
    /**
     * Delete a pool
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void deletePoolTest() throws IOException {
        String poolName = null;
        api.deletePool(poolName);

        // TODO: test validations
    }
    
    /**
     * Get a pool
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void getPoolTest() throws IOException {
        String poolName = null;
        Pool response = api.getPool(poolName);

        // TODO: test validations
    }
    
    /**
     * Get all pools
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void getPoolsTest() throws IOException {
        Integer limit = null;
        Integer offset = null;
        PoolCollection response = api.getPools(limit, offset);

        // TODO: test validations
    }
    
    /**
     * Update a pool
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void updatePoolTest() throws IOException {
        String poolName = null;
        Pool pool = null;
        List<String> updateMask = null;
        Pool response = api.updatePool(poolName, pool, updateMask);

        // TODO: test validations
    }
    
}