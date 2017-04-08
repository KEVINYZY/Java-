package org.bianqi.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 
 * <p>Title: SerTask</p>
 * <p>Description: 序列化</p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年4月7日下午11:44:40
 * @version 1.0e
 */
public class SerTask {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Task task = new Task();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F://tasks"));
		oos.writeObject(task);
		oos.close();
	
	}
}
