package comm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		student s=(student)context.getBean("s");
		System.out.println(s);
	}

}
