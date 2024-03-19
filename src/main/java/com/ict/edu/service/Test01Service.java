package com.ict.edu.service;

import java.util.Calendar;


import org.springframework.stereotype.Service;

@Service
public class Test01Service {
	public Test01Service() {
		System.out.println("Test01Service 생성자");
	}
	
	// 실행하는 메서드
	public String getGreeting() {
		String str = "";
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if (hour >= 7 && hour <= 8) {
			str = "좋은 아침";
		} else if (hour >= 12 && hour <= 14) {
			str = "맛점하세요";
		} else if (hour >= 19 && hour <= 20) {
			str = "수고하셨습니다";
		} else if (hour >= 23 && hour <= 24) {
			str = "좋은 꿈 꾸세요";
		} else {
			str = "오늘도 파이팅";
		}
		return str;
	}
}
