package org.bianqi.jvm;
/**
 * 
 * <p>Title: DeadThread</p>
 * <p>Description: 测试死锁使用JVM可视化工具</p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年4月7日下午11:52:24
 * @version 1.0
 */
public class DeadThread implements Runnable{
	
	int a,b;

	public DeadThread(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		synchronized (Integer.valueOf(a)) {
			synchronized (Integer.valueOf(b)) {
				System.out.println(a + b);
			}
		}
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(new DeadThread(1, 2)).start();
			new Thread(new DeadThread(2, 1)).start();
		}
	}
	
}
