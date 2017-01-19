/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.icr.ingest.webservices.nifi;

import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.apache.nifi.framework.security.util.SslContextFactory;
import org.apache.nifi.util.NiFiProperties;
import org.apache.nifi.web.security.ProxiedEntitiesUtils;
import org.apache.nifi.web.util.WebUtils;
import org.springframework.stereotype.Component;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

/**
 * Nifi rest based handler to communicate with nifi
 *
 */
@Component
public class NifiRestHandler
{

    private final Client client;
    private final String proxyDn;

    public NifiRestHandler(Client client, String proxyDn)
    {
        this.client = client;
        if (proxyDn != null)
        {
            this.proxyDn = ProxiedEntitiesUtils.formatProxyDn(proxyDn);
        }
        else
        {
            this.proxyDn = null;
        }
    }

    public NifiRestHandler(NiFiProperties properties, String proxyDn)
    {
        this(WebUtils.createClient(null, SslContextFactory.createSslContext(properties)), proxyDn);
    }

    public NifiRestHandler()
    {
        this(WebUtils.createClient(null, null), null);
    }

    /**
     * Conditionally adds the proxied entities chain.
     *
     * @param builder
     *            the resource builder
     * @return the resource builder
     */
    private WebResource.Builder addProxiedEntities(final WebResource.Builder builder)
    {
        if (proxyDn == null)
        {
            return builder;
        }
        else
        {
            return builder.header(ProxiedEntitiesUtils.PROXY_ENTITIES_CHAIN, proxyDn);
        }
    }

    /**
     * Performs a GET using the specified url.
     *
     * @param url
     *            url
     * @return response
     * @throws Exception
     *             ex
     */
    public <T> T get(String url, Class<T> responseClass) throws Exception
    {
        return get(url, null, responseClass);
    }

    /**
     * Performs a GET using the specified url and query parameters.
     *
     * @param url
     *            url
     * @param queryParams
     *            params
     * @return response
     */
    public <T> T get(String url, Map<String, String> queryParams, Class<T> responseClass)
    {
        return getWithHeaders(url, queryParams, null, responseClass);
    }

    /**
     * Performs a GET using the specified url and query parameters.
     *
     * @param url
     *            url
     * @param queryParams
     *            params
     * @param headers
     *            http headers
     * @return response
     */
    public ClientResponse getWithHeaders(String url, Map<String, String> queryParams, Map<String, String> headers)
    {
        // get the resource
        WebResource resource = client.resource(url);

        // append any query parameters
        if (queryParams != null && !queryParams.isEmpty())
        {
            for (String key : queryParams.keySet())
            {
                resource = resource.queryParam(key, queryParams.get(key));
            }
        }

        // get the builder
        WebResource.Builder builder = addProxiedEntities(resource.getRequestBuilder());

        // append any headers
        if (headers != null && !headers.isEmpty())
        {
            for (String key : headers.keySet())
            {
                builder = builder.header(key, headers.get(key));
            }
        }

        // perform the query
        return builder.get(ClientResponse.class);
    }
    
    public <T> T getWithHeaders(String url, Map<String, String> queryParams, Map<String, String> headers,
            Class<T> responseClass)
    {        
        // perform the query
        return getWithHeaders(url, queryParams, headers).getEntity(responseClass);
    }

    /**
     * Performs a POST using the specified url.
     *
     * @param url
     *            url
     * @return response
     * @throws Exception
     *             ex
     */
    public <T> T post(String url, Class<T> responseClass) throws Exception
    {
        return post(url, (Object) null, responseClass);
    }

    /**
     * Performs a POST using the specified url and entity body.
     *
     * @param url
     *            url
     * @param entity
     *            entity
     * @return response
     * @throws Exception
     *             ex
     */
    public <T> T post(String url, Object entity, Class<T> responseClass) throws Exception
    {
        return postWithHeaders(url, entity, null, responseClass);
    }

    /**
     * Performs a POST using the specified url and entity body.
     *
     * @param url
     *            url
     * @param entity
     *            entity
     * @param headers
     *            http headers
     * @return response
     * @throws Exception
     *             ex
     */
    public ClientResponse postWithHeaders(String url, Object entity, Map<String, String> headers)
            throws Exception
    {
        // get the resource
        WebResource.Builder resourceBuilder = addProxiedEntities(client.resource(url).type(MediaType.APPLICATION_JSON));

        // include the request entity
        if (entity != null)
        {
            resourceBuilder = resourceBuilder.entity(entity);
        }

        // append any headers
        if (headers != null && !headers.isEmpty())
        {
            for (String key : headers.keySet())
            {
                resourceBuilder = resourceBuilder.header(key, headers.get(key));
            }
        }

        // perform the request
        return resourceBuilder.post(ClientResponse.class);
    }
    
