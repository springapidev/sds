package com.coderbd.sds.repo;

import com.coderbd.sds.entity.nmsConfig.Device;
import com.coderbd.sds.entity.nmsConfig.EthernetSwitch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface EthernetSwitchRepo extends JpaRepository<EthernetSwitch, Long> {
    List<EthernetSwitch> findAllByDevice(Device device);
}
