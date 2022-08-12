package com.mindgate.pojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculation {
	private int num1;
	private int num2;
	private int result;

	public void accept() {
		Scanner scan;
		scan = new Scanner(System.in);
		try {

			System.out.println("Enter num1 :");
			num1 = scan.nextInt();
			System.out.println("Enter num2 :");
			num2 = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("invalid ");
		} finally {
			scan.close();
		}
	}

	public void calculate() {
		System.out.println("in calculate ");
		result = num1 + num2;
	}

	public void display() {
		System.out.println("result is : " + result);
	}
}
