/**
 * 
 */
package com.bhuwan.spring.di.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bhuwan.spring.di.service.MessageService;
import com.bhuwan.spring.di.service.TwitterService;

/**
 * @author bhuwan
 *
 */
@Configuration
@ComponentScan(value = "com.bhuwan.spring.di.consumer")
public class DiConfiguration {

	@Bean
	public MessageService getMessageService() {
		return new TwitterService();
	}
}