    public <T> T postWithHeaders(String url, Object entity, Map<String, String> headers, Class<T> responseClass)
            throws Exception
    {
        return postWithHeaders(url, entity, headers).getEntity(responseClass);
    }

    /**
     * Performs a POST using the specified url and entity body.
     *
     * @param url
     *            url
     * @param entity
     *            entity
     * @return response
     * @throws Exception
     *             ex
     */
    public <T> T postMultiPart(String url, Object entity, Class<T> responseClass) throws Exception
    {
        return postMultiPartWithHeaders(url, entity, null, responseClass);
    }

    /**
     * Performs a POST using the specified url and entity body.
     *
     * @param url
     *            url
     * @param entity
     *            entity
     * @param headers
     *            http headers
     * @return response
     * @throws Exception
     *             ex
     */
    public ClientResponse postMultiPartWithHeaders(String url, Object entity, Map<String, String> headers)
            throws Exception
    {
        // get the resource
        WebResource.Builder resourceBuilder = addProxiedEntities(
                client.resource(url).accept(MediaType.APPLICATION_XML).type(MediaType.MULTIPART_FORM_DATA));

        // include the request entity
        if (entity != null)
        {
            resourceBuilder = resourceBuilder.entity(entity);
        }

        // append any headers
        if (headers != null && !headers.isEmpty())
        {
            for (String key : headers.keySet())
            {
                resourceBuilder = resourceBuilder.header(key, headers.get(key));
            }
        }

        // perform the request
        return resourceBuilder.post(ClientResponse.class);
    }

    public <T> T postMultiPartWithHeaders(String url, Object entity, Map<String, String> headers,
            Class<T> responseClass) throws Exception
    {
        return postMultiPartWithHeaders(url, entity, headers).getEntity(responseClass);
    }

    /**
     * Performs a POST using the specified url and form data.
     *
     * @param url
     *            url
     * @param formData
     *            form data
     * @return response
     * @throws java.lang.Exception
     *             ex
     */
    public <T> T post(String url, Map<String, String> formData, Class<T> responseClass) throws Exception
    {
        return postWithHeaders(url, formData, null, responseClass);
    }

    /**
     * Performs a POST using the specified url and form data.
     *
     * @param url
     *            url
     * @param formData
     *            form data
     * @param headers
     *            http headers
     * @return response
     * @throws java.lang.Exception
     *             ex
     */
    public ClientResponse postWithHeaders(String url, Map<String, String> formData, Map<String, String> headers)
            throws Exception
    {
        // convert the form data
        MultivaluedMapImpl entity = new MultivaluedMapImpl();
        for (String key : formData.keySet())
        {
            entity.add(key, formData.get(key));
        }

        // get the resource
        WebResource.Builder resourceBuilder = addProxiedEntities(
                client.resource(url).type(MediaType.APPLICATION_FORM_URLENCODED));

        // add the form data if necessary
        if (!entity.isEmpty())
        {
            resourceBuilder = resourceBuilder.entity(entity);
        }

        // append any headers
        if (headers != null && !headers.isEmpty())
        {
            for (String key : headers.keySet())
            {
                resourceBuilder = resourceBuilder.header(key, headers.get(key));
            }
        }

        // perform the request
        return resourceBuilder.post(ClientResponse.class);
    }

    public <T> T postWithHeaders(String url, Map<String, String> formData, Map<String, String> headers,
            Class<T> responseClass) throws Exception
    {
        return postWithHeaders(url, formData, headers).getEntity(responseClass);
    }

    /**
     * Performs a PUT using the specified url and entity body.
     *
     * @param url
     *            url
     * @param entity
     *            entity
     * @return response
     * @throws java.lang.Exception
     *             ex
     */
    public <T> T put(String url, Object entity, Class<T> responseClass) throws Exception
    {
        return putWithHeaders(url, entity, null, responseClass);
    }

    /**
     * Performs a PUT using the specified url and entity body.
     *
     * @param url
     *            url
     * @param entity
     *            entity
     * @param headers
     *            http headers
     * @return response
     * @throws java.lang.Exception
     *             ex
     */
    public ClientResponse putWithHeaders(String url, Object entity, Map<String, String> headers) throws Exception
    {
        // get the resource
        WebResource.Builder resourceBuilder = addProxiedEntities(client.resource(url).type(MediaType.APPLICATION_JSON));

        // include the request entity
        if (entity != null)
        {
            resourceBuilder = resourceBuilder.entity(entity);
        }

        // append any headers
        if (headers != null && !headers.isEmpty())
        {
            for (String key : headers.keySet())
            {
                resourceBuilder = resourceBuilder.header(key, headers.get(key));
            }
        }

        // perform the request
        return resourceBuilder.put(ClientResponse.class);
    }

