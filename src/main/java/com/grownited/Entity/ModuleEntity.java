package com.grownited.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="modules")

public class ModuleEntity {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer moduleId;
	private String moduleName;
	private Integer projectId;
	private String status;
	private String description;
	private String docURL;
	private String estimatedHour;
	private String totalUtilizedHours;
	public Integer getModuleId() {
		return moduleId;
	}
	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDocURL() {
		return docURL;
	}
	public void setDocURL(String docURL) {
		this.docURL = docURL;
	}
	public String getEstimatedHour() {
		return estimatedHour;
	}
	public void setEstimatedHour(String estimatedHour) {
		this.estimatedHour = estimatedHour;
	}
	public String getTotalUtilizedHours() {
		return totalUtilizedHours;
	}
	public void setTotalUtilizedHours(String totalUtilizedHours) {
		this.totalUtilizedHours = totalUtilizedHours;
	}
	
}
