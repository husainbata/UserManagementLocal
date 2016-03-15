package com.derivit.solutions.bss.um.integration.mediator.exception;

/**
 * The Class MediatorException.
 * @author prabhat.jha
 */
public class MediatorException extends Exception{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5183924565883407407L;

	/**
	 * Instantiates a new mediator exception.
	 */
	public MediatorException() {
		super();
	}

	/**
	 * Instantiates a new mediator exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 * @param enableSuppression the enable suppression
	 * @param writableStackTrace the writable stack trace
	 */
	public MediatorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Instantiates a new mediator exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public MediatorException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new mediator exception.
	 *
	 * @param message the message
	 */
	public MediatorException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new mediator exception.
	 *
	 * @param cause the cause
	 */
	public MediatorException(Throwable cause) {
		super(cause);
	}
}