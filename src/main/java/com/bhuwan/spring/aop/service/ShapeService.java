/**
 * 
 */
package com.bhuwan.spring.aop.service;

import com.bhuwan.spring.aop.model.Circle;
import com.bhuwan.spring.aop.model.Triangle;

/**
 * @author bhuwan
 *
 */
public class ShapeService {

	private Circle circle;
	private Triangle triangle;

	/**
	 * @return the circle
	 */
	public Circle getCircle() {
		return circle;
	}

	/**
	 * @param circle
	 *            the circle to set
	 */
	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	/**
	 * @return the triangle
	 */
	public Triangle getTriangle() {
		return triangle;
	}

	/**
	 * @param triangle
	 *            the triangle to set
	 */
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

}
