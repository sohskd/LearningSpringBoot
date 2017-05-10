package com.desmond.data.Controller;

import com.desmond.data.entity.Student;
import org.springframework.web.bind.annotation.*;
import sun.awt.SunHints;

import java.util.ArrayList;

/**
 * Created by desmond on 13/4/2017.
 */

@RestController
public class RestControllerTest {

    //Retrieve All student records
    @RequestMapping(value="/students", method= RequestMethod.GET)
    public ArrayList<Student> getStudentList(){

        Student student1 = new Student();
        student1.setStudentName("Dessy");

        Student student2 = new Student();
        student2.setStudentName("MOoppy");

        Student student3 = new Student();
        student3.setStudentName("Tiggy");

        ArrayList<Student> s = new ArrayList<Student>();

        s.add(student1);
        s.add(student2);
        s.add(student3);

        return s;

    }

    //Retrieve a specific student record
    @RequestMapping(value="/students/{name}", method=RequestMethod.GET)
    public Student getStudent(@PathVariable("name") String n){

        //Fetch the student's record using "n" from DB
        Student s1 = new Student();
        s1.setStudentName(n);
        s1.setStudentHobby("Badminton");
        return s1;
    }

    //Updating a Student's record
    @RequestMapping(value="/students/{name}", method=RequestMethod.PUT)
    public boolean updateStudent(@PathVariable("name") String n, @RequestBody Student s){

        System.out.println("Student Name: " + n);

        return true;
    }





}
