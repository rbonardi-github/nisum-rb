/**
 * 
 */
package com.nisum.users.utils;

/**
 * @author 190962 - Ricardo Ibarra
 *
 */
public class ExpectedMockException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public ExpectedMockException() {
	}

	/**
	 * @param message
	 */
	public ExpectedMockException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ExpectedMockException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ExpectedMockException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ExpectedMockException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
