package com.self.wzz.designpatterns.strategy;

public class CashNormal extends CashSuper{

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
