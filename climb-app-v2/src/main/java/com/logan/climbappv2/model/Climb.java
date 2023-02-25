package com.logan.climbappv2.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Climbs")
public class Climb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String grade;
    @NotNull
    private String location;
    private int attempts;
    private boolean isSent;
    private String notes;

    public Climb(Long id, String name, String grade, String location, int attempts, boolean isSent, String notes) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.location = location;
        this.attempts = attempts;
        this.isSent = isSent;
        this.notes = notes;
    }
    public Climb(){}; // default constructor

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public boolean isSent() {
        return isSent;
    }

    public void setSent(boolean sent) {
        isSent = sent;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Climb{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", location='" + location + '\'' +
                ", attempts=" + attempts +
                ", isSent=" + isSent +
                ", notes='" + notes + '\'' +
                '}';
    }
}
