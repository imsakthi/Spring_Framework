package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
 public static void main(String[] args) {
	
	 ApplicationContext context =new AnnotationConfigApplicationContext(config.class);
	 team t=(team)context.getBean("t");
	 t.m1();
}
}
