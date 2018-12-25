package com.coderbd.sds.repo;

import com.coderbd.sds.entity.nmsConfig.Ied;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IedRepo extends JpaRepository<Ied, Long> {
}
