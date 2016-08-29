package com.self.wzz.designpatterns.decorator;

public class Finery extends Person {
	private Person componet;
	
	public void decorate(Person componet){
		this.componet = componet;
	}
	public void show(){
		if(componet != null){
			componet.show();
		}
	}
}
