package com.javatpoint.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TimeSheetController {
	@RequestMapping("/timesheets")
	public ModelAndView sayTimeSheets(){
		List<String> tsList = new ArrayList<String>();
		tsList.add("week1");
		tsList.add("week2");
		tsList.add("week3");
		return new ModelAndView("timesheets","tsList",tsList);
	}
}
