package com.test.tdd;

public class Sum implements Expression {
	Money augend;
	Money addend;
	Sum(Money augend,Money addend){
		this.addend=addend;
		this.augend=augend;
	}
	public Money reduce(Bank bank,String to){
		int amount=augend.amount+addend.amount;
		return new Money(amount,to);
	}
}
