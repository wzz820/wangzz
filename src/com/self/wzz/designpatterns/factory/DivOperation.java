package com.self.wzz.designpatterns.factory;

public class DivOperation extends Operation{
	
	public double getResult(){
		double result = 0;
		if(super.getNumberB() == 0){
			return 0;
		}
		result = super.getNumberA() / super.getNumberB();
		return result;
	}
}
