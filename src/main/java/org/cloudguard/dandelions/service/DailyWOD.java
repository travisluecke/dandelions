package org.cloudguard.dandelions.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.cloudguard.dandelions.model.Exercise;
import org.cloudguard.dandelions.model.WOD;
import org.springframework.stereotype.Component;

@Component
public class DailyWOD {

	public WOD getTodaysWOD() {
		WOD wod = new WOD();
		wod.id = UUID.randomUUID().toString();
		wod.name = "dandelions";
		wod.date = new Date();
		wod.exercises = getTodaysExcercises();
		return wod;
	}

	private List<Exercise> getTodaysExcercises() {
		List<Exercise> list = new ArrayList<Exercise>();
		Exercise ex1 = new Exercise(UUID.randomUUID().toString(),"10 burpies","soul-crushing burpies UGH");
		Exercise ex2 = new Exercise(UUID.randomUUID().toString(),"200m run","200m run, moderate pace");
		Exercise ex3 = new Exercise(UUID.randomUUID().toString(),"20 53lb KB Swings","overhead");
		list.add(ex1);
		list.add(ex2);
		list.add(ex3);		
		return list;
	}

}
