package com.task;

import java.util.ArrayList;
import java.util.List;

public class Task {
	
	private List<SubTask> steps;
	
	
	public Task() {
		super();
		this.steps=new ArrayList<>();
	}



	public Task(List<SubTask> steps) {
		super();
		this.steps = steps;
	}




	public void addStep(SubTask step) {
		this.steps.add(step);
	}
	
	
	public void finish() throws Exception{
		for(SubTask var:steps) {
			var.complete();
		}
		
	}
	
	
	
	

}
