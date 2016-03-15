package com.derivit.solutions.bss.um.dataobject;


import java.util.Date;

/**
 * The Class AbstractDO.
 * @author prabhat.jha
 */
public abstract class AbstractDO implements IDO {

	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= 4067508889691387886L;

	/** The id. */
	private Long				id					= null;

	/** The created date. */
	private Date				createdDate			= null;

	/** The created by. */
	private String				createdBy			= null;

	/** The modified date. */
	private Date				modifiedDate		= null;

	/** The modified by. */
	private String				modifiedBy			= null;

	/*
	 * (non-Javadoc)
	 * @see com.derivit.nbad.uid.creation.ui.dataobjects.IDITUIDDO#getId()
	 */
	@Override
	public Long getId() {
		return this.id;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.derivit.nbad.uid.creation.ui.dataobjects.IDITUIDDO#setId(java.lang
	 * .Long)
	 */
	@Override
	public void setId(Long id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.derivit.nbad.uid.creation.ui.dataobjects.IDITUIDDO#getCreatedDate()
	 */
	@Override
	public Date getCreatedDate() {
		return this.createdDate;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.derivit.nbad.uid.creation.ui.dataobjects.IDITUIDDO#setCreatedDate
	 * (java.util.Date)
	 */
	@Override
	public void setCreatedDate(Date date) {
		this.createdDate = date;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.derivit.nbad.uid.creation.ui.dataobjects.IDITUIDDO#getCreatedBy()
	 */
	@Override
	public String getCreatedBy() {
		return this.createdBy;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.derivit.nbad.uid.creation.ui.dataobjects.IDITUIDDO#setCreatedBy(java
	 * .lang.String)
	 */
	@Override
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.derivit.nbad.uid.creation.ui.dataobjects.IDITUIDDO#getModifiedDate()
	 */
	@Override
	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.derivit.nbad.uid.creation.ui.dataobjects.IDITUIDDO#setModifiedDate
	 * (java.util.Date)
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.derivit.nbad.uid.creation.ui.dataobjects.IDITUIDDO#getModifiedBy()
	 */
	@Override
	public String getModifiedBy() {
		return this.modifiedBy;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.derivit.nbad.uid.creation.ui.dataobjects.IDITUIDDO#setModifiedBy(
	 * java.lang.String)
	 */
	@Override
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((modifiedBy == null) ? 0 : modifiedBy.hashCode());
		result = prime * result + ((modifiedDate == null) ? 0 : modifiedDate.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AbstractDO)) {
			return false;
		}
		AbstractDO other = (AbstractDO) obj;
		if (createdBy == null) {
			if (other.createdBy != null) {
				return false;
			}
		} else if (!createdBy.equals(other.createdBy)) {
			return false;
		}
		if (createdDate == null) {
			if (other.createdDate != null) {
				return false;
			}
		} else if (!createdDate.equals(other.createdDate)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (modifiedBy == null) {
			if (other.modifiedBy != null) {
				return false;
			}
		} else if (!modifiedBy.equals(other.modifiedBy)) {
			return false;
		}
		if (modifiedDate == null) {
			if (other.modifiedDate != null) {
				return false;
			}
		} else if (!modifiedDate.equals(other.modifiedDate)) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AbstractDO [id=" + id + ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", modifiedDate="
				+ modifiedDate + ", modifiedBy=" + modifiedBy + "]";
	}
}
