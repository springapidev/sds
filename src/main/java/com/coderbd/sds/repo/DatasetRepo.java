package com.coderbd.sds.repo;


import com.coderbd.sds.entity.nmsConfig.Dataset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatasetRepo extends JpaRepository<Dataset, Integer> {
}
