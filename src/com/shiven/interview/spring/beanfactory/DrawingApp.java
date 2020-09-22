package com.shiven.interview.spring.beanfactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	
	public static void main(String[] args) {
	//	XmlBeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//by using classpathxmlapplicationcontext it will read from class path unlike above, to read about difference application context 
		//and xmlbeanfactory.
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) applicationContext.getBean("triangleDi");
		triangle.draw();
		
	}

}
