package com.grownited.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "ProjectStatusEntity")
public class ProjectStatusEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ProjectStatusID;
	private String ProjectStatus;
	
	public Integer getProjectStatusID() {
		return ProjectStatusID;
	}
	public void setProjectStatusID(Integer projectStatusID) {
		ProjectStatusID = projectStatusID;
	}
	public String getProjectStatus() {
		return ProjectStatus;
	}
	public void setProjectStatus(String projectStatus) {
		ProjectStatus = projectStatus;
	}
	
}