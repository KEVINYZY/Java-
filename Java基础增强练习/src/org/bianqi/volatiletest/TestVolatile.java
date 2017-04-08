package org.bianqi.volatiletest;
/**
 * <p>Title: TestVolatile</p>
 * <p>Description: volatile 变量安全性测试</p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年4月7日下午11:41:30
 * @version 1.0
 */
public class TestVolatile {

	public static volatile int numb = 0;

	public static void main(final String[] args) throws InterruptedException {

		for (int i = 0; i < args.length; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					for (int j = 0; j < args.length; j++) {
						numb++;
					}
				}
			}).start();

			Thread.sleep(2000);
			System.out.println(numb);
		}

	}
}
