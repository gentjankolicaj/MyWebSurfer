package com.task;

import java.util.ArrayList;
import java.util.List;

import com.core.pool.WebBrowserMap;
import com.core.webbrowser.WebBrowserUtils;
import com.util.DriverUtils;


public class Task {

	private List<SubTask> steps;

	public Task() {
		super();
		this.steps = new ArrayList<>();
	}

	public Task(List<SubTask> steps) {
		super();
		this.steps = steps;
	}

	public void addStep(SubTask step) {
		this.steps.add(step);
	}

	public void finish() throws Exception {
		for (SubTask var : steps) {
			
			//Opening activities here:
			DriverUtils.killDrivers(); //cleans if any existing drivers are on memory
			
			WebBrowserMap.clearMap(); //removes references of webBrowser object if any
			
			
			var.complete(); //execute implemented subtask
			
			
			
			
			
			//Closing activities here:
			
			WebBrowserUtils.quit(); //quits each webBrowser who's reference is stored in WebBrowserMap
			
			
			WebBrowserMap.clearMap(); //removes references of webBrowser object 
			
			
			DriverUtils.killDrivers(); //cleans existing drivers that are on memory
			
			
		}


	}

}
