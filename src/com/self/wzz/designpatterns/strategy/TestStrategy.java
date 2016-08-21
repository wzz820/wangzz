package com.self.wzz.designpatterns.strategy;

public class TestStrategy {

	public static void main(String[] args) {
		CashContext cc = new CashContext("3", "300","100");
		System.out.println(cc.getResult(500));
	}

}
