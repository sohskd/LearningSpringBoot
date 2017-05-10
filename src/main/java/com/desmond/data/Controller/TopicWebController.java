package com.desmond.data.Controller;

import com.desmond.data.Business.service.TopicService;
import com.desmond.data.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by desmond on 7/5/2017.
 */

@Controller
public class TopicWebController {

    @Autowired
    private TopicService topicService;

    ///// GET ALL TOPICS /////

    @RequestMapping(value = "/getTopicForm", method = RequestMethod.GET)
    public String getTopicForm(Model m) {

        //ModelAndView m = new ModelAndView("AdmissionForm");
        m.addAttribute("Topics", topicService.getAllTopics());

        return "TopicCourses/GetTopic";
    }

    @RequestMapping(value = "/getPostTopicForm", method = RequestMethod.GET)
    public ModelAndView getPostTopicForm() {

        //ModelAndView m = new ModelAndView("AdmissionForm");
        ModelAndView m = new ModelAndView("TopicCourses/getPostTopic");

        return m;
    }

    @RequestMapping(value = "/postTopicForm", method = RequestMethod.POST)
    public String postTopicForm(@ModelAttribute Topic t, BindingResult result, Model m) {

        topicService.addTopic(t);

        m.addAttribute("Topics", topicService.getAllTopics());

        return "TopicCourses/GetTopic";
    }

}
