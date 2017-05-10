package com.desmond.data.Controller;

import com.desmond.data.Business.service.CourseService;
import com.desmond.data.entity.Course;
import com.desmond.data.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by desmond on 21/4/2017.
 */

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    ///// GET /////

    @RequestMapping(value="/topics/{id}/courses", method= RequestMethod.GET)
    public List<Course> getAllCourses(@PathVariable String id){
        return courseService.getAllCourses(id);
    }

    @RequestMapping(value="/topics/{topicId}/courses/{id}", method= RequestMethod.GET)
    public Course getCourse(@PathVariable String id){
        return courseService.getCourse(id);
    }

    ///// POST /////

    @RequestMapping(value="/topics/{topicId}/courses", method= RequestMethod.POST)
    public void addCourse(@RequestBody Course course, @PathVariable String topicId){
        course.setTopic(new Topic(topicId, "multiply numbers", "how to multiply"));
        courseService.addCourse(course);
    }


    ///// PUT /////

//    @RequestMapping(value="/topics/{topicId}/courses/{id}", method= RequestMethod.PUT)
//    public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id){
//        course.setTopic(new Topic(topicId, "", ""));
//        courseService.updateCourse(course);
//    }

    ///// DELETE /////

    @RequestMapping(value="/topics/{topicId}/courses/{id}", method= RequestMethod.DELETE)
    public void deleteCourse(@PathVariable String id){
        courseService.deleteCourse(id);
    }
}
