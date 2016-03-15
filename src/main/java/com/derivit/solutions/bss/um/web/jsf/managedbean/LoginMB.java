package com.derivit.solutions.bss.um.web.jsf.managedbean;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;

/**
 * The Class LoginMB.
 * 
 * @author prabhat.jha
 */
@Controller(value = "loginMB")
@Scope(scopeName = WebApplicationContext.SCOPE_SESSION)
public class LoginMB implements IManagedBean {

	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= 1708959646618627637L;

	/** The username. */
	private String				username			= null;

	/** The password. */
	private String				password			= null;

	private String				logout				= null;

	/**
	 * @return the logout
	 */
	public String getLogout() {
		return logout;
	}

	/**
	 * @param logout
	 *            the logout to set
	 */
	public void setLogout(String logout) {
		this.logout = logout;
	}

	/**
	 * Login.
	 *
	 * @return the string
	 */
	public String login() {
		return "success";
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username
	 *            the new username
	 */
	public void setUsername(String username) {
		this.username = username;
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

	public String logout() {

		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		try {
			externalContext.redirect(externalContext.getRequestContextPath());

			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "You have been successfully logged out", "!");;

			return "success";

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "failure";

	}

	/*
	 * (non-Javadoc)
	 * @see com.derivit.solutions.bss.um.web.jsf.managedbean.IManagedBean#
	 * initializeBean()
	 */
	@Override
	public void initializeBean() {
		// TODO Auto-generated method stub
		logout();
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.derivit.solutions.bss.um.web.jsf.managedbean.IManagedBean#destroyBean
	 * ()
	 */
	@Override
	public void destroyBean() {
		// TODO Auto-generated method stub

	}
}