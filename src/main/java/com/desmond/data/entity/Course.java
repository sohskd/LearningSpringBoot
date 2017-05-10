package com.desmond.data.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 * Created by desmond on 2/5/2017.
 */

@Entity
public class Course{

    @Id
    @Column(name="COURSE_ID")
    private String id;
    private String name;
    private String description;

    //There could be many courses related to 1 topic
    @ManyToOne
    @JoinColumn(name = "TOPIC_ID")
    @JsonBackReference
    private Topic topic;

    public Course(){};

//    public Course(String id, String name, String description, String topicId){
//
//        super();
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this.topic = new Topic(topicId, "","");
//    }
    public Course(String id, String name, String description){

        super();
        this.id = id;
        this.name = name;
        this.description = description;

    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
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

}
