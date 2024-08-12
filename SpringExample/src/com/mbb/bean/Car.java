package com.mbb.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Value("${cname}")
	private String carName;
	@Value("${color}")
	private String color;
	private Tyre ceat;	
	
	//@Autowired
	public Car(@Qualifier("mrf") Tyre ceat) {
		this.ceat=ceat;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void printCarDetails() {
		System.out.println("Car Name:"+carName);
		System.out.println("Car Color:"+color);
		System.out.println("This car has "+ceat.tyreName() +" Tyre");
	}
}
