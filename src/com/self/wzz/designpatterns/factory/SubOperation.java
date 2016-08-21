package com.self.wzz.designpatterns.factory;

public class SubOperation extends Operation{
	
	public double getResult(){
		double result = 0;
		result = super.getNumberA() - super.getNumberB();
		return result;
	}
}
