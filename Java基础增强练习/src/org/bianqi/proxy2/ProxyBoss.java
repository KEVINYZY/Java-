package org.bianqi.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyBoss {
	
	@SuppressWarnings("unchecked")
	public static <T> T getProxy(final int discountCoupon,
			final Class<?> interfaceClass, final Class<?> implementsClass){
		return (T)Proxy.newProxyInstance(ProxyBoss.class.getClassLoader(), new Class[]{interfaceClass}, new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				Integer returnValue = (Integer) method.invoke(implementsClass.newInstance(), args);
				return returnValue - discountCoupon;
			}
		});
	}
}
