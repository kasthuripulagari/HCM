package com.hcm.entity;

import jakarta.persistence.Entity;

@Entity
public class LeaveTypes {

	private long leaveId;
	private String leaveType;
	private String leaveCreatedAt;
	private String leaveUpdatedAt;
	
	public long getLeaveId() {
		return leaveId;
	}
	
	public void setLeaveId(long leaveId) {
		this.leaveId = leaveId;
	}
	
	public String getLeaveType() {
		return leaveType;
	}
	
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	
	public String getLeaveCreatedAt() {
		return leaveCreatedAt;
	}
	
	public void setLeaveCreatedAt(String leaveCreatedAt) {
		this.leaveCreatedAt = leaveCreatedAt;
	}
	
	public String getLeaveUpdatedAt() {
		return leaveUpdatedAt;
	}
	
	public void setLeaveUpdatedAt(String leaveUpdatedAt) {
		this.leaveUpdatedAt = leaveUpdatedAt;
	}
	
}
