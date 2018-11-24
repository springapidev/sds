package com.coderbd.sds.repo;


import com.coderbd.sds.entity.nmsConfig.Gocb;
import com.coderbd.sds.entity.nmsConfig.Setting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingRepo extends JpaRepository<Setting, Integer> {
}
