package autowire2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("payment")
public class payment {
    @Autowired
    @Qualifier("googlepay")
	paymentgateway pg;
    
    @Autowired
    @Qualifier("paytm")    
    paymentgateway pg1;
	
	public void paymentoption(){
		 pg.paymentmethod();
		 pg1.paymentmethod();
	}
}
