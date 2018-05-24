package com.ki.designPattern.creational.singlton;


public class ThreadsafeSinglton {
	private static ThreadsafeSinglton instance;
	private ThreadsafeSinglton() {
		super();
	}
	
	public synchronized static ThreadsafeSinglton createInstance() {
		if(instance!=null) {
			return instance;
		}
		else {
			instance = new ThreadsafeSinglton();
			return instance;
		}
		
	}
}
