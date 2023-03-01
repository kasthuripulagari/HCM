package com.hcm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeLeaves")
public class EmployeeLeaves {

	@Column(name="Id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@OneToOne(mappedBy="leaves")
	private EmployeeDetails employee;
	
	@Column(name="TotalLeaves")
	private long totalLeavesCount;
	
	@Column(name="RemainingLeaves")
	private long remainingLeavesCount;
	
	@Column(name="CreatedAt")
	private String createdAt;
	
	@Column(name="UpdatedAt")
	private String updateAt;
	
	@Column(name="LastUpdatedBy")
	private String lastUpdatedBy;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EmployeeDetails getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeDetails employee) {
		this.employee = employee;
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
