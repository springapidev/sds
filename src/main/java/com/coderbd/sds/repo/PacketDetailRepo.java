package com.coderbd.sds.repo;

import com.coderbd.sds.entity.mr.PacketDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Mohmmad Rajaul Islam
 */
@Repository
public interface PacketDetailRepo extends JpaRepository<PacketDetail, Integer> {
}
