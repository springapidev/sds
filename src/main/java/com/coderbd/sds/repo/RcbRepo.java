package com.coderbd.sds.repo;


import com.coderbd.sds.entity.nmsConfig.Gocb;
import com.coderbd.sds.entity.nmsConfig.Rcb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RcbRepo extends JpaRepository<Rcb, Integer> {
}
