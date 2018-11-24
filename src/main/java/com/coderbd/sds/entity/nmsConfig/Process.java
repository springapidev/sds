package com.coderbd.sds.entity.nmsConfig;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author User
 */
@Entity
@Table(name = "process")
public class Process implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "p_name")
    private String name;
    @Basic(optional = false)
    @Column(name = "p_folder")
    private String folder;
    @Basic(optional = false)
    @Column(name = "p_desc")
    private String desc;
    @Column(name = "p_param")
    private String param;
    @Column(name = "p_pid")
    private Integer pid;
    @Basic(optional = false)
    @Column(name = "p_count")
    private int count;
    @Basic(optional = false)
    @Column(name = "p_status")
    private int status;
    @Basic(optional = false)
    @Column(name = "p_type")
    private int type;

    public Process() {
    }

    public Process(Integer id) {
        this.id = id;
    }

    public Process(Integer id, String name, String folder, String desc, int count, int status, int type) {
        this.id = id;
        this.name = name;
        this.folder = folder;
        this.desc = desc;
        this.count = count;
        this.status = status;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
        if (!(object instanceof Process)) {
            return false;
        }
        Process other = (Process) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }


}
