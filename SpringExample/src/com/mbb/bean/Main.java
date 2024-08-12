package com.mbb.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mbb.cfg.MyConfig;

public class Main {

	public static void main(String[] args) {
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		ApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfig.class);
		Car c=ctx.getBean(Car.class);
		c.printCarDetails();
		((AnnotationConfigApplicationContext)ctx).close();
	}

}
