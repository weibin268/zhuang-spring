package com.zhuang.spring.test;

public class Father implements Person{

	private Car car;
	
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void driveCar() {
		
		System.out.println("Father driveCar");
		car.run();
		
	}

}
