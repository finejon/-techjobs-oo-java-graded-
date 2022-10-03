package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    //Code a constructor to initialize the id field with a unique value. This constructor should take no parameters.
    public Job () {
        this.id = nextId;
        nextId ++;
    }

    //  Code a second constructor that takes 5 parameters in correct order and assigns values to name, employer, location, positionType, and coreCompetency. Also, calls the first constructor in order to initialize the id field.
    public Job (String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();         // calls the first empty constructor to initialize the 'id' field.
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    //    5.1-4 toString() if Job obj ONLY contains data for id field, return OOPS! This job does not seem to exist.
    @Override
    public String toString() {
//      // if/else to add the Bonus check
        if (name.equals("") && employer.getValue().equals("") && location.getValue().equals("") && positionType.getValue().equals("") && coreCompetency.getValue().equals("")) {
            return "OOPS! This job does not exist!";
        } else {
            if (name.equals("")) {
                setName("Data not available");
            }
            if (employer.getValue().equals("")) {
                employer.setValue("Data not available");
            }
            if (location.getValue().equals("")) {
                location.setValue("Data not available");
            }
            if (positionType.getValue().equals("")) {
                positionType.setValue("Data not available");
            }
            if (coreCompetency.getValue().equals("")) {
                coreCompetency.setValue("Data not available");
            }
        }
        return '\n' + "ID: " + id + "\nName: " + name + "\nEmployer: " + employer + "\nLocation: " + location + "\nPosition Type: " + positionType + "\nCore Competency: " + coreCompetency + '\n';
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.



    @Override
    // Intellij auto-generated
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    // IntelliJ auto-generated
    public int hashCode() {
        return Objects.hash(id);

    }

    //     TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
//      and id. Generate a getter for the id field.
    public String getName() {
        if (name == null || name.isEmpty()) {
            return "Data not available";
        }
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employer getEmployer() {
        return employer;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    // Generate a getter for the id field.
    public int getId() {
        return id;
    }
}