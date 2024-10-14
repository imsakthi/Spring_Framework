package Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
  public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
	Student s=(Student) context.getBean("s");
	System.out.println(s);
}
}
