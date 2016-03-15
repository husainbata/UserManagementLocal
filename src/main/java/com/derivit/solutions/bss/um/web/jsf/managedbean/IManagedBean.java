package com.derivit.solutions.bss.um.web.jsf.managedbean;

import java.io.Serializable;

/**
 * The Interface IManagedBean.
 * @author prabhat.jha
 */
public interface IManagedBean extends Serializable{

	/**
	 * Initialize bean.
	 */
	public void initializeBean();
	
	/**
	 * Destroy bean.
	 */
	public void destroyBean();
}