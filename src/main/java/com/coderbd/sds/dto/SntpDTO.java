package com.coderbd.sds.dto;

import com.coderbd.sds.entity.nmsConfig.EthernetSwitch;
import com.coderbd.sds.entity.nmsConfig.Sntp;

import javax.persistence.Basic;
import javax.persistence.FetchType;
import java.util.List;

public class SntpDTO {
    private String sntpName;
    @Basic(fetch= FetchType.EAGER)
    private  List<Sntp>  ipAddresList;

    public SntpDTO() {
    }

    public SntpDTO(String sntpName, List<Sntp> ipAddresList) {
        this.sntpName = sntpName;
        this.ipAddresList = ipAddresList;
    }

    public String getSntpName() {
        return sntpName;
    }

    public void setSntpName(String sntpName) {
        this.sntpName = sntpName;
    }

    public List<Sntp> getIpAddresList() {
        return ipAddresList;
    }

    public void setIpAddresList(List<Sntp> ipAddresList) {
        this.ipAddresList = ipAddresList;
    }
}
