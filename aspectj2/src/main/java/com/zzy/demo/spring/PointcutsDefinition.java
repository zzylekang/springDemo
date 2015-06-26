package com.zzy.demo.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutsDefinition {
	
	@Pointcut(value="execution(* com.zzy.demo.spring.service..*.*(..))")
	public void serviceBeforePointcuts(){}
}
