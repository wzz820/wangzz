package com.self.wzz.designpatterns.factory;

public class OperationFactory {

	public static Operation createOperation(String operate){
		Operation oper = null;
		switch(operate){
		case "+":
			oper = new AddOperation();
			break;
		case "-":
			oper = new SubOperation();
			break;
		case "*":
			oper = new MulOperation();
			break;
		case "/":
			oper = new DivOperation();
			break;
		}
		return oper;
	}
}
