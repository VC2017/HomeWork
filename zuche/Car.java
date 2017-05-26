package com.java;
/**
 * 汽车类 载人汽车PersonCar 载重汽车KeCar 载人载重汽车PersonKeCar
 * id 编号
 * name 品牌
 * zaike 载客
 * zaihuo 载货
 * price 租金
 * @author zh201
 *
 */
public class Car {
	int id;
	String name;
	int zaike;
	int zaihuo;
	float price;
	public Car(int id,String name,float price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getZaike() {
		return zaike;
	}
	public int getZaihuo() {
		return zaihuo;
	}
	public float getPrice() {
		return price;
	}
	
}

