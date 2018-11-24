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
@Table(name = "setting")
public class Setting implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "parser_packet_unit")
    private int parserPacketUnit;
    @Basic(optional = false)
    @Column(name = "parser_dump_limit")
    private int parserDumpLimit;
    @Basic(optional = false)
    @Column(name = "storage_packet_unit")
    private int storagePacketUnit;
    @Basic(optional = false)
    @Column(name = "storage_dump_limit")
    private int storageDumpLimit;
    @Basic(optional = false)
    @Column(name = "storage_format")
    private int storageFormat;
    @Basic(optional = false)
    @Column(name = "output_root")
    private String outputRoot;
    @Basic(optional = false)
    @Column(name = "decision_interval")
    private int decisionInterval;
    @Basic(optional = false)
    @Column(name = "alive_limit")
    private int aliveLimit;
    @Basic(optional = false)
    @Column(name = "ntp_server")
    private String ntpServer;
    @Basic(optional = false)
    @Column(name = "ntp_period")
    private int ntpPeriod;
    @Basic(optional = false)
    @Column(name = "rawpacket_max_limit")
    private int rawpacketMaxLimit;
    @Basic(optional = false)
    @Column(name = "hdd_limit")
    private int hddLimit;
    @Basic(optional = false)
    @Column(name = "hdd_delete_size")
    private int hddDeleteSize;
    @Basic(optional = false)
    @Column(name = "mms_fail_timeout")
    private int mmsFailTimeout;
    @Basic(optional = false)
    @Column(name = "report_fail_factor")
    private int reportFailFactor;
    @Basic(optional = false)
    @Column(name = "report_time_allowed")
    private int reportTimeAllowed;
    @Basic(optional = false)
    @Column(name = "goose_fail_factor")
    private int gooseFailFactor;
    @Basic(optional = false)
    @Column(name = "goose_delay_factor1")
    private int gooseDelayFactor1;
    @Basic(optional = false)
    @Column(name = "goose_delay_factor2")
    private int gooseDelayFactor2;
    @Basic(optional = false)
    @Column(name = "goose_avg_count")
    private int gooseAvgCount;
    @Basic(optional = false)
    @Column(name = "report_scan_max")
    private int reportScanMax;
    @Basic(optional = false)
    @Column(name = "iec61850_server_nic")
    private String iec61850ServerNic;
    @Basic(optional = false)
    @Column(name = "iec61850_server_scl")
    private String iec61850ServerScl;
    @Basic(optional = false)
    @Column(name = "time_complement")
    private int timeComplement;
    @Basic(optional = false)
    @Column(name = "sheet_name")
    private String sheetName;
    @Basic(optional = false)
    @Column(name = "start_row_index")
    private int startRowIndex;
    @Basic(optional = false)
    @Column(name = "prefix_column_index")
    private int prefixColumnIndex;
    @Basic(optional = false)
    @Column(name = "name_column_index")
    private int nameColumnIndex;
    @Basic(optional = false)
    @Column(name = "signal_column_index")
    private int signalColumnIndex;
    @Basic(optional = false)
    @Column(name = "debug_mode")
    private int debugMode;
    @Basic(optional = false)
    @Column(name = "db_store_period")
    private int dbStorePeriod;

    public Setting() {
    }

    public Setting(Integer id) {
        this.id = id;
    }

    public Setting(Integer id, int parserPacketUnit, int parserDumpLimit, int storagePacketUnit, int storageDumpLimit, int storageFormat, String outputRoot, int decisionInterval, int aliveLimit, String ntpServer, int ntpPeriod, int rawpacketMaxLimit, int hddLimit, int hddDeleteSize, int mmsFailTimeout, int reportFailFactor, int reportTimeAllowed, int gooseFailFactor, int gooseDelayFactor1, int gooseDelayFactor2, int gooseAvgCount, int reportScanMax, String iec61850ServerNic, String iec61850ServerScl, int timeComplement, String sheetName, int startRowIndex, int prefixColumnIndex, int nameColumnIndex, int signalColumnIndex, int debugMode, int dbStorePeriod) {
        this.id = id;
        this.parserPacketUnit = parserPacketUnit;
        this.parserDumpLimit = parserDumpLimit;
        this.storagePacketUnit = storagePacketUnit;
        this.storageDumpLimit = storageDumpLimit;
        this.storageFormat = storageFormat;
        this.outputRoot = outputRoot;
        this.decisionInterval = decisionInterval;
        this.aliveLimit = aliveLimit;
        this.ntpServer = ntpServer;
        this.ntpPeriod = ntpPeriod;
        this.rawpacketMaxLimit = rawpacketMaxLimit;
        this.hddLimit = hddLimit;
        this.hddDeleteSize = hddDeleteSize;
        this.mmsFailTimeout = mmsFailTimeout;
        this.reportFailFactor = reportFailFactor;
        this.reportTimeAllowed = reportTimeAllowed;
        this.gooseFailFactor = gooseFailFactor;
        this.gooseDelayFactor1 = gooseDelayFactor1;
        this.gooseDelayFactor2 = gooseDelayFactor2;
        this.gooseAvgCount = gooseAvgCount;
        this.reportScanMax = reportScanMax;
        this.iec61850ServerNic = iec61850ServerNic;
        this.iec61850ServerScl = iec61850ServerScl;
        this.timeComplement = timeComplement;
        this.sheetName = sheetName;
        this.startRowIndex = startRowIndex;
        this.prefixColumnIndex = prefixColumnIndex;
        this.nameColumnIndex = nameColumnIndex;
        this.signalColumnIndex = signalColumnIndex;
        this.debugMode = debugMode;
        this.dbStorePeriod = dbStorePeriod;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getParserPacketUnit() {
        return parserPacketUnit;
    }

    public void setParserPacketUnit(int parserPacketUnit) {
        this.parserPacketUnit = parserPacketUnit;
    }

    public int getParserDumpLimit() {
        return parserDumpLimit;
    }

    public void setParserDumpLimit(int parserDumpLimit) {
        this.parserDumpLimit = parserDumpLimit;
    }

    public int getStoragePacketUnit() {
        return storagePacketUnit;
    }

    public void setStoragePacketUnit(int storagePacketUnit) {
        this.storagePacketUnit = storagePacketUnit;
    }

    public int getStorageDumpLimit() {
        return storageDumpLimit;
    }

    public void setStorageDumpLimit(int storageDumpLimit) {
        this.storageDumpLimit = storageDumpLimit;
    }

    public int getStorageFormat() {
        return storageFormat;
    }

    public void setStorageFormat(int storageFormat) {
        this.storageFormat = storageFormat;
    }

    public String getOutputRoot() {
        return outputRoot;
    }

    public void setOutputRoot(String outputRoot) {
        this.outputRoot = outputRoot;
    }

    public int getDecisionInterval() {
        return decisionInterval;
    }

    public void setDecisionInterval(int decisionInterval) {
        this.decisionInterval = decisionInterval;
    }

    public int getAliveLimit() {
        return aliveLimit;
    }

    public void setAliveLimit(int aliveLimit) {
        this.aliveLimit = aliveLimit;
    }

    public String getNtpServer() {
        return ntpServer;
    }

    public void setNtpServer(String ntpServer) {
        this.ntpServer = ntpServer;
    }

    public int getNtpPeriod() {
        return ntpPeriod;
    }

    public void setNtpPeriod(int ntpPeriod) {
        this.ntpPeriod = ntpPeriod;
    }

    public int getRawpacketMaxLimit() {
        return rawpacketMaxLimit;
    }

    public void setRawpacketMaxLimit(int rawpacketMaxLimit) {
        this.rawpacketMaxLimit = rawpacketMaxLimit;
    }

    public int getHddLimit() {
        return hddLimit;
    }

    public void setHddLimit(int hddLimit) {
        this.hddLimit = hddLimit;
    }

    public int getHddDeleteSize() {
        return hddDeleteSize;
    }

    public void setHddDeleteSize(int hddDeleteSize) {
        this.hddDeleteSize = hddDeleteSize;
    }

    public int getMmsFailTimeout() {
        return mmsFailTimeout;
    }

    public void setMmsFailTimeout(int mmsFailTimeout) {
        this.mmsFailTimeout = mmsFailTimeout;
    }

    public int getReportFailFactor() {
        return reportFailFactor;
    }

    public void setReportFailFactor(int reportFailFactor) {
        this.reportFailFactor = reportFailFactor;
    }

    public int getReportTimeAllowed() {
        return reportTimeAllowed;
    }

    public void setReportTimeAllowed(int reportTimeAllowed) {
        this.reportTimeAllowed = reportTimeAllowed;
    }

    public int getGooseFailFactor() {
        return gooseFailFactor;
    }

    public void setGooseFailFactor(int gooseFailFactor) {
        this.gooseFailFactor = gooseFailFactor;
    }

    public int getGooseDelayFactor1() {
        return gooseDelayFactor1;
    }

    public void setGooseDelayFactor1(int gooseDelayFactor1) {
        this.gooseDelayFactor1 = gooseDelayFactor1;
    }

    public int getGooseDelayFactor2() {
        return gooseDelayFactor2;
    }

    public void setGooseDelayFactor2(int gooseDelayFactor2) {
        this.gooseDelayFactor2 = gooseDelayFactor2;
    }

    public int getGooseAvgCount() {
        return gooseAvgCount;
    }

    public void setGooseAvgCount(int gooseAvgCount) {
        this.gooseAvgCount = gooseAvgCount;
    }

    public int getReportScanMax() {
        return reportScanMax;
    }

    public void setReportScanMax(int reportScanMax) {
        this.reportScanMax = reportScanMax;
    }

    public String getIec61850ServerNic() {
        return iec61850ServerNic;
    }

    public void setIec61850ServerNic(String iec61850ServerNic) {
        this.iec61850ServerNic = iec61850ServerNic;
    }

    public String getIec61850ServerScl() {
        return iec61850ServerScl;
    }

    public void setIec61850ServerScl(String iec61850ServerScl) {
        this.iec61850ServerScl = iec61850ServerScl;
    }

    public int getTimeComplement() {
        return timeComplement;
    }

    public void setTimeComplement(int timeComplement) {
        this.timeComplement = timeComplement;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public int getStartRowIndex() {
        return startRowIndex;
    }

    public void setStartRowIndex(int startRowIndex) {
        this.startRowIndex = startRowIndex;
    }

    public int getPrefixColumnIndex() {
        return prefixColumnIndex;
    }

    public void setPrefixColumnIndex(int prefixColumnIndex) {
        this.prefixColumnIndex = prefixColumnIndex;
    }

    public int getNameColumnIndex() {
        return nameColumnIndex;
    }

    public void setNameColumnIndex(int nameColumnIndex) {
        this.nameColumnIndex = nameColumnIndex;
    }

    public int getSignalColumnIndex() {
        return signalColumnIndex;
    }

    public void setSignalColumnIndex(int signalColumnIndex) {
        this.signalColumnIndex = signalColumnIndex;
    }

    public int getDebugMode() {
        return debugMode;
    }

    public void setDebugMode(int debugMode) {
        this.debugMode = debugMode;
    }

    public int getDbStorePeriod() {
        return dbStorePeriod;
    }

    public void setDbStorePeriod(int dbStorePeriod) {
        this.dbStorePeriod = dbStorePeriod;
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
        if (!(object instanceof Setting)) {
            return false;
        }
        Setting other = (Setting) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }


}
