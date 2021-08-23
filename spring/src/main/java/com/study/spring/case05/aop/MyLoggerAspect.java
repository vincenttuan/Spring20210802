package com.study.spring.case05.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect // 切面
@Order(1) // 數字越小越先被執行(預設 order 的數值是 int 的最大值)
public class MyLoggerAspect {
	// Pointcut 切入點是用來定義 JoinPoint 連接點
	@Pointcut(value = "execution(public int com.study.spring.case05.aop.CalcImpl.*(..))")
	public void pt() {}
	
	// 前置通知
	//@Before(value = "execution(public int com.study.spring.case05.aop.CalcImpl.add(int, int))") // 切入點表達式
	//@Before(value = "execution(public int com.study.spring.case05.aop.CalcImpl.*(..))") // 切入點表達式
	//@Before(value = "execution(* com.study.spring.case05.aop.CalcImpl.*(..))") // 切入點表達式
	//@Before(value = "execution(* com.study.spring.case05.aop.*.*(..))") // 切入點表達式
	//@Before(value = "execution(* *.*(..))") // 切入點表達式
	@Before(value = "pt()")
	public void before(JoinPoint joinPoint) {
		System.out.println("前置通知 - ");
		String methodName = joinPoint.getSignature().getName(); // 獲取方法
		Object[] args = joinPoint.getArgs(); // 獲取方法參數
		System.out.printf("方法名稱：%s，方法參數：%s\n", methodName, Arrays.toString(args));
	}
}
