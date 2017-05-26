package com.java;
/**
 * »õ³µ
 * @author zh201
 *
 */
public class HuoCar extends Car {

	public HuoCar(int id, String name,int zaihuo, float price) {
		super(id, name, price);
		this.zaihuo = zaihuo;
	}
	public int getZaihuo(){
		return zaihuo;
	}
}
