/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.sds.entity.mr;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author Rajail Islam
 */
@Entity
@Table(name = "report_runtime")
public class ReportFormat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "status")
    private int status;
    @Basic(optional = false)
    @Column(name = "rpt_id")
    private String rptId;
    @Basic(optional = false)
    @Column(name = "src")
    private String src;
    @Basic(optional = false)
    @Column(name = "dst")
    private String dst;
    @Column(name = "timestamp")
    private String timestamp;
    @Basic(optional = false)
    @Column(name = "rev")
    private int rev;
    @Basic(optional = false)
    @Column(name = "sq_num")
    private int sqNum;
    @Basic(optional = false)
    @Column(name = "total_cnt")
    private int totalCnt;
    @Basic(optional = false)
    @Column(name = "chg_cnt")
    private int chgCnt;
    @Basic(optional = false)
    @Column(name = "int_cnt")
    private int intCnt;
    @Basic(optional = false)
    @Column(name = "gi_cnt")
    private int giCnt;
    @Basic(optional = false)
    @Column(name = "delay")
    private int delay;
    @Basic(optional = false)
    @Column(name = "min_period")
    private int minPeriod;
    @Basic(optional = false)
    @Column(name = "max_period")
    private int maxPeriod;

    public ReportFormat() {
    }

    public ReportFormat(Integer id) {
        this.id = id;
    }

    public ReportFormat(Integer id, int status, String rptId, String src, String dst, int rev, int sqNum, int totalCnt, int chgCnt, int intCnt, int giCnt, int delay, int minPeriod, int maxPeriod) {
        this.id = id;
        this.status = status;
        this.rptId = rptId;
        this.src = src;
        this.dst = dst;
        this.rev = rev;
        this.sqNum = sqNum;
        this.totalCnt = totalCnt;
        this.chgCnt = chgCnt;
        this.intCnt = intCnt;
        this.giCnt = giCnt;
        this.delay = delay;
        this.minPeriod = minPeriod;
        this.maxPeriod = maxPeriod;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRptId() {
        return rptId;
    }

    public void setRptId(String rptId) {
        this.rptId = rptId;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDst() {
        return dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getRev() {
        return rev;
    }

    public void setRev(int rev) {
        this.rev = rev;
    }

    public int getSqNum() {
        return sqNum;
    }

    public void setSqNum(int sqNum) {
        this.sqNum = sqNum;
    }

    public int getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(int totalCnt) {
        this.totalCnt = totalCnt;
    }

    public int getChgCnt() {
        return chgCnt;
    }

    public void setChgCnt(int chgCnt) {
        this.chgCnt = chgCnt;
    }

    public int getIntCnt() {
        return intCnt;
    }

    public void setIntCnt(int intCnt) {
        this.intCnt = intCnt;
    }

    public int getGiCnt() {
        return giCnt;
    }

    public void setGiCnt(int giCnt) {
        this.giCnt = giCnt;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public int getMinPeriod() {
        return minPeriod;
    }

    public void setMinPeriod(int minPeriod) {
        this.minPeriod = minPeriod;
    }

    public int getMaxPeriod() {
        return maxPeriod;
    }

    public void setMaxPeriod(int maxPeriod) {
        this.maxPeriod = maxPeriod;
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
        if (!(object instanceof ReportFormat)) {
            return false;
        }
        ReportFormat other = (ReportFormat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
