package com.derivit.solutions.bss.um.dataobject;


import java.io.Serializable;
import java.util.Date;

/**
 * The Interface IDO.
 * @author prabhat.jha
 */
public interface IDO extends Serializable {

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId();

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(Long id);

	/**
	 * Gets the created date.
	 *
	 * @return the created date
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date.
	 *
	 * @param date
	 *            the new created date
	 */
	public void setCreatedDate(Date date);

	/**
	 * Gets the created by.
	 *
	 * @return the created by
	 */
	public String getCreatedBy();

	/**
	 * Sets the created by.
	 *
	 * @param createdBy
	 *            the new created by
	 */
	public void setCreatedBy(String createdBy);

	/**
	 * Gets the modified date.
	 *
	 * @return the modified date
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date.
	 *
	 * @param modifiedDate
	 *            the new modified date
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the modified by.
	 *
	 * @return the modified by
	 */
	public String getModifiedBy();

	/**
	 * Sets the modified by.
	 *
	 * @param modifiedBy
	 *            the new modified by
	 */
	public void setModifiedBy(String modifiedBy);
}
