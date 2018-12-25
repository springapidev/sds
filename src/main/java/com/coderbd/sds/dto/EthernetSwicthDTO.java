package com.coderbd.sds.dto;

import com.coderbd.sds.entity.nmsConfig.EthernetSwitch;

import javax.persistence.Basic;
import javax.persistence.FetchType;
import java.util.List;
import java.util.Set;

public class EthernetSwicthDTO {
    private String switchName;
    @Basic(fetch= FetchType.EAGER)
    private  List<EthernetSwitch>  ipAddresList;

    public EthernetSwicthDTO() {
    }

    public EthernetSwicthDTO(String switchName) {
        this.switchName = switchName;
    }

    public EthernetSwicthDTO(String switchName, List<EthernetSwitch> ipAddresList) {
        this.switchName = switchName;
        this.ipAddresList = ipAddresList;
    }

    public String getSwitchName() {
        return switchName;
    }

    public void setSwitchName(String switchName) {
        this.switchName = switchName;
    }

    public List<EthernetSwitch> getIpAddresList() {
        return ipAddresList;
    }

    public void setIpAddresList(List<EthernetSwitch> ipAddresList) {
        this.ipAddresList = ipAddresList;
    }
}
