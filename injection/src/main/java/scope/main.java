package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
	student s=(student)context.getBean("s");
	
}
}
