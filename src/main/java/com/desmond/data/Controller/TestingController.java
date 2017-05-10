package com.desmond.data.Controller;

import com.desmond.data.entity.Guest;
import com.desmond.data.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by desmond on 10/4/2017.
 */

// @PathVariable sol 1
//@Controller
//public class TestingController {
//    @RequestMapping(value = "/test/{name}/{class}", method = RequestMethod.GET)
//    public ModelAndView getTest(@PathVariable("name") String n, @PathVariable("class") String c) {
//
//        ModelAndView m = new ModelAndView("index1");
//        m.addObject("msg", "Hello " + n + "You are from class " + c);
//        return m;
//    }
//}

// @PathVariable sol 2
@Controller
public class TestingController {
    @RequestMapping(value = "/test/{name}/{class}", method = RequestMethod.GET)
    public ModelAndView getTest(@PathVariable Map<String, String> pathVars) {

        String n = pathVars.get("name");
        String c = pathVars.get("class");

        ModelAndView m = new ModelAndView("index1");
        m.addObject("msg", "Hello " + n + "You are from class " + c);
        return m;
    }
////////////////////////////////////////////////////////////////

//@Controller
//public class TestingController {
//    @RequestMapping(value = "/test", method = RequestMethod.GET)
//    public String getTest() {
//
//        //ModelAndView m = new ModelAndView("index1");
//        //m.addObject("msg", "Hello " + n + "You are from class " + c);
//        return "index1";
//    }
//}

    @RequestMapping(value = "/getTestForm", method = RequestMethod.GET)
    public ModelAndView getTestForm() {

        //ModelAndView m = new ModelAndView("AdmissionForm");
        ModelAndView m = new ModelAndView("AdmissionFormStudent");

        return m;
    }

    @RequestMapping(value = "/testFormPostStudent", method = RequestMethod.POST)
    public ModelAndView testFormPostStudent(@Valid @ModelAttribute("stud") Student stud, BindingResult result){

        if(result.hasErrors()){
            ModelAndView m = new ModelAndView("AdmissionFormStudent");

            return m;
        }
        ModelAndView m = new ModelAndView("submitAdmissionFormStudent");

        return m;
    }
//////////////////////////////////////////////////////
    // Sol 1 for RequestParam
//    @RequestMapping(value = "/testFormPost", method = RequestMethod.POST)
//    public ModelAndView testFormPost(@RequestParam(value="studentName", defaultValue="Bob the builder") String n,
//                                     @RequestParam(value="studentHobby") String h){
//
//        ModelAndView m = new ModelAndView("submitAdmissionForm");
//        m.addObject("msg", "Hello " + n + "Your hobby is playing " + h);
//        return m;
//    }

//    @RequestMapping(value = "/testFormPost", method = RequestMethod.POST)
//    public ModelAndView testFormPost(@RequestParam Map<String, String> reqPar){
//
//        String n = reqPar.get("studentName");
//        String h = reqPar.get("studentHobby");
//
//        ModelAndView m = new ModelAndView("submitAdmissionForm");
//        m.addObject("msg", "Hello " + n + "Your hobby is playing " + h);
//        return m;
//    }
//////////////////////////////////////////////////////////////

    //Solution 1
//    @RequestMapping(value = "/testFormPost", method = RequestMethod.POST)
//    public ModelAndView testFormPost(@RequestParam("studentName") String n,
//                                     @RequestParam("studentHobby") String h){
//
//        Guest guest = new Guest();
//        guest.setFirstName(n);
//        guest.setLastName(h);
//
//        ModelAndView m = new ModelAndView("submitAdmissionForm");
//        m.addObject("guest1", guest);
//
//        return m;
//    }

    //Solution 2 Faster way
    @RequestMapping(value = "/testFormPost", method = RequestMethod.POST)
    public ModelAndView testFormPost(@ModelAttribute("g") Guest g){

        ModelAndView m = new ModelAndView("submitAdmissionForm");

        return m;
    }

    @ModelAttribute
    public void addingCommonObjects(Model m){
        m.addAttribute("headerMessage", "Hello there friend!!!!!!!!");
    }





}