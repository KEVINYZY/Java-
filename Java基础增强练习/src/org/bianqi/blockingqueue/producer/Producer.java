package org.bianqi.blockingqueue.producer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	BlockingQueue<String> queue;
	
	
	public Producer(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}


	@Override
	public void run() {
		  System.out.println("I have made a product:"  
                  + Thread.currentThread().getName()); 
          String temp = "A Product, 生产线程："  
                  + Thread.currentThread().getName();  
          try {
			queue.put(temp);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//如果队列是满的话，会阻塞当前线
	}
	
}
