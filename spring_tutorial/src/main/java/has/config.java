package has;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

     //instead of creating xml file for object creation or dependency injection in spring we go for configuration class
     //After executing annotatinapplicationcontext in main class it will come to this class
     //spring see componentscan with package path \
     //spring wil create object for all the class defiend with @component anotaion in specified package path

@Configuration
@ComponentScan(basePackages="has")
public class config {
	

}
