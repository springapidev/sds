package com.coderbd.sds.entity.mr;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Rajaul Islam
 */
@Entity
@Table(name = "mms_event")
public class MmsEvent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @Column(name = "src_name", nullable = false)
    private String srcName;

    @Column(name = "ied_name", nullable = false)
    private String iedName;

    @Column(name = "dst_name", nullable = false)
    private String dstName;

    @Column(name = "status", nullable = false)
    private int status;

    @Column(name = "extra_info", nullable = false)
    private int extraInfo;

    private String address;
    private String value;

    @Column(name = "packet", nullable = false)
    private byte[] packet;

    @Column(name = "packet_len", nullable = false)
    private int packetLen;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getSrcName() {
        return srcName;
    }

    public void setSrcName(String srcName) {
        this.srcName = srcName;
    }

    public String getIedName() {
        return iedName;
    }

    public void setIedName(String iedName) {
        this.iedName = iedName;
    }

    public String getDstName() {
        return dstName;
    }

    public void setDstName(String dstName) {
        this.dstName = dstName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(int extraInfo) {
        this.extraInfo = extraInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public byte[] getPacket() {
        return packet;
    }

    public void setPacket(byte[] packet) {
        this.packet = packet;
    }

    public int getPacketLen() {
        return packetLen;
    }

    public void setPacketLen(int packetLen) {
        this.packetLen = packetLen;
    }


}
