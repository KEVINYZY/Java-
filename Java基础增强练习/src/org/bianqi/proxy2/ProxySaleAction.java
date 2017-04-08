package org.bianqi.proxy2;

public class ProxySaleAction {
	public static void main(String[] args) {
		IBoss boss = ProxyBoss.getProxy(10, IBoss.class, Boss.class);
		System.out.println("代理");
		int yifu = boss.yifu("xxl");
		System.out.println(yifu);
	}
}
