package com;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("paytm")
public class paytm implements paymentgateway {

	@Override
	
	public void paymentmethod() {
		System.out.println("payment via paytm................");
		
	}

}
