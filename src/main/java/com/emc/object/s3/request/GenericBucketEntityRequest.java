package com.emc.object.s3.request;

import com.emc.object.EntityRequest;
import com.emc.object.Method;

public class GenericBucketEntityRequest<T> extends GenericBucketRequest implements EntityRequest {
    private T entity;
    private String contentType;

    public GenericBucketEntityRequest(Method method, String bucketName, T entity) {
        super(method, bucketName);
        this.entity = entity;
    }

    @Override
    public T getEntity() {
        return entity;
    }

    @Override
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public GenericBucketEntityRequest withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }
}