package com.ki.designPattern.creational.abstaractFactoryMethod;

public class ColorFactory implements AbstractFactory {

	public Animal getAnimal(AnimalType animalType) {
		throw new UnsupportedOperationException();
	}

	public Color getColor(ColorType colorType) {
		return null;
	}

}
enum ColorType{red,blue,green}
