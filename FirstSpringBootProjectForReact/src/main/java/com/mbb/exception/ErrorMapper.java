package com.mbb.exception;

import java.time.LocalDate;

public class ErrorMapper {
	private String errMessage;
	private String uri;
	private LocalDate curDate;
	
	public ErrorMapper() {
		// TODO Auto-generated constructor stub
	}
	public ErrorMapper(String errMessage, String uri, LocalDate curDate) {
		super();
		this.errMessage = errMessage;
		this.uri = uri;
		this.curDate = curDate;
	}
	public String getErrMessage() {
		return errMessage;
	}
	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public LocalDate getCurDate() {
		return curDate;
	}
	public void setCurDate(LocalDate curDate) {
		this.curDate = curDate;
	}
	
	
	

}
