package com.desmond.data.Business.service;

import com.desmond.data.entity.Topic;
import com.desmond.data.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.expression.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by desmond on 21/4/2017.
 */

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepo;

//    List<Topic> topics = new ArrayList<>(Arrays.asList(
//                new Topic("1", "Math", "About numbers"),
//                new Topic("2", "Chinese", "Weird stuff"),
//                new Topic("3", "English", "To talk")
//                ));

    public List<Topic> getAllTopics(){
        //return topics;

        //List<Topic> topics = new ArrayList<>();
//        topicRepo.findAll()
//                .forEach(topics::add);
//
//        return topics;

        //topics = (List<Topic>)topicRepo.findAll();

        //System.out.println(topics.get(1).getId());
        //System.out.println("hi");
        return (List<Topic>)topicRepo.findAll();

    }

    public Topic getTopic(String id){
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepo.findOne(id);
    }

    public void addTopic(Topic topic){
        //topics.add(topic);

        topicRepo.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
//        for(int i = 0; i < topics.size(); i++){
//            Topic t = topics.get(i);
//            //If topic id matches then set
//            if(t.getId().equals(id)){
//                topics.set(i, topic);
//                return;
//            }
//        }
        topicRepo.save(topic);
    }

    public void deleteTopic(String id) {
        //topics.removeIf(t -> t.getId().equals(id));

        //topics.removeIf((Topic t) -> t.getId().equals(id));

        topicRepo.delete(id);

    }

    ///// Query Creation /////

    public List<Topic> getTopicByName(String name) {

        return topicRepo.findByName(name);

    }

    public List<Topic> getTopicByIdLessThan(String id) {

        return topicRepo.findByIdLessThan(id);

    }

    ///////////////////////////////////////////////////////

//    public List<Topic> getByTopicId(String topicId){
//        return topicRepo.findByTopic_Id(topicId);
//    }



}
