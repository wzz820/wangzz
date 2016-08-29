package com.self.wzz.designpatterns.proxy;

public class Proxy implements IGiveGift{

	private Pursuit pursuit;
	
	public Proxy(SchoolGirl girl){
		pursuit = new Pursuit(girl);
	}

	@Override
	public void giveDolls() {
		pursuit.giveDolls();
	}

	@Override
	public void giveFlowers() {
		pursuit.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		pursuit.giveChocolate();
	}
	
}
