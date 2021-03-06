package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.Connection;
import org.openapitools.client.model.ConnectionCollection;
import org.openapitools.client.model.Error;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConnectionApi
 */
public class ConnectionApiTest {

    private ConnectionApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ConnectionApi.class);
    }

    
    /**
     * Create connection entry
     *
     * 
     */
    @Test
    public void createConnectionTest() {
        Connection connection = null;
        // Connection response = api.createConnection(connection);

        // TODO: test validations
    }

    
    /**
     * Delete a connection entry
     *
     * 
     */
    @Test
    public void deleteConnectionTest() {
        Integer connectionId = null;
        // api.deleteConnection(connectionId);

        // TODO: test validations
    }

    
    /**
     * Get a connection entry
     *
     * 
     */
    @Test
    public void getConnectionTest() {
        Integer connectionId = null;
        // Connection response = api.getConnection(connectionId);

        // TODO: test validations
    }

    
    /**
     * Get all connection entries
     *
     * 
     */
    @Test
    public void getConnectionsTest() {
        Integer limit = null;
        Integer offset = null;
        // ConnectionCollection response = api.getConnections(limit, offset);

        // TODO: test validations
    }

    /**
     * Get all connection entries
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getConnectionsTestQueryMap() {
        ConnectionApi.GetConnectionsQueryParams queryParams = new ConnectionApi.GetConnectionsQueryParams()
            .limit(null)
            .offset(null);
        // ConnectionCollection response = api.getConnections(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a connection entry
     *
     * 
     */
    @Test
    public void updateConnectionTest() {
        Integer connectionId = null;
        Connection connection = null;
        List<String> updateMask = null;
        // Connection response = api.updateConnection(connectionId, connection, updateMask);

        // TODO: test validations
    }

    /**
     * Update a connection entry
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void updateConnectionTestQueryMap() {
        Integer connectionId = null;
        Connection connection = null;
        ConnectionApi.UpdateConnectionQueryParams queryParams = new ConnectionApi.UpdateConnectionQueryParams()
            .updateMask(null);
        // Connection response = api.updateConnection(connectionId, connection, queryParams);

    // TODO: test validations
    }
    
}
