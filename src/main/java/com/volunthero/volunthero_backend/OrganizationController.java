package com.volunthero.volunthero_backend;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {
    private final OrganizationService organizationService;

    public OrganizationController(OrganizationService organizationService)
    {
        this.organizationService = organizationService;
    }

    @GetMapping
    public List<Organization> getAllOrganizations()
    {
        return organizationService.getAllOrganizations();
    }

    @PostMapping
    public Organization createOrganization(@RequestBody Organization organization)
    {
        return organizationService.createOrganization(organization);
    }

    @GetMapping("/{id}")
    public Organization getOrganization(@PathVariable Long id)
    {
        return organizationService.getOrganizationById(id);
    }
}
