/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.sds.entity.nmsConfig;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "dataset_member")
public class DatasetMember implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dataset_member_id")
    private Integer datasetMemberId;
    @Basic(optional = false)
    private String address;
    @JoinColumn(name = "dataset_id", referencedColumnName = "dataset_id")
    @ManyToOne(optional = false)
    private Dataset datasetId;
    @JoinColumn(name = "device_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Device deviceId;

    public DatasetMember() {
    }

    public DatasetMember(Integer datasetMemberId) {
        this.datasetMemberId = datasetMemberId;
    }

    public DatasetMember(Integer datasetMemberId, String address) {
        this.datasetMemberId = datasetMemberId;
        this.address = address;
    }

    public Integer getDatasetMemberId() {
        return datasetMemberId;
    }

    public void setDatasetMemberId(Integer datasetMemberId) {
        this.datasetMemberId = datasetMemberId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        hash += (datasetMemberId != null ? datasetMemberId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatasetMember)) {
            return false;
        }
        DatasetMember other = (DatasetMember) object;
        if ((this.datasetMemberId == null && other.datasetMemberId != null) || (this.datasetMemberId != null && !this.datasetMemberId.equals(other.datasetMemberId))) {
            return false;
        }
        return true;
    }

}
