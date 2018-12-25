package com.coderbd.sds.repo;

import com.coderbd.sds.entity.mr.ReportFormat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Mohmmad Rajaul Islam
 */
@Repository
public interface ReportFormatRepo extends JpaRepository<ReportFormat, Integer> {
}
