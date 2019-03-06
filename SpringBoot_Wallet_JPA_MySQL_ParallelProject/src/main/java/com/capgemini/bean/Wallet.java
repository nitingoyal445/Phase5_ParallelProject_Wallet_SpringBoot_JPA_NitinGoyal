package com.capgemini.bean;

import java.math.BigDecimal;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
//import javax.persistence.Entity;
//import javax.persistence.Table;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

@Embeddable
public class Wallet {
@Override
	public String toString() {
		return "Wallet [balance=" + balance + "]";
	}
@NotNull
@PositiveOrZero
private BigDecimal balance;
public BigDecimal getBalance() {
	return balance;
}
public void setBalance(BigDecimal balance) {
	this.balance=balance;
}
}
