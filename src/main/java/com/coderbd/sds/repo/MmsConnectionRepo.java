package com.coderbd.sds.repo;

import com.coderbd.sds.entity.mr.MmsConnection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * @author Mohmmad Rajaul Islam
 */
@Repository
public interface MmsConnectionRepo extends JpaRepository<MmsConnection, Integer> {
}
