package com.self.wzz.designpatterns.factory;

public class MulOperation extends Operation{
	
	public double getResult(){
		double result = 0;
		result = super.getNumberA() * super.getNumberB();
		return result;
	}
}
