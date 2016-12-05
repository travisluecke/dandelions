package org.cloudguard.dandelions.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.cloudguard.dandelions.service.DailyWOD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	private DailyWOD dailyWOD;

	@Autowired
	public void setDailyWOD(DailyWOD dailyWOD) {
		this.dailyWOD = dailyWOD;
	}

	@RequestMapping("/resource")
	public Map<String, Object> home() {
		
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		// Get the date today using Calendar object.
		Date today = Calendar.getInstance().getTime();        
		// Using DateFormat format method we can create a string 
		// representation of a date with the defined format.
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("id", UUID.randomUUID().toString());
		model.put("content", "Hello World");
		model.put("wod", dailyWOD.getTodaysWOD());
		model.put("today",df.format(today));
		return model;
	}

}
