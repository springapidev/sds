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
@Table(name = "port")
public class Port implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @Basic(optional = false)
    private String address;
    @Basic(optional = false)
    private int value;
    @JoinColumn(name = "device_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Device deviceId;
    @OneToMany(mappedBy = "targetPortId")
    private Collection<Port> portCollection;
    @JoinColumn(name = "target_port_id", referencedColumnName = "id")
    @ManyToOne
    private Port targetPortId;

    public Port() {
    }

    public Port(Integer id) {
        this.id = id;
    }

    public Port(Integer id, String address, int value) {
        this.id = id;
        this.address = address;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Device getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Device deviceId) {
        this.deviceId = deviceId;
    }

    public Collection<Port> getPortCollection() {
        return portCollection;
    }

    public void setPortCollection(Collection<Port> portCollection) {
        this.portCollection = portCollection;
    }

    public Port getTargetPortId() {
        return targetPortId;
    }

    public void setTargetPortId(Port targetPortId) {
        this.targetPortId = targetPortId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Port)) {
            return false;
        }
        Port other = (Port) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
