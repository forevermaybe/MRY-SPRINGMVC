package com.mry.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MyProxy implements MethodInterceptor {

	Object target;

	public MyProxy(Object obj) {
		super();
		this.target = obj;
	}

	public Object getInstance() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] arg2, MethodProxy proxy) throws Throwable {
		System.out.println("方法名:" + method.getName());
		Object aim = proxy.invokeSuper(obj, arg2);
		return aim;
	}

}
