package com.yo;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 我类路径 XML 路径应用程序上下文
 *
 * @author wangts
 * @date 2024/06/10
 * @see ClassPathXmlApplicationContext
 * @since 1.0.0
 */
public class MyClassPathXmlPathApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlPathApplicationContext(String... configLocations) {
		super(configLocations);
	}


	@Override
	protected void initPropertySources() {
		System.out.println("扩展initPropertySources");
		getEnvironment().setRequiredProperties("username");
		getEnvironment().validateRequiredProperties();
	}


	/**
	 * 定制bean工厂
	 *
	 * @param beanFactory 豆厂
	 */
	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		beanFactory.setAllowBeanDefinitionOverriding(false);
		beanFactory.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);
	}
}
