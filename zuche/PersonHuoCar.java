package com.java;
/**
 * ¿Í³µ
 * @author zh201
 *
 */
public class PersonHuoCar extends Car {

	public PersonHuoCar(int id, String name,int zaike,int zaihuo, float price) {
		super(id, name, price);
		this.zaihuo = zaihuo;
		this.zaike = zaike;
	}
	public int getZaihuo(){
		return zaihuo;
	}
	public int getZaike(){
		return zaike;
	}
}
