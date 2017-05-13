package com.cloudcomputing.aura.utils;

/**
 * @author Ramanathan
 *
 * Enum Class for the status of the response that are available
 * 
 */
public enum ResponseStatus {

	SUCCESS("Success"), FAILURE("Failure");

	private String detail;

	ResponseStatus(String detail) {
		this.detail = detail;
	}

	public String detail() {
		return detail;
	}

}
