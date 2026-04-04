package com.volunthero.volunthero_backend;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.*;

@Entity
public class VolunteerLog {
    @Id
    @GeneratedValue
    private Long id;
    
    private Integer hours;

    private LocalDate date;

    private LocalTime startTime;

    private LocalTime endTime;

    @ManyToOne
    private User user;

    @ManyToOne
    private Organization organization;

    public VolunteerLog() {}

    public VolunteerLog(int hours, LocalDate date, User user, Organization organization) {
        this.hours = hours;
        this.date = date;
        this.user = user;
        this.organization = organization;
    }

    public Long getId() {
        return id;
    }

    public int getHours() {
        return hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public User getUser() {
        return user;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    //to test
    //Invoke-RestMethod -Method POST `
    //-Uri "http://localhost:8080/logs" `
    //-ContentType "application/json" `
    //-Body '{"date":"2026-03-17","startTime":"14:00","endTime":"17:00","user":{"id":1},"organization":{"id":1}}'
}