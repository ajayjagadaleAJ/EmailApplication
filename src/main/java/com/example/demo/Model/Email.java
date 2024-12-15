package com.example.demo.Model;

public class Email {
	
	private String to;
	private String subject;
	private String message;
	private String otp;
	
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Email [to=" + to + ", subject=" + subject + ", message=" + message + ",opt=" + otp + "]";
	}
	
	
	

}
