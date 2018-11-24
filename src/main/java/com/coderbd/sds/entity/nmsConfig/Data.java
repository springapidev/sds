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
@Table(name = "data")
public class Data implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "data_id")
    private Integer dataId;
    @Basic(optional = false)
    private String address;
    @Basic(optional = false)
    private String scope;
    private String type;
    @Column(name = "type_len")
    private Integer typeLen;
    @JoinColumn(name = "device_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Device deviceId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dataId")
    private Collection<Tag> tagCollection;

    public Data() {
    }

    public Data(Integer dataId) {
        this.dataId = dataId;
    }

    public Data(Integer dataId, String address, String scope) {
        this.dataId = dataId;
        this.address = address;
        this.scope = scope;
    }

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTypeLen() {
        return typeLen;
    }

    public void setTypeLen(Integer typeLen) {
        this.typeLen = typeLen;
    }

    public Device getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Device deviceId) {
        this.deviceId = deviceId;
    }

    public Collection<Tag> getTagCollection() {
        return tagCollection;
    }

    public void setTagCollection(Collection<Tag> tagCollection) {
        this.tagCollection = tagCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataId != null ? dataId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data)) {
            return false;
        }
        Data other = (Data) object;
        if ((this.dataId == null && other.dataId != null) || (this.dataId != null && !this.dataId.equals(other.dataId))) {
            return false;
        }
        return true;
    }

    
}
