package com.company.professions;

public class Driver extends Person {
    public String fullName = "Artur Goncharov";
    public int experience = 2;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
