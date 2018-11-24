/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.sds.entity.nmsConfig;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;

/**
 *
 * @author User
 */
@Entity
@Table(name = "data_set")
public class Dataset implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dataset_id")
    private Integer datasetId;
    @Basic(optional = false)
    private String address;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datasetId")
    private Collection<DatasetMember> datasetMemberCollection;
    @OneToMany(mappedBy = "datasetId")
    private Collection<Rcb> rcbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datasetId")
    private Collection<Gocb> gocbCollection;
    @JoinColumn(name = "device_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Device deviceId;

    public Dataset() {
    }

    public Dataset(Integer datasetId) {
        this.datasetId = datasetId;
    }

    public Dataset(Integer datasetId, String address) {
        this.datasetId = datasetId;
        this.address = address;
    }

    public Integer getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(Integer datasetId) {
        this.datasetId = datasetId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Collection<DatasetMember> getDatasetMemberCollection() {
        return datasetMemberCollection;
    }

    public void setDatasetMemberCollection(Collection<DatasetMember> datasetMemberCollection) {
        this.datasetMemberCollection = datasetMemberCollection;
    }

    public Collection<Rcb> getRcbCollection() {
        return rcbCollection;
    }

    public void setRcbCollection(Collection<Rcb> rcbCollection) {
        this.rcbCollection = rcbCollection;
    }

    public Collection<Gocb> getGocbCollection() {
        return gocbCollection;
    }

    public void setGocbCollection(Collection<Gocb> gocbCollection) {
        this.gocbCollection = gocbCollection;
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
        hash += (datasetId != null ? datasetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dataset)) {
            return false;
        }
        Dataset other = (Dataset) object;
        if ((this.datasetId == null && other.datasetId != null) || (this.datasetId != null && !this.datasetId.equals(other.datasetId))) {
            return false;
        }
        return true;
    }

    
}
