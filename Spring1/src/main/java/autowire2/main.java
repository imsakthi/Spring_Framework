package autowire2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
   public static void main(String[] args) {
           ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
           payment p=(payment)context.getBean("payment");
           p.paymentoption();
           
}
}
