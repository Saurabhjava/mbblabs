package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mbb.cfg.MyConfig;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfig.class);
		HelloWorld h=ctx.getBean(HelloWorld.class);
		System.out.println(h.sayHello());
		 
		
		
	}

}
