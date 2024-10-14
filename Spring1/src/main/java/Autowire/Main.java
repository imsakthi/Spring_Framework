package Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
	Train t=(Train)context.getBean("t");
	System.out.println(t);
	
}
}
