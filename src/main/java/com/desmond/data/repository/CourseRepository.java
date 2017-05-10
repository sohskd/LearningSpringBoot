package com.desmond.data.repository;

import com.desmond.data.entity.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by desmond on 2/5/2017.
 */
@Repository
public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByName(String name);
    public List<Course> findByDescription(String foo);

    //Takes a topic ID and return a list of courses
    public List<Course> findByTopicId(String id);

}
