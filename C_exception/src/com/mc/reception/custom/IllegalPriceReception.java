package com.mc.reception.custom;

//UnCheckedException 
//RuntimeException을 상속 받아 구현
public class IllegalPriceReception extends RuntimeException{

	private static final long serialVersionUID = 7520343738510302872L;
	
	public IllegalPriceReception() {
		super("가격은 0보다 작을 수 없습니다.");
	}

	public IllegalPriceReception(String message) {
		super(message);
	}
	
	

}
