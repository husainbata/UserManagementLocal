package com.derivit.solutions.bss.um.web.jsf.managedbean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;

import com.derivit.solutions.bss.um.dataobject.UserDO;

@Controller(value = "groupmanagementMB")
@Scope(scopeName = WebApplicationContext.SCOPE_SESSION)
public class GroupManagementMB implements IManagedBean {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 2363171379128677752L;

	private List<UserDO>		userList			= new ArrayList<UserDO>();

	private List<UserDO>		pendingUserList		= new ArrayList<UserDO>();

	@Override
	public void initializeBean() {

	}

	@Override
	public void destroyBean() {

	}

	public List<UserDO> getUserList() {
		return userList;
	}

	public void setUserList(List<UserDO> userList) {
		this.userList = userList;
	}

	public List<UserDO> getPendingUserList() {
		return pendingUserList;
	}

	public void setPendingUserList(List<UserDO> pendingUserList) {
		this.pendingUserList = pendingUserList;
	}
}