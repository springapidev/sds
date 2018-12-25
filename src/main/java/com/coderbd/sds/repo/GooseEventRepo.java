package com.coderbd.sds.repo;

import com.coderbd.sds.entity.gr.GooseEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Mohmmad Rajaul Islam
 */
@Repository
public interface GooseEventRepo extends JpaRepository<GooseEvent, Integer> {
}
