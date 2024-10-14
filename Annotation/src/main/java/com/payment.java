package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("payment")
public class payment {
    @Autowired
	paymentgateway pg;
	
	public void paymentdetails() {
		pg.paymentmethod();
	}
	
}
