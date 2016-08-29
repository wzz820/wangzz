package com.self.wzz.designpatterns.proxy;

public class TestProxy {
	
	public static void main(String[] args){
		SchoolGirl girl = new SchoolGirl();
		girl.setName("jj");
		
		Proxy proxy = new Proxy(girl);
		proxy.giveDolls();
		proxy.giveFlowers();
		proxy.giveChocolate();
	}

}
