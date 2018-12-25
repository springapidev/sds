package com.coderbd.sds.dto;

import com.coderbd.sds.entity.nmsConfig.EthernetSwitch;
import com.coderbd.sds.entity.nmsConfig.SaParent;

import javax.persistence.Basic;
import javax.persistence.FetchType;
import java.util.List;

public class SaParentDTO {
    private String saParentName;
    @Basic(fetch= FetchType.EAGER)
    private  List<SaParent>  ipAddresList;

    public SaParentDTO() {
    }

    public SaParentDTO(String saParentName, List<SaParent> ipAddresList) {
        this.saParentName = saParentName;
        this.ipAddresList = ipAddresList;
    }

    public String getSaParentName() {
        return saParentName;
    }

    public void setSaParentName(String saParentName) {
        this.saParentName = saParentName;
    }

    public List<SaParent> getIpAddresList() {
        return ipAddresList;
    }

    public void setIpAddresList(List<SaParent> ipAddresList) {
        this.ipAddresList = ipAddresList;
    }
}
