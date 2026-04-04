package com.volunthero.volunthero_backend;

import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.List;

@Service
public class VolunteerLogService {
    private final VolunteerLogRepository volunteerLogRepository;
    private final UserRepository userRepository;
    private final OrganizationRepository organizationRepository;

    public VolunteerLogService(VolunteerLogRepository volunteerLogRepository, UserRepository userRepository, OrganizationRepository organizationRepository)
    {
        this.volunteerLogRepository = volunteerLogRepository;
        this.userRepository = userRepository;
        this.organizationRepository = organizationRepository;
    }

    public List<VolunteerLog> getAllLogs() 
    {
        return volunteerLogRepository.findAll();
    }

    public VolunteerLog createLog(VolunteerLog volunteerLog) 
    {
        long hours = Duration.between(volunteerLog.getStartTime(), volunteerLog.getEndTime()).toHours();

        Long userId  = volunteerLog.getUser().getId();
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));

        Long orgId = volunteerLog.getOrganization().getId();
        Organization org = organizationRepository.findById(orgId).orElseThrow(() -> new RuntimeException("Organization not found"));
        volunteerLog.setOrganization(org);

        user.setHoursCompleted(user.getHoursCompleted() + (int)hours);

        userRepository.save(user);

        volunteerLog.setUser(user);

        VolunteerLog savedLog = volunteerLogRepository.save(volunteerLog);

        return savedLog;
    }
}
