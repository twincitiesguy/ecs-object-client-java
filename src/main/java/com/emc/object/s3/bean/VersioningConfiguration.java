package com.emc.object.s3.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "VersioningConfiguration")
public class VersioningConfiguration {
    private Status status;

    @XmlElement(name = "Status")
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @XmlEnum
    private static enum Status {
        Enabled, Suspended
    }
}
