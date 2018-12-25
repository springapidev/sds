package com.coderbd.sds.repo;

import com.coderbd.sds.entity.nmsConfig.Device;
import com.coderbd.sds.entity.nmsConfig.EthernetSwitch;
import com.coderbd.sds.entity.nmsConfig.SaParent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaParentRepo extends JpaRepository<SaParent, Long> {
    List<SaParent> findAllByDevice(Device device);
}
