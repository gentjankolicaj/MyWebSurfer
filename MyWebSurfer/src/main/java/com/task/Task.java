package com.task;

import java.util.ArrayList;
import java.util.List;

public class Task {
	
	private List<Step> steps;
	
	
	public Task() {
		super();
		this.steps=new ArrayList<>();
	}



	public Task(List<Step> steps) {
		super();
		this.steps = steps;
	}




	public void addStep(Step step) {
		this.steps.add(step);
	}
	
	
	public void finish() throws Exception{
		for(Step var:steps) {
			var.perform();
		}
		
	}
	
	
	
	

}
