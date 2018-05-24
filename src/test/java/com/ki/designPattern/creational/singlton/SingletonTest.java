package com.ki.designPattern.creational.singlton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

	@Test
	final public void testCreateInstance() {
		Singleton ins = Singleton.createInstance();
		Singleton ins1 = Singleton.createInstance();
		Assert.assertEquals(ins, ins1);
	}
	
	@Test
	final public void test2() {
		Singleton ins = Singleton.createInstance();
		Singleton ins1 = null ;
		try
        {
            Constructor[] constructors = 
            		Singleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) 
            {
                // Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                ins1 = (Singleton) constructor.newInstance();
                break;
            }
            Assert.assertNotEquals(ins, ins1);
        }
     
        catch (Exception e) 
        {
            e.printStackTrace();
        }
		
	}
	
	@Test
	final public void test3() {
		 try
	        {
	            Singleton instance1 = Singleton.createInstance();
	            ObjectOutput out 
	                = new ObjectOutputStream(new FileOutputStream("file.text"));
	            out.writeObject(instance1);
	            out.close();
	         
	            // deserailize from file to object
	            ObjectInput in 
	                = new ObjectInputStream(new FileInputStream("file.text"));
	            Singleton instance2 = (Singleton) in.readObject();
	            in.close();
	         
	            Assert.assertNotEquals(instance1, instance2);
	        } 
	         
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	
	@Test
	final public void test4() throws CloneNotSupportedException {
		Singleton instance1 = Singleton.createInstance();
	    Singleton instance2 = (Singleton) instance1.clone();
	    Assert.assertNotEquals(instance1, instance2);
	}
	}