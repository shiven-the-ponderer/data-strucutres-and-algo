package com.shiven.interview.spring.lifecyclecallbacks;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args) {
	//	XmlBeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//by using classpathxmlapplicationcontext it will read from class path unlike above, to read about difference application context 
		//and xmlbeanfactory.
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		applicationContext.registerShutdownHook();
		Triangle triangle = (Triangle) applicationContext.getBean("triangleCallBack");
		triangle.draw();
		
	}

}
