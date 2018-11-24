package com.coderbd.sds.test;

import com.coderbd.sds.entity.nmsConfig.Device;
import com.coderbd.sds.repo.DeviceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sqlitetutorial.net
 */
@Controller
public class SQLiteJDBCDriverConnection {
    /**
     * Connect to a sample database
     */
    public static Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:D:/sqlite-boot/databasewithdata/nms_config.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

   static Connection conn = SQLiteJDBCDriverConnection.connect();

    @Autowired
    private DeviceRepo repo;

    public void insert() {
        List<Device> list=new ArrayList<>();
        String sql = "select * from device";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                /*
           CREATE TABLE [device]( [id]
            [type] INTEGER NOT NULL, [name] TEXT NOT NULL UNIQUE,
            [ip] TEXT NOT NULL, [mac] TEXT,
            [ignore] INTEGER NOT NULL DEFAULT 0,
            [scl_file_name] TEXT,
            [scl_file] BLOB,
            [iet_file_name] TEXT,
            [iet_file] BLOB,
            [port] INTEGER NOT NULL DEFAULT 161,
            [community] TEXT NOT NULL DEFAULT public,
            version] INTEGER NOT NULL DEFAULT 1)
                 */
                Device device = new Device();
                device.setId(rs.getInt(1));
                device.setType(rs.getInt(2));
                device.setIp(rs.getString(3));
                device.setMac(rs.getString(4));
                device.setIgnore(rs.getInt(5));
                device.setName(rs.getString(6));
                device.setSclFileName("");
                device.setSclFile("");
                device.setIetFileName("");
                device.setIetFile("");
                device.setPort(rs.getInt(11));
                device.setCommunity(rs.getString(12));
                device.setVersion(rs.getInt(13));
              //  System.out.println(device);
               list.add(device);

                System.out.println("...........Insert succes.........."+list.size());
            }
            repo.saveAll(list);

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SQLiteJDBCDriverConnection db=new SQLiteJDBCDriverConnection();
        db.insert();
    }
}