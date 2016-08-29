package com.self.wzz.designpatterns.proxy;

public class Pursuit implements IGiveGift {

	private SchoolGirl schoolGirl;
	
	public Pursuit(SchoolGirl girl){
		this.schoolGirl = girl;
	}
	
	@Override
	public void giveDolls() {
		System.out.println("give " + schoolGirl.getName() + " yang wa wa");
	}

	@Override
	public void giveFlowers() {
		System.out.println("give " + schoolGirl.getName() + " song hua");
	}

	@Override
	public void giveChocolate() {
		System.out.println("give " + schoolGirl.getName() + " qiao ke li");
	}

}
