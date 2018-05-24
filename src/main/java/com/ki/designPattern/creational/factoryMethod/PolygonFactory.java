package com.ki.designPattern.creational.factoryMethod;

public class PolygonFactory {
	public Polygon getPolygon(int numberOfSides) {
		if (numberOfSides == 3) {
			return new Triangle();
		}
		if (numberOfSides == 4) {
			return new Square();
		}
		if (numberOfSides == 5) {
			return new Pentagon();
		}
		if (numberOfSides == 7) {
			return new Heptagon();
		} else if (numberOfSides == 8) {
			return new Octagon();
		}
		return null;
	}
	public static void main(String...strings ) {
		PolygonFactory factory = new PolygonFactory();
		System.out.println(factory.getPolygon(3).getType());
		System.out.println(factory.getPolygon(4).getType());
		System.out.println(factory.getPolygon(5).getType());
		System.out.println(factory.getPolygon(7).getType());
		System.out.println(factory.getPolygon(8).getType());
		
	}
}