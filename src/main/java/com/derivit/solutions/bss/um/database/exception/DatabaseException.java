package com.derivit.solutions.bss.um.database.exception;

/**
 * The Class DatabaseException.
 * @author JhaP
 */
public class DatabaseException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1768310741150597384L;

	/**
	 * Instantiates a new database exception.
	 */
	public DatabaseException() {
		super();
	}

	/**
	 * Instantiates a new database exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 * @param enableSuppression
	 *            the enable suppression
	 * @param writableStackTrace
	 *            the writable stack trace
	 */
	public DatabaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Instantiates a new database exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public DatabaseException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new database exception.
	 *
	 * @param message
	 *            the message
	 */
	public DatabaseException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new database exception.
	 *
	 * @param cause
	 *            the cause
	 */
	public DatabaseException(Throwable cause) {
		super(cause);
	}
}