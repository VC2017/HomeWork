package com.java;
/**
 * ÔØÈËÆû³µ
 * @author zh201
 *
 */
public class PersonCar extends Car {
	public PersonCar(int id, String name,int zaike ,float price) {
		super(id,name,price);
		this.zaike = zaike;
	}
	public int getZaike(){
		return zaike;
	}
}
