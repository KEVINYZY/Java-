package org.bianqi.proxy;

public class Person implements PersonInterface{

	@Override
	public void doSomeThing() {
		System.out.println("doSometing...");
	}

	@Override
	public void saySomeThing() {
		System.out.println("saysomething...");
	}
	
	private void xx(){
		System.out.println("MyPerson is xx its thing.....");
	}

}
