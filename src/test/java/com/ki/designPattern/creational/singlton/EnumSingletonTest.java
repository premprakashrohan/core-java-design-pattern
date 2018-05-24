package com.ki.designPattern.creational.singlton;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Assert;
import org.junit.Test;

public class EnumSingletonTest {

	@Test
	final public void testCreateInstance() {
		Assert.assertEquals(EnumSingleton.INSTANCE, EnumSingleton.INSTANCE);
	}
	
	@Test(expected=IllegalArgumentException.class)
	final public void test2() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		EnumSingleton ins = EnumSingleton.INSTANCE;
		EnumSingleton ins1 = null ;
		 
            Constructor[] constructors = 
            		EnumSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) 
            {
                // Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                ins1 = (EnumSingleton) constructor.newInstance();
                break;
            }
            Assert.assertEquals(ins, ins1);
        }
     
       
		// Assert.assertEquals(ins1, null);
	
	@Test
	final public void test3() {
		 try
	        {
	            EnumSingleton instance1 = EnumSingleton.INSTANCE;
	            ObjectOutput out 
	                = new ObjectOutputStream(new FileOutputStream("file.text"));
	            out.writeObject(instance1);
	            out.close();
	         
	            // deserailize from file to object
	            ObjectInput in 
	                = new ObjectInputStream(new FileInputStream("file.text"));
	            EnumSingleton instance2 = (EnumSingleton) in.readObject();
	            in.close();
	         
	            Assert.assertEquals(instance1, instance2);
	        } 
	         
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	
	@Test
	final public void test4() throws CloneNotSupportedException {
		EnumSingleton instance1 = EnumSingleton.INSTANCE;
	    //EnumSingleton instance2 = (EnumSingleton) instance1.clone();
	    Assert.assertEquals(instance1, EnumSingleton.INSTANCE);
	}
}
