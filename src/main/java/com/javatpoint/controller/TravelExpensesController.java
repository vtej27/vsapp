package com.javatpoint.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TravelExpensesController {
	@RequestMapping("/travelexp")
	public ModelAndView sayTimeSheets(){
		List<String> teList = new ArrayList<String>();
		teList.add("Travel Expense 1");
		teList.add("travelexp.page 2");
		teList.add("travelexp.page 3");
		return new ModelAndView("travelexp","teList",teList);
	}
}
