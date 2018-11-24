/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.sds.entity.nmsConfig;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author User
 */
@Entity
@Table(name = "rcb")
public class Rcb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rcb_id")
    private Integer rcbId;
    @Basic(optional = false)
    private String address;
    @Column(name = "dataset_address")
    private String datasetAddress;
    @Basic(optional = false)
    private String rptid;
    @Basic(optional = false)
    private int buffered;
    @Basic(optional = false)
    private int buftm;
    @Basic(optional = false)
    private int intgpd;
    @Basic(optional = false)
    @Column(name = "trgop_dchg")
    private int trgopDchg;
    @Basic(optional = false)
    @Column(name = "trgop_qchg")
    private int trgopQchg;
    @Basic(optional = false)
    @Column(name = "trgop_dupd")
    private int trgopDupd;
    @Basic(optional = false)
    @Column(name = "trgop_intpd")
    private int trgopIntpd;
    @Basic(optional = false)
    @Column(name = "trgop_gi")
    private int trgopGi;
    @Basic(optional = false)
    @Column(name = "optflds_seqn")
    private int optfldsSeqn;
    @Basic(optional = false)
    @Column(name = "optflds_timestamp")
    private int optfldsTimestamp;
    @Basic(optional = false)
    @Column(name = "optflds_dataset")
    private int optfldsDataset;
    @Basic(optional = false)
    @Column(name = "optflds_reason")
    private int optfldsReason;
    @Basic(optional = false)
    @Column(name = "optflds_dataref")
    private int optfldsDataref;
    @Basic(optional = false)
    @Column(name = "optflds_bufovf")
    private int optfldsBufovf;
    @Basic(optional = false)
    @Column(name = "optflds_entryid")
    private int optfldsEntryid;
    @Basic(optional = false)
    @Column(name = "optflds_confrev")
    private int optfldsConfrev;
    @Basic(optional = false)
    @Column(name = "optflds_segmentation")
    private int optfldsSegmentation;
    @JoinColumn(name = "dataset_id", referencedColumnName = "dataset_id")
    @ManyToOne
    private Dataset datasetId;
    @JoinColumn(name = "device_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Device deviceId;

    public Rcb() {
    }

    public Rcb(Integer rcbId) {
        this.rcbId = rcbId;
    }

    public Rcb(Integer rcbId, String address, String rptid, int buffered, int buftm, int intgpd, int trgopDchg, int trgopQchg, int trgopDupd, int trgopIntpd, int trgopGi, int optfldsSeqn, int optfldsTimestamp, int optfldsDataset, int optfldsReason, int optfldsDataref, int optfldsBufovf, int optfldsEntryid, int optfldsConfrev, int optfldsSegmentation) {
        this.rcbId = rcbId;
        this.address = address;
        this.rptid = rptid;
        this.buffered = buffered;
        this.buftm = buftm;
        this.intgpd = intgpd;
        this.trgopDchg = trgopDchg;
        this.trgopQchg = trgopQchg;
        this.trgopDupd = trgopDupd;
        this.trgopIntpd = trgopIntpd;
        this.trgopGi = trgopGi;
        this.optfldsSeqn = optfldsSeqn;
        this.optfldsTimestamp = optfldsTimestamp;
        this.optfldsDataset = optfldsDataset;
        this.optfldsReason = optfldsReason;
        this.optfldsDataref = optfldsDataref;
        this.optfldsBufovf = optfldsBufovf;
        this.optfldsEntryid = optfldsEntryid;
        this.optfldsConfrev = optfldsConfrev;
        this.optfldsSegmentation = optfldsSegmentation;
    }

    public Integer getRcbId() {
        return rcbId;
    }

    public void setRcbId(Integer rcbId) {
        this.rcbId = rcbId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDatasetAddress() {
        return datasetAddress;
    }

    public void setDatasetAddress(String datasetAddress) {
        this.datasetAddress = datasetAddress;
    }

    public String getRptid() {
        return rptid;
    }

    public void setRptid(String rptid) {
        this.rptid = rptid;
    }

    public int getBuffered() {
        return buffered;
    }

    public void setBuffered(int buffered) {
        this.buffered = buffered;
    }

    public int getBuftm() {
        return buftm;
    }

    public void setBuftm(int buftm) {
        this.buftm = buftm;
    }

    public int getIntgpd() {
        return intgpd;
    }

    public void setIntgpd(int intgpd) {
        this.intgpd = intgpd;
    }

    public int getTrgopDchg() {
        return trgopDchg;
    }

    public void setTrgopDchg(int trgopDchg) {
        this.trgopDchg = trgopDchg;
    }

    public int getTrgopQchg() {
        return trgopQchg;
    }

    public void setTrgopQchg(int trgopQchg) {
        this.trgopQchg = trgopQchg;
    }

    public int getTrgopDupd() {
        return trgopDupd;
    }

    public void setTrgopDupd(int trgopDupd) {
        this.trgopDupd = trgopDupd;
    }

    public int getTrgopIntpd() {
        return trgopIntpd;
    }

    public void setTrgopIntpd(int trgopIntpd) {
        this.trgopIntpd = trgopIntpd;
    }

    public int getTrgopGi() {
        return trgopGi;
    }

    public void setTrgopGi(int trgopGi) {
        this.trgopGi = trgopGi;
    }

    public int getOptfldsSeqn() {
        return optfldsSeqn;
    }

    public void setOptfldsSeqn(int optfldsSeqn) {
        this.optfldsSeqn = optfldsSeqn;
    }

    public int getOptfldsTimestamp() {
        return optfldsTimestamp;
    }

    public void setOptfldsTimestamp(int optfldsTimestamp) {
        this.optfldsTimestamp = optfldsTimestamp;
    }

    public int getOptfldsDataset() {
        return optfldsDataset;
    }

    public void setOptfldsDataset(int optfldsDataset) {
        this.optfldsDataset = optfldsDataset;
    }

    public int getOptfldsReason() {
        return optfldsReason;
    }

    public void setOptfldsReason(int optfldsReason) {
        this.optfldsReason = optfldsReason;
    }

    public int getOptfldsDataref() {
        return optfldsDataref;
    }

    public void setOptfldsDataref(int optfldsDataref) {
        this.optfldsDataref = optfldsDataref;
    }

    public int getOptfldsBufovf() {
        return optfldsBufovf;
    }

    public void setOptfldsBufovf(int optfldsBufovf) {
        this.optfldsBufovf = optfldsBufovf;
    }

    public int getOptfldsEntryid() {
        return optfldsEntryid;
    }

    public void setOptfldsEntryid(int optfldsEntryid) {
        this.optfldsEntryid = optfldsEntryid;
    }

    public int getOptfldsConfrev() {
        return optfldsConfrev;
    }

    public void setOptfldsConfrev(int optfldsConfrev) {
        this.optfldsConfrev = optfldsConfrev;
    }

    public int getOptfldsSegmentation() {
        return optfldsSegmentation;
    }

    public void setOptfldsSegmentation(int optfldsSegmentation) {
        this.optfldsSegmentation = optfldsSegmentation;
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
        hash += (rcbId != null ? rcbId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rcb)) {
            return false;
        }
        Rcb other = (Rcb) object;
        if ((this.rcbId == null && other.rcbId != null) || (this.rcbId != null && !this.rcbId.equals(other.rcbId))) {
            return false;
        }
        return true;
    }


}
