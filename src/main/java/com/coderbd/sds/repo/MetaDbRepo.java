package com.coderbd.sds.repo;

import com.coderbd.sds.entity.metaInfo.MetaDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Mohmmad Rajaul Islam
 */
@Repository
public interface MetaDbRepo extends JpaRepository<MetaDB, Integer> {
}
