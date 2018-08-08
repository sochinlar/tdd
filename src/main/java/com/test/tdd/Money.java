package com.test.tdd;

abstract class Money {
	protected int amount;
	@Override
	public boolean equals(Object obj){
		Money target=(Money) obj;
		return amount==target.amount &&
				getClass().equals(target.getClass());
	}
	
	
	public static Dollar dollar(int amount){
		return new Dollar(amount);
	}
	
	public static Franc franc(int amount){
		return new Franc(amount);
	}
	
	abstract Money times(int multiple);
}
