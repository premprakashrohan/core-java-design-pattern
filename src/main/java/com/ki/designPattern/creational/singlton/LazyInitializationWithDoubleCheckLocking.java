package com.ki.designPattern.creational.singlton;

public class LazyInitializationWithDoubleCheckLocking {
	 // private instance, so that it can be
	  // accessed by only by getInstance() method
	  private static LazyInitializationWithDoubleCheckLocking instance;
	 
	  private LazyInitializationWithDoubleCheckLocking() 
	  {
	    // private constructor
	  }
	 
	  public static LazyInitializationWithDoubleCheckLocking getInstance()
	  {
	    if (instance == null) 
	    {
	      //synchronized block to remove overhead
	      synchronized (LazyInitializationWithDoubleCheckLocking.class)
	      {
	        if(instance==null)
	        {
	          // if instance is null, initialize
	          instance = new LazyInitializationWithDoubleCheckLocking();
	        }
	       
	      }
	    }
	    return instance;
	  }
	}