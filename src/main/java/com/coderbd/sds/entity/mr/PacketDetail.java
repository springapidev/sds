/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.sds.entity.mr;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Rajaul Islam
 */
@Entity
@Table(name = "packet_detail")
public class PacketDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "recv_sec")
    private int recvSec;
    @Basic(optional = false)
    @Column(name = "recv_msec")
    private int recvMsec;
    @Basic(optional = false)
    @Column(name = "src_name")
    private String srcName;
    @Basic(optional = false)
    @Column(name = "src_addr")
    private String srcAddr;
    @Basic(optional = false)
    @Column(name = "src_port")
    private int srcPort;
    @Basic(optional = false)
    @Column(name = "dst_name")
    private String dstName;
    @Basic(optional = false)
    @Column(name = "dst_addr")
    private String dstAddr;
    @Basic(optional = false)
    @Column(name = "dst_port")
    private int dstPort;
    @Basic(optional = false)
    @Column(name = "protocol")
    private int protocol;
    @Basic(optional = false)
    @Column(name = "service")
    private int service;
    @Column(name = "option")
    private Integer option;
    @Column(name = "cb_addr")
    private String cbAddr;
    @Column(name = "detail")
    private String detail;

    public PacketDetail() {
    }

    public PacketDetail(Integer id) {
        this.id = id;
    }

    public PacketDetail(Integer id, int recvSec, int recvMsec, String srcName, String srcAddr, int srcPort, String dstName, String dstAddr, int dstPort, int protocol, int service) {
        this.id = id;
        this.recvSec = recvSec;
        this.recvMsec = recvMsec;
        this.srcName = srcName;
        this.srcAddr = srcAddr;
        this.srcPort = srcPort;
        this.dstName = dstName;
        this.dstAddr = dstAddr;
        this.dstPort = dstPort;
        this.protocol = protocol;
        this.service = service;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getRecvSec() {
        return recvSec;
    }

    public void setRecvSec(int recvSec) {
        this.recvSec = recvSec;
    }

    public int getRecvMsec() {
        return recvMsec;
    }

    public void setRecvMsec(int recvMsec) {
        this.recvMsec = recvMsec;
    }

    public String getSrcName() {
        return srcName;
    }

    public void setSrcName(String srcName) {
        this.srcName = srcName;
    }

    public String getSrcAddr() {
        return srcAddr;
    }

    public void setSrcAddr(String srcAddr) {
        this.srcAddr = srcAddr;
    }

    public int getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(int srcPort) {
        this.srcPort = srcPort;
    }

    public String getDstName() {
        return dstName;
    }

    public void setDstName(String dstName) {
        this.dstName = dstName;
    }

    public String getDstAddr() {
        return dstAddr;
    }

    public void setDstAddr(String dstAddr) {
        this.dstAddr = dstAddr;
    }

    public int getDstPort() {
        return dstPort;
    }

    public void setDstPort(int dstPort) {
        this.dstPort = dstPort;
    }

    public int getProtocol() {
        return protocol;
    }

    public void setProtocol(int protocol) {
        this.protocol = protocol;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public Integer getOption() {
        return option;
    }

    public void setOption(Integer option) {
        this.option = option;
    }

    public String getCbAddr() {
        return cbAddr;
    }

    public void setCbAddr(String cbAddr) {
        this.cbAddr = cbAddr;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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
        if (!(object instanceof PacketDetail)) {
            return false;
        }
        PacketDetail other = (PacketDetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }


}
