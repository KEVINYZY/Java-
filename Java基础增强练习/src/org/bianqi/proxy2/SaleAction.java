package org.bianqi.proxy2;

import org.junit.Test;

public class SaleAction {
	@Test
	public void saleByBossSelf() throws Exception {
		IBoss boss = new Boss();
		System.out.println("老板自己买");
		int money = boss.yifu("xxx");
		System.out.println("成交价"+money);
	}
}
