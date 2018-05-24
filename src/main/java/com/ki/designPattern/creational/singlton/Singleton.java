package com.ki.designPattern.creational.singlton;

import java.io.Serializable;

public class Singleton implements Cloneable,Serializable{
	private static Singleton instance;
	private Singleton() {
		super();
	}
	@Override
	  protected Object clone() throws CloneNotSupportedException 
	  {
	    return super.clone();
	  }
	public static Singleton createInstance() {
		if(instance!=null) {
			return instance;
		}
		else {
			instance = new Singleton();
			return instance;
		}
		
	}
	 

}
