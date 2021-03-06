package com.ticket.booking.controller;

import com.ticket.booking.Entity.employeEntity;
import com.ticket.booking.Services.Ticketdetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class applicationController {
    @Autowired
    public Ticketdetails ticketdetails;
    @RequestMapping(method = RequestMethod.GET,value = {"/main*"})
public @ResponseBody ModelAndView retrieve(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("employeEntity") employeEntity employeEntity){

    HttpSession session= request.getSession();
    if(session!=null){
System.out.println("Session is still active");

    }

        //ticketdetails.Getemployeesdetail(101,employeEntity);
    String jo = "hello";
    return new ModelAndView("main");

}
}
