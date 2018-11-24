/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.sds.entity.nmsConfig;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author User
 */
@Entity
@Table(name = "gocb")
public class Gocb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "gocb_id")
    private Integer gocbId;
    @Basic(optional = false)
    private int enable;
    @Basic(optional = false)
    private String address;
    @Basic(optional = false)
    @Column(name = "dataset_address")
    private String datasetAddress;
    @Basic(optional = false)
    private int confrev;
    @Basic(optional = false)
    private String gooseid;
    @Basic(optional = false)
    private int appid;
    @Basic(optional = false)
    @Column(name = "destination_mac")
    private String destinationMac;
    @Basic(optional = false)
    @Column(name = "vlan_id")
    private int vlanId;
    @Basic(optional = false)
    @Column(name = "vlan_priority")
    private int vlanPriority;
    @Basic(optional = false)
    private int maxtime;
    @Basic(optional = false)
    private int mintime;
    @JoinColumn(name = "dataset_id", referencedColumnName = "dataset_id")
    @ManyToOne(optional = false)
    private Dataset datasetId;
    @JoinColumn(name = "device_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Device deviceId;

    public Gocb() {
    }

    public Gocb(Integer gocbId) {
        this.gocbId = gocbId;
    }

    public Gocb(Integer gocbId, int enable, String address, String datasetAddress, int confrev, String gooseid, int appid, String destinationMac, int vlanId, int vlanPriority, int maxtime, int mintime) {
        this.gocbId = gocbId;
        this.enable = enable;
        this.address = address;
        this.datasetAddress = datasetAddress;
        this.confrev = confrev;
        this.gooseid = gooseid;
        this.appid = appid;
        this.destinationMac = destinationMac;
        this.vlanId = vlanId;
        this.vlanPriority = vlanPriority;
        this.maxtime = maxtime;
        this.mintime = mintime;
    }

    public Integer getGocbId() {
        return gocbId;
    }

    public void setGocbId(Integer gocbId) {
        this.gocbId = gocbId;
    }

    public int getEnable() {
        return enable;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDatasetAddress() {
        return datasetAddress;
    }

    public void setDatasetAddress(String datasetAddress) {
        this.datasetAddress = datasetAddress;
    }

    public int getConfrev() {
        return confrev;
    }

    public void setConfrev(int confrev) {
        this.confrev = confrev;
    }

    public String getGooseid() {
        return gooseid;
    }

    public void setGooseid(String gooseid) {
        this.gooseid = gooseid;
    }

    public int getAppid() {
        return appid;
    }

    public void setAppid(int appid) {
        this.appid = appid;
    }

    public String getDestinationMac() {
        return destinationMac;
    }

    public void setDestinationMac(String destinationMac) {
        this.destinationMac = destinationMac;
    }

    public int getVlanId() {
        return vlanId;
    }

    public void setVlanId(int vlanId) {
        this.vlanId = vlanId;
    }

    public int getVlanPriority() {
        return vlanPriority;
    }

    public void setVlanPriority(int vlanPriority) {
        this.vlanPriority = vlanPriority;
    }

    public int getMaxtime() {
        return maxtime;
    }

    public void setMaxtime(int maxtime) {
        this.maxtime = maxtime;
    }

    public int getMintime() {
        return mintime;
    }

    public void setMintime(int mintime) {
        this.mintime = mintime;
    }

    public Dataset getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(Dataset datasetId) {
        this.datasetId = datasetId;
    }

    public Device getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Device deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gocbId != null ? gocbId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gocb)) {
            return false;
        }
        Gocb other = (Gocb) object;
        if ((this.gocbId == null && other.gocbId != null) || (this.gocbId != null && !this.gocbId.equals(other.gocbId))) {
            return false;
        }
        return true;
    }


}
