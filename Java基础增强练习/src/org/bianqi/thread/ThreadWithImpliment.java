package org.bianqi.thread;
/**
 * <p>Title: MyThreadWithImpliment</p>
 * <p>Description: 开启线程的第二种方法</p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年4月7日下午11:22:33
 * @version 1.0
 */
public class ThreadWithImpliment implements Runnable {
	int index;

	public ThreadWithImpliment(int index) {
		this.index = index;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("线程" + name + "的run方法被调用……");
		for (int i = 0; i < 10; i++) {
			System.out.println(name+"....."+index);
			try {
				Thread.sleep(100);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadWithImpliment(1), "thread-1");
		Thread thread2 = new Thread(new ThreadWithImpliment(2), "thread-2");
//		thread1.start();
//		thread2.start();
		 thread1.run();
		 thread2.run();
	}

}
