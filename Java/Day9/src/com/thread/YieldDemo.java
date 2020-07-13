package com.thread;

class Test implements Runnable
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName() + " " + i);
			Thread.yield();	// gives chance to the same priority thread to run
		}
	}
}

public class YieldDemo 
{
	public static void main(String[] args) 
	{
		Test tt = new Test();
		ThreadGroup tg = new ThreadGroup("MyThreads");
		Thread t1 = new Thread(tg,tt, "First");
		Thread t2 = new Thread(tg,tt, "Second");
		t1.setDaemon(true);		
		t1.start();
		t2.start();
		System.out.println("Active Threads:"+tg.activeCount());
		System.out.println("Max Count:"+tg.getMaxPriority());
		
	
		
	//	t1.setPriority(7);
		//t2.setPriority(8);
	}
}
