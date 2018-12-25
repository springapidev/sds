package com.coderbd.sds.repo;

import com.coderbd.sds.entity.nmsRuntime.ProcessEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * @author Mohmmad Rajaul Islam
 */
@Repository
public interface PortEventRepo extends JpaRepository<ProcessEvent, Integer> {
}
