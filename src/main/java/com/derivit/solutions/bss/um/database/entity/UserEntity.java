/**
 * 
 */
package com.derivit.solutions.bss.um.database.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The Class UserEntity.
 * 
 * @author prabhat.jha
 */
@Entity
@Table(name = "D_UM_U")
public class UserEntity extends AbstractEntity {

	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -6117353900852066393L;

	/** The id. */
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "D_UM_S_G")
	@SequenceGenerator(name = "D_UM_S_G", sequenceName = "D_UM_S")
	private Long				id					= null;

	/** The user name. */
	@Column(name = "USER_NAME")
	private String				username			= null;

	/** The status. */
	@Column(name = "STATUS")
	private String				status				= null;

	/** The department. */
	@Column(name = "DEPARTMENT")
	private String				department			= null;

	/** The branch. */
	@Column(name = "BRANCH")
	private String				branch				= null;

	/** The location. */
	@Column(name = "LOCATION")
	private String				location			= null;

	/** The first name. */
	@Column(name = "FIRST_NAME")
	private String				firstName			= null;

	/** The last name. */
	@Column(name = "LAST_NAME")
	private String				lastName			= null;

	/** The email id. */
	@Column(name = "EMAIL_ID")
	private String				emailId				= null;

	/** The business unit. */
	@Column(name = "BUSINESS_UNIT")
	private String				businessUnit		= null;

	/** The employee id. */
	@Column(name = "EMPLOYEE_ID")
	private String				employeeId			= null;

	/** The password. */
	@Column(name = "PASSWORD")
	private String				password			= null;

	/** The authorizer id. */
	@Column(name = "AUTHORIZER_ID")
	private String				authorizerId		= null;

	/** The authorized on. */
	@Column(name = "AUTHORIZED_DATE")
	private Date				authorizedOn		= null;

	/** The record status. */
	@Column(name = "RECORD_STATUS")
	private String				recordStatus		= null;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */

	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the user name.
	 *
	 * @param username
	 *            the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status
	 *            the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Gets the department.
	 *
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Sets the department.
	 *
	 * @param department
	 *            the new department
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * Gets the branch.
	 *
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}

	/**
	 * Sets the branch.
	 *
	 * @param branch
	 *            the new branch
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}

	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets the location.
	 *
	 * @param location
	 *            the new location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName
	 *            the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName
	 *            the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the email id.
	 *
	 * @return the email id
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * Sets the email id.
	 *
	 * @param emailId
	 *            the new email id
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * Gets the business unit.
	 *
	 * @return the business unit
	 */
	public String getBusinessUnit() {
		return businessUnit;
	}

	/**
	 * Sets the business unit.
	 *
	 * @param businessUnit
	 *            the new business unit
	 */
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	/**
	 * Gets the employee id.
	 *
	 * @return the employee id
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * Sets the employee id.
	 *
	 * @param employeeId
	 *            the new employee id
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password
	 *            the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the authorizer id.
	 *
	 * @return the authorizer id
	 */
	public String getAuthorizerId() {
		return authorizerId;
	}

	/**
	 * Sets the authorizer id.
	 *
	 * @param authorizerId
	 *            the new authorizer id
	 */
	public void setAuthorizerId(String authorizerId) {
		this.authorizerId = authorizerId;
	}

	/**
	 * Gets the authorized on.
	 *
	 * @return the authorized on
	 */
	public Date getAuthorizedOn() {
		return authorizedOn;
	}

	/**
	 * Sets the authorized on.
	 *
	 * @param authorizedOn
	 *            the new authorized on
	 */
	public void setAuthorizedOn(Date authorizedOn) {
		this.authorizedOn = authorizedOn;
	}

	/**
	 * Gets the record status.
	 *
	 * @return the record status
	 */
	public String getRecordStatus() {
		return recordStatus;
	}

	/**
	 * Sets the record status.
	 *
	 * @param recordStatus
	 *            the new record status
	 */
	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.derivit.solutions.bss.um.database.entity.AbstractEntity#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((authorizedOn == null) ? 0 : authorizedOn.hashCode());
		result = prime * result + ((authorizerId == null) ? 0 : authorizerId.hashCode());
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result + ((businessUnit == null) ? 0 : businessUnit.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((recordStatus == null) ? 0 : recordStatus.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.derivit.solutions.bss.um.database.entity.AbstractEntity#equals(java.
	 * lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof UserEntity)) {
			return false;
		}
		UserEntity other = (UserEntity) obj;
		if (authorizedOn == null) {
			if (other.authorizedOn != null) {
				return false;
			}
		} else if (!authorizedOn.equals(other.authorizedOn)) {
			return false;
		}
		if (authorizerId == null) {
			if (other.authorizerId != null) {
				return false;
			}
		} else if (!authorizerId.equals(other.authorizerId)) {
			return false;
		}
		if (branch == null) {
			if (other.branch != null) {
				return false;
			}
		} else if (!branch.equals(other.branch)) {
			return false;
		}
		if (businessUnit == null) {
			if (other.businessUnit != null) {
				return false;
			}
		} else if (!businessUnit.equals(other.businessUnit)) {
			return false;
		}
		if (department == null) {
			if (other.department != null) {
				return false;
			}
		} else if (!department.equals(other.department)) {
			return false;
		}
		if (emailId == null) {
			if (other.emailId != null) {
				return false;
			}
		} else if (!emailId.equals(other.emailId)) {
			return false;
		}
		if (employeeId == null) {
			if (other.employeeId != null) {
				return false;
			}
		} else if (!employeeId.equals(other.employeeId)) {
			return false;
		}
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		if (location == null) {
			if (other.location != null) {
				return false;
			}
		} else if (!location.equals(other.location)) {
			return false;
		}
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!password.equals(other.password)) {
			return false;
		}
		if (recordStatus == null) {
			if (other.recordStatus != null) {
				return false;
			}
		} else if (!recordStatus.equals(other.recordStatus)) {
			return false;
		}
		if (status == null) {
			if (other.status != null) {
				return false;
			}
		} else if (!status.equals(other.status)) {
			return false;
		}
		if (username == null) {
			if (other.username != null) {
				return false;
			}
		} else if (!username.equals(other.username)) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.derivit.solutions.bss.um.database.entity.AbstractEntity#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"UserEntity [id=%s, username=%s, status=%s, department=%s, branch=%s, location=%s, firstName=%s, lastName=%s, emailId=%s, businessUnit=%s, employeeId=%s, password=%s, authorizerId=%s, authorizedOn=%s, recordStatus=%s]",
				id, username, status, department, branch, location, firstName, lastName, emailId, businessUnit, employeeId, password,
				authorizerId, authorizedOn, recordStatus);
	}
}