package org.fosstrak.tdt;

/**
 * A TDTException is thrown at runtime when the user supplies invalid or
 * incomplete input.
 */

public class TDTException extends RuntimeException {
	public TDTException() {
		super();
	}

	public TDTException(String msg) {
		super(msg);
	}
}