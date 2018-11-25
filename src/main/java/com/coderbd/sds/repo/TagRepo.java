package com.coderbd.sds.repo;


import com.coderbd.sds.entity.nmsConfig.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepo extends JpaRepository<Tag, Integer> {
}
