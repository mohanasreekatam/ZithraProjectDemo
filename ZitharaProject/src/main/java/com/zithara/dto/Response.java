package com.zithara.dto;

public class Response {

	private int errorCode;
	private String errorDescriptin;

	public Response(int errorCode, String errorDescriptin) {
		this.errorCode = errorCode;
		this.errorDescriptin = errorDescriptin;
	}

	@Override
	public String toString() {
		return "Response [errorCode=" + errorCode + ", errorDescriptin=" + errorDescriptin + "]";
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDescriptin() {
		return errorDescriptin;
	}

	public void setErrorDescriptin(String errorDescriptin) {
		this.errorDescriptin = errorDescriptin;
	}
}
