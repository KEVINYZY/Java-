package org.bianqi.jvm;
/**
 * 
 */
import java.util.ArrayList;

public class TestMemory {
	static class OOMObject {
		public byte[] placeholder = new byte[64 * 1024*40];
	}

	public static void fillHeap(int num) throws Exception {
		ArrayList<OOMObject> list = new ArrayList<OOMObject>();
		for (int i = 0; i < num; i++) {
			Thread.sleep(50);
			list.add(new OOMObject());
		}
		System.gc();
	}

	public static void main(String[] args) throws Exception {
		Thread.sleep(1000);
		fillHeap(10000);
		Thread.sleep(2000);
	}
}