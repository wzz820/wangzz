package com.self.wzz.designpatterns.strategy;

public class CashContext {
	
	CashSuper cs = null;
	
	public CashContext(String type,String ... args){
		switch(type){
		case "1":
			CashNormal normal = new CashNormal();
			cs = normal;
			break;
		case "2":
			CashDiscounts discounts = new CashDiscounts(Double.parseDouble(args[0]));
			cs = discounts;
			break;
		case "3":
			CashReturn re = new CashReturn(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
			cs = re;
			break;
		}
	}
	
	public double getResult(double money){
		return cs.acceptCash(money);
	}
}
