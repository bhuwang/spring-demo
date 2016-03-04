/**
 * 
 */
package com.bhuwan.spring.di.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhuwan.spring.di.configuration.DiConfiguration;
import com.bhuwan.spring.di.consumer.MyApplication;

/**
 * @author bhuwan
 *
 */
public class ClientApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfiguration.class);
		MyApplication app = context.getBean(MyApplication.class);
		app.processMessage("Dear Bhuwan", "bhuwaneshworgautam@gmail.com");
		context.close();
	}
}
