/**
 * 
 */
package com.bhuwan.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhuwan.spring.aop.service.ShapeService;

/**
 * @author bhuwan
 *
 */
public class AopMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		System.out.println(shapeService.getCircle().getName());
	}

}
