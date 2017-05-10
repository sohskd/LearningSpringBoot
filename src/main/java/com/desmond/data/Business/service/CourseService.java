package com.desmond.data.Business.service;

/**
 * Created by desmond on 2/5/2017.
 */
import com.desmond.data.entity.Course;
import com.desmond.data.repository.CourseRepository;
import com.desmond.data.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by desmond on 21/4/2017.
 */

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepo;

//    List<Topic> topics = new ArrayList<>(Arrays.asList(
//                new Topic("1", "Math", "About numbers"),
//                new Topic("2", "Chinese", "Weird stuff"),
//                new Topic("3", "English", "To talk")
//                ));

    public List<Course> getAllCourses(String topicId){
        //return course;

//        List<Course> courses = new ArrayList<>();
//        //Finds courses by topic ID because one topic can have MANY courses. Courses will have foreign key of Topic
//        courseRepo.findByTopicId(topicId)
//                .forEach(courses::add);
//
//        return courses;

        return (List<Course>)courseRepo.findByTopicId(topicId);

    }

    public Course getCourse(String id){
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return courseRepo.findOne(id);
    }

    public void addCourse(Course course){
        //topics.add(topic);
        courseRepo.save(course);
    }

    public void updateCourse(Course course) {
//        for(int i = 0; i < topics.size(); i++){
//            Topic t = topics.get(i);
//            //If topic id matches then set
//            if(t.getId().equals(id)){
//                topics.set(i, topic);
//                return;
//            }
//        }
        courseRepo.save(course);
    }

    public void deleteCourse(String id) {
        //topics.removeIf(t -> t.getId().equals(id));

        //topics.removeIf((Topic t) -> t.getId().equals(id));

        courseRepo.delete(id);

    }
}
