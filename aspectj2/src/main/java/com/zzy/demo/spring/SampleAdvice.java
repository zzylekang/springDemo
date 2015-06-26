package com.zzy.demo.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SampleAdvice {
	@Before("com.zzy.demo.spring.PointcutsDefinition.serviceBeforePointcuts()")
	public void doBeforeService(){
		System.out.println("Aop: do before in Service layer");
	}
}
