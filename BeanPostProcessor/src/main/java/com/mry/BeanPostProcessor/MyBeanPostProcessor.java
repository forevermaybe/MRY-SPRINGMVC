package com.mry.BeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.mry.anno.MryAnno;
import com.mry.proxy.MyProxy;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean.getClass().getDeclaredAnnotation(MryAnno.class) != null) {
			MyProxy proxy = new MyProxy(bean);
			return proxy.getInstance();
		}
		return bean;
	}

}
