package com.derivit.solutions.bss.um.integration.mediator.exception.helper;

import org.springframework.transaction.TransactionSystemException;

import com.derivit.solutions.bss.um.integration.mediator.exception.MediatorException;

/**
 * The Class ExceptionHelper.
 * @author prabhat.jha
 */
public class ExceptionHelper {
	
	/**
	 * Gets the transaction from exception.
	 *
	 * @param e the e
	 * @return the transaction from exception
	 */
	public static MediatorException getTransactionFromException(Exception e) {
		String errorMessage = e.getMessage();
		Throwable throwable = e;
		if (e instanceof TransactionSystemException) {
			if (((TransactionSystemException) e).getApplicationException() != null) {
				errorMessage = ((TransactionSystemException) e).getApplicationException().getMessage();
				throwable = ((TransactionSystemException) e).getApplicationException();
			}
		}
		return new MediatorException(errorMessage, throwable);
	}
}
