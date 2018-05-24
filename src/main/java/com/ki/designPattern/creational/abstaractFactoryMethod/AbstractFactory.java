package com.ki.designPattern.creational.abstaractFactoryMethod;

public interface AbstractFactory {
	Animal getAnimal(AnimalType animalType) ;
    Color getColor(ColorType colorType);
}
