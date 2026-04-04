package com.volunthero.volunthero_backend;

import jakarta.persistence.*;

@Entity
public class Organization {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;
    private String websiteURL;
    private String imageURL;

    public Long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public String getWebsiteURL()
    {
        return websiteURL;
    }

    public String getImageURL()
    {
        return imageURL;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setWebsiteURL(String websiteURL)
    {
        this.websiteURL = websiteURL;
    }

    public void setImageURL(String imageURL)
    {
        this.imageURL = imageURL;
    }
}


//to add into database
//paste the following command into powershell, changing the values as needed
//Invoke-RestMethod -Method POST `
//-Uri "http://localhost:8080/organizations" `
//-ContentType "application/json" `
//-Body '{"name":"Habitat for Humanity","description":"Builds homes for families","location":"Austin"}'