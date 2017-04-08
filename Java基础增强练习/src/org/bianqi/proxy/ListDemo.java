package org.bianqi.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		final List array = new ArrayList();
		Object list = Proxy.newProxyInstance(ListDemo.class.getClassLoader(), array.getClass().getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				/******************这里可以做你想做的事****************/
						System.err.println("start");
						Object invoke = method.invoke(array, args);
						System.out.println("end");
				/*************************************************/
				if(method.getName().equals("size")){
					return 100;
				}
				return invoke;
			}
		});
		List list2 = (List) list;
		list2.add("333");
		list2.add("333");
		System.out.println(list2.size()+":::::::::::"+array.size());
	}
}
