package com.study.spring.case05.aop_dancer;

import java.util.Date;

public class Dancer implements Performance {

	@Override
	public void perform() {
		System.out.println("舞者表演開始，跳舞、轉圈、翻滾...");
		if(new Date().getTime() % 3 == 0) {
			throw new RuntimeException("舞者跌倒");
		}
	}
	
}
