package org.bianqi.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyPerson {
	public static void main(String[] args) {
		final Person p = new Person();
		PersonInterface proxy = (PersonInterface) Proxy.newProxyInstance(Person.class.getClassLoader(), Person.class.getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("proxy is coming....");
				if(method.getName() =="saySomeThing"){
					System.out.println("say some thing");;
					p.saySomeThing();
				}else{
					Object invoke = method.invoke(p, args);
					System.out.println("proxy leave");
				}
				return null;
			}
		});
		proxy.doSomeThing();
		proxy.saySomeThing();
	}
}
