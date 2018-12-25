/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.sds.entity.gr;

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
@Table(name = "goose_runtime")
public class GooseRuntime implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "ied_name")
    private String iedName;
    @Basic(optional = false)
    @Column(name = "status")
    private int status;
    @Basic(optional = false)
    @Column(name = "mac")
    private String mac;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private String timestamp;
    @Basic(optional = false)
    @Column(name = "dataset")
    private String dataset;
    @Basic(optional = false)
    @Column(name = "goid")
    private String goid;
    @Basic(optional = false)
    @Column(name = "st_num")
    private int stNum;
    @Basic(optional = false)
    @Column(name = "sq_num")
    private int sqNum;
    @Basic(optional = false)
    @Column(name = "rev")
    private int rev;
    @Basic(optional = false)
    @Column(name = "min_process")
    private int minProcess;
    @Basic(optional = false)
    @Column(name = "max_process")
    private int maxProcess;
    @Basic(optional = false)
    @Column(name = "avg_process")
    private int avgProcess;
    @Basic(optional = false)
    @Column(name = "max_interval")
    private int maxInterval;
    @Basic(optional = false)
    @Column(name = "min_delay")
    private int minDelay;
    @Basic(optional = false)
    @Column(name = "max_delay")
    private int maxDelay;
    @Basic(optional = false)
    @Column(name = "avg_delay")
    private int avgDelay;
    @Basic(optional = false)
    @Column(name = "fail_cnt")
    private int failCnt;
    @Basic(optional = false)
    @Column(name = "delay1_cnt")
    private int delay1Cnt;
    @Basic(optional = false)
    @Column(name = "delay2_cnt")
    private int delay2Cnt;

    public GooseRuntime() {
    }

    public GooseRuntime(Integer id) {
        this.id = id;
    }

    public GooseRuntime(Integer id, String iedName, int status, String mac, String address, String timestamp, String dataset, String goid, int stNum, int sqNum, int rev, int minProcess, int maxProcess, int avgProcess, int maxInterval, int minDelay, int maxDelay, int avgDelay, int failCnt, int delay1Cnt, int delay2Cnt) {
        this.id = id;
        this.iedName = iedName;
        this.status = status;
        this.mac = mac;
        this.address = address;
        this.timestamp = timestamp;
        this.dataset = dataset;
        this.goid = goid;
        this.stNum = stNum;
        this.sqNum = sqNum;
        this.rev = rev;
        this.minProcess = minProcess;
        this.maxProcess = maxProcess;
        this.avgProcess = avgProcess;
        this.maxInterval = maxInterval;
        this.minDelay = minDelay;
        this.maxDelay = maxDelay;
        this.avgDelay = avgDelay;
        this.failCnt = failCnt;
        this.delay1Cnt = delay1Cnt;
        this.delay2Cnt = delay2Cnt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIedName() {
        return iedName;
    }

    public void setIedName(String iedName) {
        this.iedName = iedName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getDataset() {
        return dataset;
    }

    public void setDataset(String dataset) {
        this.dataset = dataset;
    }

    public String getGoid() {
        return goid;
    }

    public void setGoid(String goid) {
        this.goid = goid;
    }

    public int getStNum() {
        return stNum;
    }

    public void setStNum(int stNum) {
        this.stNum = stNum;
    }

    public int getSqNum() {
        return sqNum;
    }

    public void setSqNum(int sqNum) {
        this.sqNum = sqNum;
    }

    public int getRev() {
        return rev;
    }

    public void setRev(int rev) {
        this.rev = rev;
    }

    public int getMinProcess() {
        return minProcess;
    }

    public void setMinProcess(int minProcess) {
        this.minProcess = minProcess;
    }

    public int getMaxProcess() {
        return maxProcess;
    }

    public void setMaxProcess(int maxProcess) {
        this.maxProcess = maxProcess;
    }

    public int getAvgProcess() {
        return avgProcess;
    }

    public void setAvgProcess(int avgProcess) {
        this.avgProcess = avgProcess;
    }

    public int getMaxInterval() {
        return maxInterval;
    }

    public void setMaxInterval(int maxInterval) {
        this.maxInterval = maxInterval;
    }

    public int getMinDelay() {
        return minDelay;
    }

    public void setMinDelay(int minDelay) {
        this.minDelay = minDelay;
    }

    public int getMaxDelay() {
        return maxDelay;
    }

    public void setMaxDelay(int maxDelay) {
        this.maxDelay = maxDelay;
    }

    public int getAvgDelay() {
        return avgDelay;
    }

    public void setAvgDelay(int avgDelay) {
        this.avgDelay = avgDelay;
    }

    public int getFailCnt() {
        return failCnt;
    }

    public void setFailCnt(int failCnt) {
        this.failCnt = failCnt;
    }

    public int getDelay1Cnt() {
        return delay1Cnt;
    }

    public void setDelay1Cnt(int delay1Cnt) {
        this.delay1Cnt = delay1Cnt;
    }

    public int getDelay2Cnt() {
        return delay2Cnt;
    }

    public void setDelay2Cnt(int delay2Cnt) {
        this.delay2Cnt = delay2Cnt;
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
        if (!(object instanceof GooseRuntime)) {
            return false;
        }
        GooseRuntime other = (GooseRuntime) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.coderbd.gr.GooseRuntime[ id=" + id + " ]";
    }
    
}
