package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Attendee;

@Controller
public class AttendeeController {
	@RequestMapping(value = "/attendee")
	public String getAttendee(Model model) {
		Attendee attendee = new Attendee();
		model.addAttribute("attendee", attendee);
		return "attendee";
	}
	
	@RequestMapping(value = "/attendee", method = RequestMethod.POST)
	public String post(@ModelAttribute("attendee") Attendee attendee) {
		System.out.println(attendee);
		return "redirect:index.html";
	}
}
