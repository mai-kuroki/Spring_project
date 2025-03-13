package com.example.demo.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.calculator.service.CalculatorService;

@Controller
public class CalculatorController {

	private final CalculatorService calculatorService;

	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	@GetMapping("calculator")
	public String showCalculator() {
		return "calculator.html";
	}

	@PostMapping("calculator")
	public String calculator(@RequestParam("num1") int num1,
			@RequestParam("num2") int num2,
			@RequestParam("operation") String operations, Model model) {
		try {
			int result = calculatorService.calculator(num1, num2, operations);
			model.addAttribute("num1", num1);
			model.addAttribute("num2", num2);
			model.addAttribute("operations", operations);
			model.addAttribute("result", result);
		} catch (ArithmeticException error) {
			model.addAttribute("error", error.getMessage());
		} catch (IllegalArgumentException error) {
			model.addAttribute("error", error.getMessage());
		}
		return "calculator";
	}
}
