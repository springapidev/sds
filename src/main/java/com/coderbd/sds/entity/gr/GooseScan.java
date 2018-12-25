package com.coderbd.sds.entity.gr;

import javax.persistence.*;

@Entity
@Table(name = "goose_scan")
public class GooseScan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "ied_name", nullable = false)
    private String iedMame;

    @Column(name = "status", nullable = false)
    private int status;
    @Column(name = "mac", nullable = false)
    private String mac;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "goid", nullable = false)
    private String goId;
    @Column(name = "dataset", nullable = false)
    private String dataSet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIedMame() {
        return iedMame;
    }

    public void setIedMame(String iedMame) {
        this.iedMame = iedMame;
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

    public String getGoId() {
        return goId;
    }

    public void setGoId(String goId) {
        this.goId = goId;
    }

    public String getDataSet() {
        return dataSet;
    }

    public void setDataSet(String dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public String toString() {
        return "GooseScan{" +
                "id=" + id +
                ", iedMame='" + iedMame + '\'' +
                ", status=" + status +
                ", mac='" + mac + '\'' +
                ", address='" + address + '\'' +
                ", goId='" + goId + '\'' +
                ", dataSet='" + dataSet + '\'' +
                '}';
    }
}
