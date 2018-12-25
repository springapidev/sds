package com.coderbd.sds.entity.gr;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name = "goose_event")
public class GooseEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "recv_sec", nullable = false)
    private Long recvSec;
    @Column(name = "recv_msec", nullable = false)
    private Long recvMsec;

    @Column(name = "ied_name", nullable = false)
    private String iedName;
//Default 1
    @Column(name = "status", nullable = false)
    private int status;
    private String mac;
    private String address;
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;
    @Column(name = "process_time", nullable = false)
    private int processTime;
    @Column(name = "st_num", nullable = false)
    private int stNum;
    @Column(name = "sq_num", nullable = false)
    private int sqNum;
    @Column(name = "packet", nullable = false)
    private byte[] packet;
    @Column(name = "packet_len", nullable = false)
    private int packetLen;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRecvSec() {
        return recvSec;
    }

    public void setRecvSec(Long recvSec) {
        this.recvSec = recvSec;
    }

    public Long getRecvMsec() {
        return recvMsec;
    }

    public void setRecvMsec(Long recvMsec) {
        this.recvMsec = recvMsec;
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

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int getProcessTime() {
        return processTime;
    }

    public void setProcessTime(int processTime) {
        this.processTime = processTime;
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

    @Override
    public String toString() {
        return "GooseEvent{" +
                "id=" + id +
                ", recvSec=" + recvSec +
                ", recvMsec=" + recvMsec +
                ", iedName='" + iedName + '\'' +
                ", status=" + status +
                ", mac='" + mac + '\'' +
                ", address='" + address + '\'' +
                ", timestamp=" + timestamp +
                ", processTime=" + processTime +
                ", stNum=" + stNum +
                ", sqNum=" + sqNum +
                ", packet=" + Arrays.toString(packet) +
                ", packetLen=" + packetLen +
                '}';
    }
}
