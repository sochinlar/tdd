package com.test.tdd;

public class Franc extends Money{
	
	public Franc(int amount){
		this.amount=amount;
	}
	public Money times(int times){
		return new Franc(amount*times); 
	}
	
}
