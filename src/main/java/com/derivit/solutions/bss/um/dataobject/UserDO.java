package com.derivit.solutions.bss.um.dataobject;


import java.util.ArrayList;
import java.util.List;

/**
 * The Class UserDO.
 * 
 * @author prabhat.jha
 */
public class UserDO extends AbstractDO {

	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= 260226583060886438L;

	/** The user name. */
	private String				username;

	/** The status. */
	private String				status;

	/** The department. */
	private String				department;

	/** The branch. */
	private String				branch;

	/** The location. */
	private String				location;

	/** The first name. */
	private String				firstName;

	/** The last name. */
	private String				lastName;

	/** The email id. */
	private String				emailId;

	/** The business unit. */
	private String				businessUnit;

	/** The display name. */
	private String				displayName;

	/** The employee id. */
	private String				employeeId;

	/** The password. */
	private String				password			= null;

	/** The edit allowed. */
	private boolean				editAllowed			= true;

	/** The group name. */
	private String				groupName			= "";

	/** The group names. */
	private List<String>		groupNames			= new ArrayList<String>();

	/** The user status. */
	private String				userStatus;

	/** The old first name. */
	private String				oldFirstName		= null;

	/** The old last name. */
	private String				oldLastName			= null;

	/** The old email id. */
	private String				oldEmailId			= null;

	/** The old business unit. */
	private String				oldBusinessUnit		= null;

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
	 *            the new user name
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
	 * Gets the display name.
	 * 
	 * @return the display name
	 */
	public String getDisplayName() {
		return ((firstName != null ? firstName : "") + " " + (lastName != null ? lastName : ""));
	}

	/**
	 * Sets the display name.
	 * 
	 * @param displayName
	 *            the new display name
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
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
	 * Gets the edits the allowed.
	 * 
	 * @return the edits the allowed
	 */
	public boolean getEditAllowed() {
		return editAllowed;
	}

	/**
	 * Sets the edits the allowed.
	 * 
	 * @param editAllowed
	 *            the new edits the allowed
	 */
	public void setEditAllowed(boolean editAllowed) {
		this.editAllowed = editAllowed;
	}

	/**
	 * Gets the group name.
	 * 
	 * @return the group name
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * Sets the group name.
	 * 
	 * @param groupName
	 *            the new group name
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * Gets the group names.
	 *
	 * @return the group names
	 */
	public List<String> getGroupNames() {
		return groupNames;
	}

	/**
	 * Sets the group names.
	 *
	 * @param groupNames
	 *            the new group names
	 */
	public void setGroupNames(List<String> groupNames) {
		this.groupNames = groupNames;
	}

	/**
	 * Gets the user status.
	 *
	 * @return the user status
	 */
	public String getUserStatus() {
		return userStatus;
	}

	/**
	 * Sets the user status.
	 *
	 * @param userStatus
	 *            the new user status
	 */
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	/**
	 * Gets the old first name.
	 *
	 * @return the old first name
	 */
	public String getOldFirstName() {
		return oldFirstName;
	}

	/**
	 * Sets the old first name.
	 *
	 * @param oldFirstName
	 *            the new old first name
	 */
	public void setOldFirstName(String oldFirstName) {
		this.oldFirstName = oldFirstName;
	}

	/**
	 * Gets the old last name.
	 *
	 * @return the old last name
	 */
	public String getOldLastName() {
		return oldLastName;
	}

	/**
	 * Sets the old last name.
	 *
	 * @param oldLastName
	 *            the new old last name
	 */
	public void setOldLastName(String oldLastName) {
		this.oldLastName = oldLastName;
	}

	/**
	 * Gets the old email id.
	 *
	 * @return the old email id
	 */
	public String getOldEmailId() {
		return oldEmailId;
	}

	/**
	 * Sets the old email id.
	 *
	 * @param oldEmailId
	 *            the new old email id
	 */
	public void setOldEmailId(String oldEmailId) {
		this.oldEmailId = oldEmailId;
	}

	/**
	 * Gets the old business unit.
	 *
	 * @return the old business unit
	 */
	public String getOldBusinessUnit() {
		return oldBusinessUnit;
	}

	/**
	 * Sets the old business unit.
	 *
	 * @param oldBusinessUnit
	 *            the new old business unit
	 */
	public void setOldBusinessUnit(String oldBusinessUnit) {
		this.oldBusinessUnit = oldBusinessUnit;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.derivit.nbad.uid.creation.ui.dataobjects.DITUIDAbstractDO#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result + ((businessUnit == null) ? 0 : businessUnit.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((displayName == null) ? 0 : displayName.hashCode());
		result = prime * result + (editAllowed ? 1231 : 1237);
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((groupName == null) ? 0 : groupName.hashCode());
		result = prime * result + ((groupNames == null) ? 0 : groupNames.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((oldBusinessUnit == null) ? 0 : oldBusinessUnit.hashCode());
		result = prime * result + ((oldEmailId == null) ? 0 : oldEmailId.hashCode());
		result = prime * result + ((oldFirstName == null) ? 0 : oldFirstName.hashCode());
		result = prime * result + ((oldLastName == null) ? 0 : oldLastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + ((userStatus == null) ? 0 : userStatus.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.derivit.nbad.uid.creation.ui.dataobjects.DITUIDAbstractDO#equals(
	 * java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof UserDO)) {
			return false;
		}
		UserDO other = (UserDO) obj;
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
		if (displayName == null) {
			if (other.displayName != null) {
				return false;
			}
		} else if (!displayName.equals(other.displayName)) {
			return false;
		}
		if (editAllowed != other.editAllowed) {
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
		if (groupName == null) {
			if (other.groupName != null) {
				return false;
			}
		} else if (!groupName.equals(other.groupName)) {
			return false;
		}
		if (groupNames == null) {
			if (other.groupNames != null) {
				return false;
			}
		} else if (!groupNames.equals(other.groupNames)) {
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
		if (oldBusinessUnit == null) {
			if (other.oldBusinessUnit != null) {
				return false;
			}
		} else if (!oldBusinessUnit.equals(other.oldBusinessUnit)) {
			return false;
		}
		if (oldEmailId == null) {
			if (other.oldEmailId != null) {
				return false;
			}
		} else if (!oldEmailId.equals(other.oldEmailId)) {
			return false;
		}
		if (oldFirstName == null) {
			if (other.oldFirstName != null) {
				return false;
			}
		} else if (!oldFirstName.equals(other.oldFirstName)) {
			return false;
		}
		if (oldLastName == null) {
			if (other.oldLastName != null) {
				return false;
			}
		} else if (!oldLastName.equals(other.oldLastName)) {
			return false;
		}
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!password.equals(other.password)) {
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
		if (userStatus == null) {
			if (other.userStatus != null) {
				return false;
			}
		} else if (!userStatus.equals(other.userStatus)) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.derivit.nbad.uid.creation.ui.dataobjects.DITUIDAbstractDO#toString()
	 */
	@Override
	public String toString() {
		return String.format("[username=%s, status=%s, firstName=%s, lastName=%s, emailId=%s, businessUnit=%s, groupName=%s]", username,
				status, firstName, lastName, emailId, businessUnit, groupName);
	}
}