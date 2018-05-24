package com.ki.designPattern.creational.abstaractFactoryMethod;

public class FactoryProvider {
	public static AbstractFactory getFactory(FactoryType choice) {

		if (FactoryType.animal == choice) {
			return new AnimalFactory();
		} else if (FactoryType.color == choice) {
			return new ColorFactory();
		}

		return null;
	}
}

enum FactoryType {
	animal, color
}