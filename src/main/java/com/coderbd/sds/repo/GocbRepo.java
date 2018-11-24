package com.coderbd.sds.repo;


import com.coderbd.sds.entity.nmsConfig.Dataset;
import com.coderbd.sds.entity.nmsConfig.Gocb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GocbRepo extends JpaRepository<Gocb, Integer> {
}
