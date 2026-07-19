package com.volunthero.volunthero_backend;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VolunteerLogRepository extends JpaRepository<VolunteerLog, Long> {
    List<VolunteerLog> findByUserId(Long userId);
}
