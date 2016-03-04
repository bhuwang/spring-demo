/**
 * 
 */
package com.bhuwan.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author bhuwan
 *
 */
@Aspect
public class LoggingAspect {

	@Before("execution(public String getName())")
	public void loggingAdvice() {
		System.out.println("Advice method invoked inside LoggingAspect class.");
	}
}
