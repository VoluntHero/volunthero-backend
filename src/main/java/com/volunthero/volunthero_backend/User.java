package com.volunthero.volunthero_backend;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;
    private String password;
    private int hourGoal;
    private int hoursCompleted;

    public Long getId()
    {
        return id;
    }

    public String getPassword()
    {
        return password;
    }

    public String getEmail()
    {
        return email;
    }

    public String getName()
    {
        return name;
    }

    public int getHourGoal()
    {
        return hourGoal;
    }

    public int getHoursCompleted()
    {
        return hoursCompleted;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setHourGoal(int hourGoal)
    {
        this.hourGoal = hourGoal;
    }

    public void setHoursCompleted(int hoursCompleted)
    {
        this.hoursCompleted = hoursCompleted;
    }
}
