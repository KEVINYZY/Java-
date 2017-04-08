package org.bianqi.serializable;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>Title: Task</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年4月7日下午11:44:07
 * @version 1.0
 */
public class Task implements Runnable,Serializable{

	@Override
	public void run() {
		System.out.println(new Date());
	}

}
