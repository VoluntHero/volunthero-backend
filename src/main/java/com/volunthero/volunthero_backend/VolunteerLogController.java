package com.volunthero.volunthero_backend;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/logs")
@RestController
public class VolunteerLogController {
    private final VolunteerLogService volunteerLogService;

    public VolunteerLogController(VolunteerLogService volunteerLogService)
    {
        this.volunteerLogService = volunteerLogService;
    }

    @GetMapping
    public List<VolunteerLog> getAllLogs()
    {
        return volunteerLogService.getAllLogs();
    }

    @PostMapping
    public VolunteerLog createLog(@RequestBody VolunteerLog log)
    {
        return volunteerLogService.createLog(log);
    }
}
