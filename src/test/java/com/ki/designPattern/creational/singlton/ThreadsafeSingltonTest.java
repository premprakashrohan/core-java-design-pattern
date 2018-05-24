package com.ki.designPattern.creational.singlton;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.anarsoft.vmlens.concurrent.junit.ConcurrentTestRunner;
import com.anarsoft.vmlens.concurrent.junit.ThreadCount;

@RunWith(ConcurrentTestRunner.class)
public class ThreadsafeSingltonTest {
	Set<ThreadsafeSinglton> instance = new HashSet<ThreadsafeSinglton>();
	Set<Singleton> sInstance = new HashSet<Singleton>();
	private final static int THREAD_COUNT = 500;
	@Before
	public void initialCount() {
		instance.add(ThreadsafeSinglton.createInstance());
	}

	@Test
	@ThreadCount(THREAD_COUNT)
	public void addOne() {
		instance.add(ThreadsafeSinglton.createInstance());
		sInstance.add(Singleton.createInstance());
		System.out.println("run...."+sInstance);
		
	}

	@After
	public void testCount() {
		Assert.assertEquals(instance.size(), 1);
		Assert.assertNotEquals(sInstance.size(), 1);
	}

	@Test
	final public void test() {

		instance.add(ThreadsafeSinglton.createInstance());
	}

}
