package com.self.wzz.designpatterns.strategy;

public class CashReturn extends CashSuper{
	
	private double condition = 0;
	private double moneyReturn = 0;
	
	public CashReturn(double condition, double moneyReturn) {
		super();
		this.condition = condition;
		this.moneyReturn = moneyReturn;
	}

	@Override
	public double acceptCash(double money) {
		double result = money;
		if(money >= condition){
			result = money - (new Double(money/condition)).intValue()*moneyReturn;
		}
		return result;
	}

	public double getCondition() {
		return condition;
	}

	public void setCondition(double condition) {
		this.condition = condition;
	}

	public double getMoneyReturn() {
		return moneyReturn;
	}

	public void setMoneyReturn(double moneyReturn) {
		this.moneyReturn = moneyReturn;
	}

}
