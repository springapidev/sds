package com.coderbd.sds.repo;

import com.coderbd.sds.entity.nmsConfig.Device;
import com.coderbd.sds.entity.nmsConfig.EthernetSwitch;
import com.coderbd.sds.entity.nmsConfig.Sntp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SntpRepo extends JpaRepository<Sntp, Long> {
    List<Sntp> findAllByDevice(Device device);
}
