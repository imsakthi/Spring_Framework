package setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor.xml");
		student s=(student)context.getBean("s1");
		System.out.println(s);
		student s2=(student)context.getBean("s2");
		System.out.println(s2);
		
	}
}
