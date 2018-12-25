package com.coderbd.sds.entity.nmsConfig;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class EthernetSwitch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "switch_id")
    private Device device;

    private String ipAddress;

    private String status;

    @OneToOne
    @JoinColumn(name = "ied_id")
    private Ied ied;

    @OneToOne
    @JoinColumn(name = "sa_parent_id")
    private SaParent saParent;

    @OneToOne
    @JoinColumn(name = "sntp_id")
    private Sntp sntp;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Ied getIed() {
        return ied;
    }

    public void setIed(Ied ied) {
        this.ied = ied;
    }

    public SaParent getSaParent() {
        return saParent;
    }

    public void setSaParent(SaParent saParent) {
        this.saParent = saParent;
    }

    public Sntp getSntp() {
        return sntp;
    }

    public void setSntp(Sntp sntp) {
        this.sntp = sntp;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }
}
