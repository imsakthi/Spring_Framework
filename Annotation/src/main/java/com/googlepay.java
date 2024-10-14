package com;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("googlepay")
@Primary
public class googlepay implements paymentgateway {

	@Override
	public void paymentmethod() {
		System.out.println("payment using googlepay................");
		
	}

}
