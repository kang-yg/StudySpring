package com.spring.example;

public class MyCalculator {
	


	private Calculator calculator;
	private int num1;
	private int num2;
	
	public MyCalculator() {}
	
	public void add() {
		calculator.funcAdd(num1,num2);
	}
	
	public void sub() {
		calculator.funcSub(num1,num2);
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}


}
