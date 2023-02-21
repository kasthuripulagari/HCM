package com.hcm.pojo;

public class LeaveRequest {


		private long id;
		private long employeeId;
		private long leaveTypeId;
		private String fromDate;
		private String toDate;
		private String reason;
//		private String document;
		private String status;

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

		public long getLeaveTypeId() {
			return leaveTypeId;
		}

		public void setLeaveTypeId(long leaveTypeId) {
			this.leaveTypeId = leaveTypeId;
		}

		public String getFromDate() {
			return fromDate;
		}

		public void setFromDate(String fromDate) {
			this.fromDate = fromDate;
		}

		public String getToDate() {
			return toDate;
		}

		public void setToDate(String toDate) {
			this.toDate = toDate;
		}

		public String getReason() {
			return reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

}
