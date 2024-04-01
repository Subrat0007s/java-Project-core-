package com.banking.account;

public class Account {
	private String name;
	private Long acno;
	private Double bal;
	public Account(String name, Long acno2,double bal) {
		this.name = name;
		this.acno = acno2;
		this.bal=bal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAcno() {
		return acno;
	}
	public void setAcno(Long acno) {
		this.acno = acno;
	}
	public Double getBal() {
		return bal;
	}
	public void setBal(Double bal) {
		this.bal = bal;
	}
	
}
