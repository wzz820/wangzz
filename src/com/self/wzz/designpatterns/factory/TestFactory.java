package com.self.wzz.designpatterns.factory;

public class TestFactory {

	public static void main(String[] args) {
		Operation oper = OperationFactory.createOperation("/");
		oper.setNumberA(5);
		oper.setNumberB(6);
		System.out.println(oper.getResult());
	}

}
