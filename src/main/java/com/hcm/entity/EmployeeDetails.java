package com.hcm.entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeDetails")
public class EmployeeDetails {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="RoleId")
	private String role_id;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Password")
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="LeaveId", referencedColumnName="id" )
	private EmployeeLeaves leaves;
	
	@OneToMany(cascade=CascadeType.PERSIST)
	@JoinColumn(name="LeaveRequestId", referencedColumnName="id")
	private LeaveRequest requests;
	
	@Column(name="CreatedAt")
	private String createdAt;
	
	@Column(name="UpdatedAt")
	private String updatedAt;
	
	@Column(name="LastUpdatedBy")
	private String lastupdatedBy;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public EmployeeLeaves getLeaves() {
		return leaves;
	}

	public void setLeaves(EmployeeLeaves leaves) {
		this.leaves = leaves;
	}

	public LeaveRequest getRequests() {
		return requests;
	}

	public void setRequests(LeaveRequest requests) {
		this.requests = requests;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getLastupdatedBy() {
		return lastupdatedBy;
	}

	public void setLastupdatedBy(String lastupdatedBy) {
		this.lastupdatedBy = lastupdatedBy;
	}

	@Override
	public String toString() {
		
		return "EmployeeDetails" +id+" "+firstName+" "+lastName+" "+role_id;
	}

	
}
