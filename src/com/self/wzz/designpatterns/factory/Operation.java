package com.self.wzz.designpatterns.factory;

public class Operation {
	
	private double numberA;
	private double numberB;
	
	public double getResult(){
		double result = 0;
		return result;
	}

	public double getNumberA() {
		return numberA;
	}

	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}

	public double getNumberB() {
		return numberB;
	}

	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
}
