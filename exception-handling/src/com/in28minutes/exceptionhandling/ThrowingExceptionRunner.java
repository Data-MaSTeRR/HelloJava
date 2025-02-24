package com.in28minutes.exceptionhandling;

class Amount {
	private String currency;
	private int amount;
	
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	
	public void add(Amount that) {
		// 통화가 같지 않을 경우, 오류를 출력하는 예외처리 추가  
		if(!this.currency.equals(that.currency)) {
			throw new RuntimeException("Currencies Don't Match " +
					this.currency + " & " + that.currency); // RuntimeException은 checked exception에 해당
		}
		
		this.amount = this.amount + that.amount;
	}
	
	public String toString() {
		return amount + " " + currency;
	}
	
}

public class ThrowingExceptionRunner {

	public static void main(String[] args) {
		
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 20);
		
		amount1.add(amount2);
		System.out.println(amount1);
		
	}

}
