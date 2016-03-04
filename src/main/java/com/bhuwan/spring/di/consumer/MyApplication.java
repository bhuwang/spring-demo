/**
 * 
 */
package com.bhuwan.spring.di.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bhuwan.spring.di.service.MessageService;

/**
 * @author bhuwan
 *
 */
@Component
public class MyApplication {

	// Field based dependency injection
	@Autowired
	private MessageService messageService;

	/*
	 * // Constructor based dependency injection
	 * 
	 * @Autowired public MyApplication(MessageService messageService) {
	 * this.messageService = messageService; }
	 * 
	 * // Setter based dependency injection
	 * 
	 * @Autowired public void setMessageService(MessageService messageService) {
	 * this.messageService = messageService; }
	 */
	
	public boolean processMessage(String message, String recipents){
		return messageService.sendMessage(message, recipents);
	}

}
