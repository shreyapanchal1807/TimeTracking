package com.grownited.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TaskUser")

public class TaskUserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private Integer taskUserId;
	  private Integer userId;
	  private Integer taskadd;
	  private Integer assignStatus;
	  private Integer statusId;
	  private Integer utilizedHours;
	public Integer getTaskUserId() {
		return taskUserId;
	}
	public void setTaskUserId(Integer taskUserId) {
		this.taskUserId = taskUserId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getTaskadd() {
		return taskadd;
	}
	public void setTaskadd(Integer taskadd) {
		this.taskadd = taskadd;
	}
	public Integer getAssignStatus() {
		return assignStatus;
	}
	public void setAssignStatus(Integer assignStatus) {
		this.assignStatus = assignStatus;
	}
	public Integer getStatusId() {
		return statusId;
	}
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}
	public Integer getUtilizedHours() {
		return utilizedHours;
	}
	public void setUtilizedHours(Integer utilizedHours) {
		this.utilizedHours = utilizedHours;
	}
	  
	  

}
