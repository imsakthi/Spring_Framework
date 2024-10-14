package Autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class passenger {
@Value("1")
 int id;
@Value("sakthi")
 String name;
@Value("male")
 String gender;
@Value("9444666018")
 long phone;
@Override
public String toString() {
	return "passenger [id=" + id + ", name=" + name + ", gender=" + gender + ", phone=" + phone + "]";
}

 
 
}
