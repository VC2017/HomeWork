package com.test;

import java.util.Date;

import java.text.SimpleDateFormat;

public class Demo {

	public static void main(String[] args) {
		SimpleDateFormat sfd = new SimpleDateFormat("yyyy-M-d H:m:s");
		System.out.println(sfd.format(new Date()));
		String s= "456";
		int i = Integer.parseInt(s);
		System.out.println(i);
	}
}
