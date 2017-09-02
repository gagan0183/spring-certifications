package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.app.model.Event;

@Controller
@SessionAttributes("event")
public class EventController {
	@RequestMapping(value = "/event")
	public String getEvent(Model model) {
		Event event = new Event();
		event.setName("spring");
		model.addAttribute("event", event);
		return "event";
	}
	
	@RequestMapping(value = "/event", method = RequestMethod.POST)
	public String post(@ModelAttribute("event") Event event) {
		System.out.println(event);
		return "redirect:index.html";
	}
}
