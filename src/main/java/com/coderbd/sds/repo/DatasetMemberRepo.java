package com.coderbd.sds.repo;


import com.coderbd.sds.entity.nmsConfig.Dataset;
import com.coderbd.sds.entity.nmsConfig.DatasetMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatasetMemberRepo extends JpaRepository<DatasetMember, Integer> {
}
