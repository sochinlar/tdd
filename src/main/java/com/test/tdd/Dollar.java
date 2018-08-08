package com.test.tdd;

public class Dollar extends Money{
	public int amount;
	
	public Dollar(int amount){
		this.amount=amount;
	}
	public Money times(int times){
		return new Dollar(amount*times); 
	}
	
	
}
