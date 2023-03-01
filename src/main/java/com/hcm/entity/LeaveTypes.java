package com.hcm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LeaveTypes")
public class LeaveTypes {

	@Column(name = "id")
	@Id
	private long leaveId;

	@Column(name = "LeaveType")
	private String leaveType;

	@Column(name = "CreatedAt")
	private String leaveCreatedAt;

	@Column(name = "UpdateAt")
	private String leaveUpdatedAt;

	@Column(name = "LastUpdatedBy")
	private String lastupdatedBy;

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

	public String getLastupdatedBy() {
		return lastupdatedBy;
	}

	public void setLastupdatedBy(String lastupdatedBy) {
		this.lastupdatedBy = lastupdatedBy;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return leaveId + " " + leaveType;
	}

}
