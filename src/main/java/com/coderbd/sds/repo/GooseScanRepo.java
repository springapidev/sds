package com.coderbd.sds.repo;


import com.coderbd.sds.entity.gr.GooseScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Mohmmad Rajaul Islam
 */
@Repository
public interface GooseScanRepo extends JpaRepository<GooseScan, Integer> {
}
