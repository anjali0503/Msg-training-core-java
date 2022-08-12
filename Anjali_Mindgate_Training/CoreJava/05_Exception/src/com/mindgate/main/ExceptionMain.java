package com.mindgate.main;

import java.util.InputMismatchException;

import com.mindgate.pojo.Calculation;

public class ExceptionMain {
	public static void main(String[] args) {
		
			System.out.println("Main start ");
			Calculation calculation = new Calculation();
			calculation.accept();
			calculation.calculate();
			calculation.display();
			System.out.println("main ends");
		
	}
}
