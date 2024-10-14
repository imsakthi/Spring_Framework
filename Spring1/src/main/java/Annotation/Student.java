package Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("s")
public class Student {
	@Value("1")
	int id;
	@Value("sakthi")
	String name;
	@Value("75.0")
	double marks;
	@Value("21")
	int age;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}

	
}
