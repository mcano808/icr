package com.icr.ingest.webservices.nifi.common;

public interface NifiEndPoints
{
    static final String GET_TEMPLATES = "/nifi-api/flow/templates";
    static final String GET_PROCESS_GROUP = "/nifi-api/process-groups/%s";
    static final String INSTANTIATE_TEMPLATE = "/nifi-api/process-groups/%s/template-instance";
    static final String CREATE_PROCESS_GROUP = "/nifi-api/process-groups/%s/process-groups";
    static final String DELETE_PROCESS_GROUP = "/nifi-api/process-groups/%s";
}
