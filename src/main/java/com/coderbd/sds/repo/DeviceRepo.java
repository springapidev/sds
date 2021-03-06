package com.coderbd.sds.repo;


import com.coderbd.sds.entity.nmsConfig.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * @author Mohmmad Rajaul Islam
 */
@Repository
public interface DeviceRepo extends JpaRepository<Device, Integer> {
    Device findByName(String name);
}
