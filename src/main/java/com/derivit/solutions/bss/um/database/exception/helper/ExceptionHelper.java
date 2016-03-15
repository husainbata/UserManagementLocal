package com.derivit.solutions.bss.um.database.exception.helper;

import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.transaction.TransactionSystemException;

import com.derivit.solutions.bss.um.database.exception.DatabaseException;

/**
 * The Class ExceptionHelper.
 * @author prabhat.jha
 */
public class ExceptionHelper {
	
	/**
	 * Gets the database exception from exception.
	 *
	 * @param e the e
	 * @return the database exception from exception
	 */
	public static DatabaseException getDatabaseExceptionFromException(Exception e) {
		String errorMessage = e.getMessage();
		Throwable throwable = e;
		if (e instanceof DataAccessException) {
			if (((DataAccessException) e).getMostSpecificCause() != null) {
				Throwable t = ((DataAccessException) e).getMostSpecificCause();
				errorMessage = ((DataAccessException) e).getMostSpecificCause().getMessage();
				if (t instanceof SQLException) {
					SQLException sqlExp = (SQLException) t;
					errorMessage = "SQL State : " + sqlExp.getSQLState() + " , Error Code : " + sqlExp.getErrorCode()
							+ " , Detailed Message " + sqlExp.getMessage();
				} else {
					throwable = t;
				}
			}
		}
		return new DatabaseException(errorMessage, throwable);
	}

	/**
	 * Gets the transaction from exception.
	 *
	 * @param e the e
	 * @return the transaction from exception
	 */
	public static DatabaseException getTransactionFromException(Exception e) {
		String errorMessage = e.getMessage();
		Throwable throwable = e;
		if (e instanceof TransactionSystemException) {
			if (((TransactionSystemException) e).getApplicationException() != null) {
				errorMessage = ((TransactionSystemException) e).getApplicationException().getMessage();
				throwable = ((TransactionSystemException) e).getApplicationException();
			}
		}
		return new DatabaseException(errorMessage, throwable);
	}
}