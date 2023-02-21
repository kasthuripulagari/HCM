package com.hcm.entity;

import jakarta.persistence.Entity;

@Entity
public class EmployeeLeaves {

	private long id;
	private long employeeId;
	private long totalLeavesCount;
	private long remainingLeavesCount;
	private String createdAt;
	private String updateAt;
	private String lastUpdatedBy;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public long getTotalLeavesCount() {
		return totalLeavesCount;
	}

	public void setTotalLeavesCount(long totalLeavesCount) {
		this.totalLeavesCount = totalLeavesCount;
	}

	public long getRemainingLeavesCount() {
		return remainingLeavesCount;
	}

	public void setRemainingLeavesCount(long remainingLeavesCount) {
		this.remainingLeavesCount = remainingLeavesCount;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

}
