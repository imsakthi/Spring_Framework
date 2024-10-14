package Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("t")
public class Train {
 @Value("12345")
 int tno;
 @Value("VandeBharat")
 String trainname;
 @Value("Chennai")
 String from;
 @Value("Bangalore")
 String to;
 @Autowired
 passenger p;
@Override
public String toString() {
	return "Train [tno=" + tno + ", trainname=" + trainname + ", from=" + from + ", to=" + to + ", p=" + p + "]";
}
 

 
}
