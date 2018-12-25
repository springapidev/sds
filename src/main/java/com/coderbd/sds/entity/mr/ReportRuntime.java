package com.coderbd.sds.entity.mr;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author Rajaul Islam
 */
@Entity
@Table(name = "report_format")
public class ReportRuntime implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;


    @Basic(optional = false)
    @Column(name = "ied")
    private String ied;

    @Basic(optional = false)
    @Column(name = "client")
    private String client;

    @Basic(optional = false)
    @Column(name = "rpt_id")
    private String rptId;


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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIed() {
        return ied;
    }

    public void setIed(String ied) {
        this.ied = ied;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getRptId() {
        return rptId;
    }

    public void setRptId(String rptId) {
        this.rptId = rptId;
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
}
