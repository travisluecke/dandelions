package org.cloudguard.dandelions.model;

import java.util.Date;
import java.util.List;

public class WOD {
	
	public WOD() {		
	}
	
	public String id;
	public Date date;
	public String name;
	public List<Exercise> exercises;
	
}
