package com.ki.designPattern.creational.singlton;

public class ClonableSingleton implements Cloneable {
	private ClonableSingleton instance;
	
	private ClonableSingleton() {
		super();
	}
	public ClonableSingleton getInstance() {
		if(instance!=null) {
			return instance;
		}else {
			instance = new ClonableSingleton();
			return instance;
		}
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return getInstance();
	}

	
}
