package com.zzy.demo.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SampleAspect {
	/*1>execution定义了pointcut
	 * 2>@Before定义了Advice被插入的位置，doBeforeService定义了具体的切面逻辑，两者合称advice*/
	@Before("execution(* com.zzy.demo.spring.service..*.*(..))")
	public void doBeforeService(){
		System.out.println("Aop: do before in Service layer");
	}
}
