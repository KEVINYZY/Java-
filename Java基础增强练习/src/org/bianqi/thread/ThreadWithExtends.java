package org.bianqi.thread;

import java.util.Random;
/**
 * <p>Title: ThreadWithExtends</p>
 * <p>Description: 线程1 练习</p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年4月7日下午11:12:26
 * @version 1.0
 */
public class ThreadWithExtends extends Thread{

		String flag;
		
		public ThreadWithExtends(String flag){
			this.flag = flag;
		}
		
		@Override
		public void run() {
			String tname = Thread.currentThread().getName();
			System.out.println(tname+"线程run ....");
			Random random = new Random();
			for(int i=0;i<20;i++){
				try {
					Thread.sleep(random.nextInt(10)*100);
					System.out.println(tname+ "...."+ flag);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	    public static void main(String[] args) {
		  ThreadWithExtends extends1 = new ThreadWithExtends("a");
		  ThreadWithExtends extends2 = new ThreadWithExtends("b");
		  
		  /**
		   * start和run的区别  run不会开启新的线程哦~~
		   */
//		  extends1.start();
//		  extends2.start();
		  /**
		   *    运行代码如下
		   *    Thread-0线程run ....
				Thread-1线程run ....
				Thread-1....b
				Thread-0....a
				Thread-0....a
				Thread-1....b
				Thread-1....b
		   */
		  
		  extends1.run();
		  extends2.run();
	      /**
	       * 运行代码如下
	       *    main线程run ....
				main....a
				main....a
				main....a
				main....a
				main....a
				main....a
				main....a
				main....a
				main....a
				main....a
				main....a
				main....a
				main....a
				main....a
				main....a
				main....a
				main....a
				main....a
				main....a
				main....a
				main线程run ....
				main....b
				main....b
	       */
	    	
		}
	
}
