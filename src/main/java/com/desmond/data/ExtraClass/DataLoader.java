package com.desmond.data.ExtraClass;

import com.desmond.data.entity.Course;
import com.desmond.data.entity.Topic;
import com.desmond.data.repository.CourseRepository;
import com.desmond.data.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by desmond on 3/5/2017.
 */

@Component
public class DataLoader implements ApplicationRunner {

    private CourseRepository courseRepo;
    private TopicRepository topicRepo;

    @Autowired
    public DataLoader(CourseRepository courseRepo, TopicRepository topicRepo){
        this.courseRepo = courseRepo;
        this.topicRepo = topicRepo;
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
//
//
////        Topic t3 = new Topic("300", "How to write", "write numbers");
//
////        Course c1 = new Course("1", "Java", "good stuff", t1.getId());
////        Course c2 = new Course("2", "C++", "wtf", t2.getId());
////        Course c3 = new Course("3", "Python", "meh", t3.getId());
////        Course c4 = new Course("4", "Javascript", "cool", t1.getId());
////        Course c5 = new Course("5", "PHP", "cooool", t2.getId());
//
        Course c1 = new Course("1", "Java", "good stuff");
        Course c2 = new Course("2", "C++", "wtf");
        Course c3 = new Course("3", "Python", "meh");
////        Course c4 = new Course("4", "Javascript", "cool");
////        Course c5 = new Course("5", "PHP", "cooool");
//

////
//        List<Course> l = new ArrayList<Course>();
//        l.add(c1);
//        l.add(c2);
////
////        t1.setCourse(l);
//
// //       t1.getCourse().add(c1);
//  //      t1.getCourse().add(c2);
//
        Topic t1 = new Topic("100", "How to count", "Counting numbers");
        Topic t2 = new Topic("200", "How to read", "read numbers");

        c1.setTopic(t1);
        c2.setTopic(t2);
        c3.setTopic(t1);
//
        topicRepo.save(t1);
        topicRepo.save(t2);
////        topicRepo.save(t3);
//
        courseRepo.save(c1);
        courseRepo.save(c2);
        courseRepo.save(c3);
//        courseRepo.save(c3);
//        courseRepo.save(c4);
//        courseRepo.save(c5);

        System.out.println(t1.getCourse().add(c1));
        System.out.println(t1.getCourse().get(0).getDescription());

    }
}
