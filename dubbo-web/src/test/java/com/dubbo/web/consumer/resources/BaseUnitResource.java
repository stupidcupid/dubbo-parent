package com.dubbo.web.consumer.resources;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 * Created by nanzhou on 2017/9/25.
 */
public class BaseUnitResource {

    protected ClientConfig config = new DefaultClientConfig();

    protected Client client = Client.create(config);

    protected WebResource webResource = client.resource("http://localhost:8087/dubbo-web/rest/");
}
