package org.bianqi.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 
 * <p>Title: DesTask</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年4月7日下午11:47:42
 * @version 1.0
 */
public class DesTask {
	public static void main(String[] args) throws Exception{
		ObjectInputStream inputStream = 
				new ObjectInputStream(new FileInputStream("F://tasks"));
		ExecutorService pool = Executors.newCachedThreadPool();
		Task t = (Task) inputStream.readObject();
		pool.execute(t);
		inputStream.close();
		pool.shutdown();
	}
}
