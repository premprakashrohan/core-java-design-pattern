package com.ki.designPattern.creational.abstaractFactoryMethod;

public class AnimalFactory implements AbstractFactory {

	public Animal getAnimal(AnimalType animalType) {
		return null;
	}

	public Color getColor(ColorType colorType) {
		throw new UnsupportedOperationException();
	}

}
enum AnimalType{dog,cow,ox,baffallo}