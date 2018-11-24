package com.coderbd.sds.entity.nmsConfig;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;

@Entity
@Table(name = "device")
public class Device implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "d_type")
    private int type;


    @Column(name = "d_name")
    private String name;


    @Column(name = "d_ip")
    private String ip;

    @Column(name = "d_mac")
    private String mac;


    @Column(name = "d_ignore")
    private int ignore;

    @Column(name = "scl_file_name")
    private String sclFileName;

    @Column(name = "scl_file")
    private String sclFile;

    @Column(name = "iet_file_name")
    private String ietFileName;

    @Column(name = "iet_file")
    private String ietFile;


    @Column(name = "d_port")
    private int port;



    @Column(name = "d_community")
    private String community;


    @Column(name = "d_version")
    private int version;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deviceId")
    private Collection<Data> dataCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deviceId")
    private Collection<DatasetMember> datasetMemberCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deviceId")
    private Collection<ProcValidationResult> procValidationResultCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deviceId")
    private Collection<Rcb> rcbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deviceId")
    private Collection<Port> portCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deviceId")
    private Collection<Gocb> gocbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deviceId")
    private Collection<Tag> tagCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deviceId")
    private Collection<Dataset> datasetCollection;

    public Device() {
    }

    public Device(Integer id) {
        this.id = id;
    }

    public Device(Integer id, int type, String name, String ip, int ignore, int port, String community, int version) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.ip = ip;
        this.ignore = ignore;
        this.port = port;
        this.community = community;
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getIgnore() {
        return ignore;
    }

    public void setIgnore(int ignore) {
        this.ignore = ignore;
    }

    public String getSclFileName() {
        return sclFileName;
    }

    public void setSclFileName(String sclFileName) {
        this.sclFileName = sclFileName;
    }

    public String getSclFile() {
        return sclFile;
    }

    public void setSclFile(String sclFile) {
        this.sclFile = sclFile;
    }

    public String getIetFileName() {
        return ietFileName;
    }

    public void setIetFileName(String ietFileName) {
        this.ietFileName = ietFileName;
    }

    public String getIetFile() {
        return ietFile;
    }

    public void setIetFile(String ietFile) {
        this.ietFile = ietFile;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
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
        if (!(object instanceof Device)) {
            return false;
        }
        Device other = (Device) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", ip='" + ip + '\'' +
                ", mac='" + mac + '\'' +
                ", ignore=" + ignore +
                ", sclFileName='" + sclFileName + '\'' +
                ", sclFile='" + sclFile + '\'' +
                ", ietFileName='" + ietFileName + '\'' +
                ", ietFile='" + ietFile + '\'' +
                ", port=" + port +
                ", community='" + community + '\'' +
                ", version=" + version +
                '}';
    }
}
