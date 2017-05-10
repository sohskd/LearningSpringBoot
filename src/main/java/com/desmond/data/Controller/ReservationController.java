package com.desmond.data.Controller;

import com.desmond.data.Business.domain.RoomReservation;
import com.desmond.data.Business.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by desmond on 9/4/2017.
 */

@Controller
@RequestMapping(value="/reservations")
public class ReservationController {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    @Autowired
    private ReservationService reservationService;

    @RequestMapping(method = RequestMethod.GET)
    public String getReservation(@RequestParam(value="doggy", required=false) String dateString, Model model){
        Date date = null;
        if(dateString != null){
            try {
                date = DATE_FORMAT.parse(dateString);
            } catch (ParseException pe) {
                date = new Date();
            }
        }else{
            date = new Date();
        }
        List<RoomReservation> roomReservationList = this.reservationService.getRoomReservationsForDate(date);
        model.addAttribute("roomReservations", roomReservationList);

        return "reservations";
    }
}
