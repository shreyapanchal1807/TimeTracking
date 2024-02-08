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

	private Integer projectID;
	private String title;
	private String description;
	private String projectStatusID;
	private String docURL;
	private String estimatedHours;
	private String totalUtilizedHours;
	private String projectStartDate;
	private String projectEndDate;
	
	public Integer getProjectID() {
		return projectID;
	}
	public void setProjectID(Integer projectID) {
		this.projectID = projectID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProjectStatusID() {
		return projectStatusID;
	}
	public void setProjectStatusID(String projectStatusID) {
		this.projectStatusID = projectStatusID;
	}
	public String getDocURL() {
		return docURL;
	}
	public void setDocURL(String docURL) {
		this.docURL = docURL;
	}
	public String getEstimatedHours() {
		return estimatedHours;
	}
	public void setEstimatedHours(String estimatedHours) {
		this.estimatedHours = estimatedHours;
	}
	public String getTotalUtilizedHours() {
		return totalUtilizedHours;
	}
	public void setTotalUtilizedHours(String totalUtilizedHours) {
		this.totalUtilizedHours = totalUtilizedHours;
	}
	public String getProjectStartDate() {
		return projectStartDate;
	}
	public void setProjectStartDate(String projectStartDate) {
		this.projectStartDate = projectStartDate;
	}
	public String getProjectEndDate() {
		return projectEndDate;
	}
	public void setProjectEndDate(String projectEndDate) {
		this.projectEndDate = projectEndDate;
	}
	
}
	