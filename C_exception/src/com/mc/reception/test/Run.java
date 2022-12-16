package com.mc.reception.test;

import com.mc.reception.custom.TimeOutException;

public class Run {

	public static void main(String[] args) {
		
		SmartPhone phone = new SmartPhone();
		//phone.setPrica(-10);
		
		try {
			phone.sendMessage();
		} catch (TimeOutException e) {
			e.printStackTrace();
		}
		
	}
}