    public <T> T putWithHeaders(String url, Object entity, Map<String, String> headers, Class<T> responseClass)
            throws Exception
    {
        return putWithHeaders(url, entity, headers).getEntity(responseClass);
    }

    /**
     * Performs a PUT using the specified url and form data.
     *
     * @param url
     *            url
     * @param formData
     *            form data
     * @return response
     * @throws java.lang.Exception
     *             ex
     */
    public <T> T put(String url, Map<String, String> formData, Class<T> responseClass) throws Exception
    {
        return putWithHeaders(url, formData, null, responseClass);
    }

    /**
     * Performs a PUT using the specified url and form data.
     *
     * @param url
     *            url
     * @param formData
     *            form data
     * @param headers
     *            http headers
     * @return response
     * @throws java.lang.Exception
     *             ex
     */
    public ClientResponse putWithHeaders(String url, Map<String, String> formData, Map<String, String> headers)
            throws Exception
    {
        // convert the form data
        MultivaluedMapImpl entity = new MultivaluedMapImpl();
        for (String key : formData.keySet())
        {
            entity.add(key, formData.get(key));
        }

        // get the resource
        WebResource.Builder resourceBuilder = addProxiedEntities(
                client.resource(url).type(MediaType.APPLICATION_FORM_URLENCODED));

        // add the form data if necessary
        if (!entity.isEmpty())
        {
            resourceBuilder = resourceBuilder.entity(entity);
        }

        // append any headers
        if (headers != null && !headers.isEmpty())
        {
            for (String key : headers.keySet())
            {
                resourceBuilder = resourceBuilder.header(key, headers.get(key));
            }
        }

        // perform the request
        return resourceBuilder.put(ClientResponse.class);
    }

    public <T> T putWithHeaders(String url, Map<String, String> formData, Map<String, String> headers,
            Class<T> responseClass) throws Exception
    {
        return putWithHeaders(url, formData, headers).getEntity(responseClass);
    }

    /**
     * Performs a DELETE using the specified url.
     *
     * @param url
     *            url
     * @return response
     * @throws java.lang.Exception
     *             ex
     */
    public <T> T delete(String url, Class<T> responseClass) throws Exception
    {
        return delete(url, null, responseClass);
    }

    /**
     * Performs a DELETE using the specified url and entity.
     *
     * @param url
     *            url
     * @param headers
     *            http headers
     * @return response
     * @throws java.lang.Exception
     *             ex
     */
    public <T> T deleteWithHeaders(String url, Map<String, String> headers, Class<T> responseClass) throws Exception
    {
        return deleteWithHeaders(url, headers).getEntity(responseClass);
    }

    public ClientResponse deleteWithHeaders(String url, Map<String, String> headers) throws Exception
    {
        // get the resource
        WebResource.Builder resourceBuilder = addProxiedEntities(client.resource(url).getRequestBuilder());

        // append any headers
        if (headers != null && !headers.isEmpty())
        {
            for (String key : headers.keySet())
            {
                resourceBuilder = resourceBuilder.header(key, headers.get(key));
            }
        }

        // perform the query
        return resourceBuilder.delete(ClientResponse.class);
    }

    /**
     * Performs a DELETE using the specified url and query parameters.
     *
     * @param url
     *            url
     * @param queryParams
     *            params
     * @return response
     * @throws java.lang.Exception
     *             ex
     */
    public ClientResponse delete(String url, Map<String, String> queryParams) throws Exception
    {
        // get the resource
        WebResource resource = client.resource(url);

        // append any query parameters
        if (queryParams != null && !queryParams.isEmpty())
        {
            for (String key : queryParams.keySet())
            {
                resource = resource.queryParam(key, queryParams.get(key));
            }
        }

        // perform the request
        return addProxiedEntities(resource.type(MediaType.APPLICATION_FORM_URLENCODED)).delete(ClientResponse.class);
    }

    public <T> T delete(String url, Map<String, String> queryParams, Class<T> responseClass) throws Exception
    {
        return delete(url, queryParams).getEntity(responseClass);
    }

    /**
     * Attempts to create a token with the specified username and password.
     *
     * @param url
     *            the url
     * @param username
     *            the username
     * @param password
     *            the password
     * @return response
     * @throws Exception
     *             ex
     */
    public ClientResponse createToken(String url, String username, String password) throws Exception
    {
        // convert the form data
        MultivaluedMapImpl entity = new MultivaluedMapImpl();
        entity.add("username", username);
        entity.add("password", password);

        // get the resource
        WebResource.Builder resourceBuilder = addProxiedEntities(
                client.resource(url).accept(MediaType.TEXT_PLAIN).type(MediaType.APPLICATION_FORM_URLENCODED))
                        .entity(entity);

        // perform the request
        return resourceBuilder.post(ClientResponse.class);
    }

}
