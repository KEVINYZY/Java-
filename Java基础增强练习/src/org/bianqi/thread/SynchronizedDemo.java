package org.bianqi.thread;
/**
 * <p>Title: SynchronizedDemo</p>
 * <p>Description: synchroized 使用注意</p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年4月7日下午11:27:39
 * @version 1.0
 */
public class SynchronizedDemo {
	
	public static void main(String[] args) {
		final SynchronizedDemo demo1 = new SynchronizedDemo();
		final SynchronizedDemo demo2 = new SynchronizedDemo();
		
		new Thread("thread1"){
			public void run() {
				synchronized (demo1) { //持有相同的锁哦
					System.out.println(this.getName()+"start...");
					int i = 1/0;  //发生异常 就释放锁 区别于lock 
					try {
						Thread.sleep(5000);
						System.out.println(this.getName()+"sleep...");
						System.out.println(this.getName()+"end");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		}.start();
		
		
		new Thread("thread2"){
			public void run() {
				synchronized (demo1) {
					System.out.println(this.getName()+"strat");
					System.out.println(this.getName()+"end");
				}
			};
		
		}.start();
	}
}
