package org.bianqi.lock;
/**
 * <p>Title: CPUNum</p>
 * <p>Description: 测试CPU的逻辑核数量</p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年4月7日下午11:32:35
 * @version 1.0
 */
public class CPUNum {
	public static void main(String[] args) {
		int num = Runtime.getRuntime().availableProcessors();
		System.out.println(num);
	}
}
