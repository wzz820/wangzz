package com.self.wzz.designpatterns.decorator;

public class TestDecorate {
	public static void main(String[] args){
		Person person = new Person("zz");
		Tshirts t = new Tshirts();
		BigTrouser b = new BigTrouser();
		t.decorate(person);
		b.decorate(t);
		b.show();
	}
}
