package com.thread;

public class SimpleThread extends Thread{
	//running
	public void run() {
		for(int i =0;i<40;i++) {
			System.out.println("Thread in execution:"
		+Thread.currentThread().getName()+
		"\t value of i:"+i);
		}
	}//dead

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*  SimpleThread thread = new SimpleThread(); //born
      thread.start(); //ready to run or runnable
      thread.setName("Tom");
      thread.setPriority(MIN_PRIORITY);
      SimpleThread t1 = new SimpleThread();
      t1.start();
      t1.setName("Harry");
      SimpleThread t2 = new SimpleThread();
      t2.start();
      t2.setName("Ram");
      t2.setPriority(MAX_PRIORITY);*/
		
		AnotherThread at = new AnotherThread();
	}

}
