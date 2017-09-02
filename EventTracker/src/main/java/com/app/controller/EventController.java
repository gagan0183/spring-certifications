package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Event;

@Controller
public class EventController {
	@RequestMapping(value = "/event")
	public String getEvent(Model model) {
		Event event = new Event();
		event.setName("spring");
		model.addAttribute("event", event);
		return "event";
	}
}
