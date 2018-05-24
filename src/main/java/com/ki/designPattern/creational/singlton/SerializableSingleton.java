package com.ki.designPattern.creational.singlton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {
	private static SerializableSingleton instance;

	private SerializableSingleton() {
		super();
	}

	protected Object readResolve() {
		return createInstance();
	}

	public static SerializableSingleton createInstance() {
		if (instance != null) {
			return instance;
		} else {
			instance = new SerializableSingleton();
			return instance;
		}

	}
}
