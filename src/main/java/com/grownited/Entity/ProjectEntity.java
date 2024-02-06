package com.grownited.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ProjectEntity")

public class ProjectEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer ProjectID;
	private String Title;
	private String Description;
	private String StartDate;
	private String EndDate;
	public Integer getProjectID() {
		return ProjectID;
	}
	public void setProjectID(Integer projectID) {
		ProjectID = projectID;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}		
	
	}
	
	