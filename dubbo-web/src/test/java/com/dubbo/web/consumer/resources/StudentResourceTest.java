package com.dubbo.web.consumer.resources;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.junit.Test;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.core.util.MultivaluedMapImpl;

/**
 * Created by nanzhou on 2017/9/25.
 */
public class StudentResourceTest extends BaseUnitResource {

    @Test
    public void testQuerySchemeList() {

        MultivaluedMap<String, String> param = new MultivaluedMapImpl();

        ClientResponse response =
                webResource.path("/student/list")
                        .queryParams(param)
                        .type(MediaType.APPLICATION_FORM_URLENCODED)
                        .get(ClientResponse.class);
        System.out.println(response.getStatus() + "+" + response.getEntity(String.class));
    }
}
