package com.returnordermanag.paymentService.Model;

import org.springframework.stereotype.Component;

@Component
public class PaymentData {
	
	private String CusName;
	private String CreditCardNumber;
	private int CreditLimit;
	private float CurrentBalance;
	
	public String getCusName() {
		return CusName;
	}
	public void setCusName(String cusName) {
		CusName = cusName;
	}
	public String getCreditCardNumber() {
		return CreditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		CreditCardNumber = creditCardNumber;
	}
	public int getCreditLimit() {
		return CreditLimit;
	}
	public void setCreditLimit(int creditLimit) {
		CreditLimit = creditLimit;
	}
	public float getCurrentBalance() {
		return CurrentBalance;
	}
	public void setCurrentBalance(float currentBalance) {
		CurrentBalance = currentBalance;
	}
	
	public float ReturnCurrentBalnce (String CreditCardNumber) {
		
		return 120000;
	}

}
