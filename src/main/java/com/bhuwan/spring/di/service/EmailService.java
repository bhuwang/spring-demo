/**
 * 
 */
package com.bhuwan.spring.di.service;

/**
 * @author bhuwan
 *
 */
public class EmailService implements MessageService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bhuwan.spring.di.service.MessageService#sendMessage(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public boolean sendMessage(String message, String recipents) {
		System.out.println("Email sent to : " + recipents + " with message: " + message);
		return true;
	}

}
