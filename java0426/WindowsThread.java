package com.java;

public class WindowsThread extends Thread{
	Windows wd;
	public WindowsThread(Windows wd){
		this.wd = wd;
	}
	@Override
	public void run() {
		wd.sal();
	}
}
