package com.volunthero.volunthero_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserLogController
{
    private final VolunteerLogService volunteerLogService;

    public UserLogController(VolunteerLogService volunteerLogService)
    {
        this.volunteerLogService = volunteerLogService;
        System.out.println("UserLogController LOADED");
    }

    @GetMapping("/{id}/logs")
    public List<VolunteerLog> getLogsForUser(@PathVariable Long id)
    {
        return volunteerLogService.getLogsByUserId(id);
    }
}