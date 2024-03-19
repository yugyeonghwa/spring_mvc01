package com.ict.edu2.service;

import org.springframework.stereotype.Service;

@Service
public class Test02Service {
	public int getCalc(int s1, int s2, String op) {
		int result = 0;
		switch (op) {
		case "+":
			result = s1 + s2; 
			break;
		case "-":
			result = s1 - s2; 
			break;
		case "*":
			result = s1 * s2; 
			break;
		case "/":
			result = s1 / s2; 
			break;
		}
		return result;
	}
}
