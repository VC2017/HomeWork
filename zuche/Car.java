package com.java;
/**
 * ������ ��������PersonCar ��������KeCar ������������PersonKeCar
 * id ���
 * name Ʒ��
 * zaike �ؿ�
 * zaihuo �ػ�
 * price ���
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

