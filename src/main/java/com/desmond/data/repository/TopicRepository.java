package com.desmond.data.repository;

import com.desmond.data.entity.Course;
import com.desmond.data.entity.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by desmond on 2/5/2017.
 */
@Repository
public interface TopicRepository extends CrudRepository<Topic, String>{

    List<Topic> findByName(String name);
    List<Topic> findByIdLessThan(String id);

    //List<Course> findByTopic_Id(String topicid);

}
