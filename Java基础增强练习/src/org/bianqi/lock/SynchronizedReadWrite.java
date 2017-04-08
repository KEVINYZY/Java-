package org.bianqi.lock;
/**
 * 
 * <p>Title: SynchronizedReadWrite</p>
 * <p>Description: 读写锁</p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年4月7日下午11:33:58
 * @version 1.0
 */
public class SynchronizedReadWrite {
	public static void main(String[] args) {
		final SynchronizedReadWrite obj = new SynchronizedReadWrite();
		new Thread(){
			public void run() {
				obj.get(Thread.currentThread());
				
			};
		}.start();
		
		new Thread(){
			public void run() {
				obj.get(Thread.currentThread());
			};
		}.start();
		
	}
	
	public synchronized void get(Thread thread) {
        long start = System.currentTimeMillis();
        int i=0;
        while(System.currentTimeMillis() - start <= 1) {
        	i++;
        	if(i%4==0){
            System.out.println(thread.getName()+"正在进行写操作");
        	}else {
        		System.out.println(thread.getName()+"正在进行读操作");	
			}
        }
        System.out.println(thread.getName()+"读写操作完毕");
    }
}
