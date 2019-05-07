package com.example.Timesheet.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description = "Class representing the status of a timesheet tracked by the application.")
public class TimesheetStatus {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@ApiModelProperty(notes = "Unique identifier of the status. No two statuses can have the same id.", example = "1", position = 0)
	private int id;

	@ApiModelProperty(notes = "Name of the status.", example = "Brouillon", position = 1)
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
