package org.bianqi.proxy2;

public class Boss implements IBoss{

	@Override
	public int yifu(String size) {
		System.err.println("衣服型号："+size);
		return 50;
	}
	
	public void kuzi(){
		System.err.println("裤子");
	}

}
