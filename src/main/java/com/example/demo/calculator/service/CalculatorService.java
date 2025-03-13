package com.example.demo.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public int calculator(int num1, int num2, String operations) {
		switch (operations) {
		case "+":
			return num1 + num2;
		case "-":
			return num1 - num2;
		case "×":
			return num1 * num2;
		case "÷":
			if (num2 == 0) {
				throw new ArithmeticException("ゼロ除算はできません");
			} else {
				return num1 / num2;
			}
		default:
			throw new IllegalArgumentException("無効");
		}
	}
}
