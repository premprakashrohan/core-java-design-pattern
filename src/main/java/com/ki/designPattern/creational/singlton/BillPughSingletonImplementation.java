package com.ki.designPattern.creational.singlton;

public class BillPughSingletonImplementation {
	// Java code for Bill Pugh Singleton Implementaion

	private BillPughSingletonImplementation() {
		// private constructor
	}

	// Inner class to provide instance of class
	private static class BillPughSingleton {
		private static final BillPughSingletonImplementation INSTANCE = new BillPughSingletonImplementation();
	}

	public static BillPughSingletonImplementation getInstance() {
		return BillPughSingleton.INSTANCE;
	}
}
