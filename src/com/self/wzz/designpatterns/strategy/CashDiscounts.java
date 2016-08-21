package com.self.wzz.designpatterns.strategy;

public class CashDiscounts extends CashSuper{

	private double discounts = 0;
	
	public CashDiscounts(double discounts) {
		super();
		this.discounts = discounts;
	}

	@Override
	public double acceptCash(double money) {
		return money*discounts;
	}

	public double getDiscounts() {
		return discounts;
	}

	public void setDiscounts(double discounts) {
		this.discounts = discounts;
	}

}
