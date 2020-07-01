package com.umar.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorApp 
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("CalApp.xml");
		
		Calculator calculator = (Calculator) context.getBean("calculator");
		
		System.out.println(calculator.add(1,2));
		System.out.println(calculator.subtract(1,2));
		System.out.println(calculator.multiply(1,2));
		System.out.println(calculator.divide(1,2));
		
	}

}
