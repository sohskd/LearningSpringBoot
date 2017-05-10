package com.desmond.data.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by desmond on 21/4/2017.
 */

//Annotations to tell JPA to map to relational database
//Create table name ROOM
//Room instance is row in the table
@Entity
public class Topic {

    @Id
    @Column(name="TOPIC_ID")
    private String id;
    @Column(name="NAME")
    private String name;
    @Column(name="DESCRIPTION")
    private String description;

    @OneToMany(mappedBy="topic", fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Course> course = new ArrayList<Course>();

    //no - argument constructor. Needed for hibernate
    public Topic(){};

    public Topic(String id, String name, String description, List<Course> course){
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.course = course;
    }

    public Topic(String id, String name, String description){
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }
}
