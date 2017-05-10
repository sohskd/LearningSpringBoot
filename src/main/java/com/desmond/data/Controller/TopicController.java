package com.desmond.data.Controller;

import com.desmond.data.Business.service.TopicService;
import com.desmond.data.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Created by desmond on 21/4/2017.
 */

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    ///// GET /////

    @RequestMapping(value="/topics", method= RequestMethod.GET)
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping(value="/topics/{id}", method= RequestMethod.GET)
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(value="/topics/name/{name}", method= RequestMethod.GET)
    public List<Topic> getTopicByName(@PathVariable String name){
        System.out.println("Im going in");
        return topicService.getTopicByName(name);
    }

    @RequestMapping(value="/topics/id/{id}", method= RequestMethod.GET)
    public List<Topic> getTopicByIdLessThan(@PathVariable String id){
        System.out.println("Im going in");
        return topicService.getTopicByIdLessThan(id);
    }

    ///// POST /////

    @RequestMapping(value="/topics", method= RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    ///// PUT /////

    @RequestMapping(value="/topics/{id}", method= RequestMethod.PUT)
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id, topic);
    }

    ///// DELETE /////

    @RequestMapping(value="/topics/{id}", method= RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
