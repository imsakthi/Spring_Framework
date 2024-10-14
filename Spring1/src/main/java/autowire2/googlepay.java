package autowire2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("googlepay")
@Qualifier("googlepay")
public class googlepay implements paymentgateway{

	@Override
	public void paymentmethod() {
		System.out.println("payment via googlepay ............");
		
	}

	

}
