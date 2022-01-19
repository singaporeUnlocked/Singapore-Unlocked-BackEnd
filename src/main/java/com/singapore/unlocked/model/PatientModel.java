package com.singapore.unlocked.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Patient")

public class PatientModel {
    @Id 
    private String id;

    private String patientId;
    private String name;
    private double cognitiveRatings;
    private double physicalRatings;
    private double socialRatings;

    public String getId()
    {
        return this.id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    
    public String getPatientId()
    {
        return this.patientId;
    }

    public void setPatientId(String patientId)
    {
        this.patientId = patientId;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCognitiveRatings()
    {
        return this.cognitiveRatings;
    }
    
    public void setCognitiveRatings(double cogRat)
    {
        this.cognitiveRatings = cogRat;
    }

    public double getPhysicalRatings()
    {
        return this.physicalRatings;
    }

    public void setPhysicalRatings(double phyRat)
    {
        this.physicalRatings = phyRat;
    }

    public double getSocialRatings()
    {
        return this.socialRatings;
    }
    public void setSocialRatings(double socRat)
    {
        this.socialRatings = socRat;
    }

    public PatientModel(String id, String patientId, String name, double cognitiveRatings, double physicalRatings, double socialRatings ) {
        this.id = id;
        this.patientId = patientId;
        this.name = name;
        this.cognitiveRatings = cognitiveRatings;
        this.physicalRatings = physicalRatings;
        this.socialRatings = socialRatings;
    }

    
}
