package lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("t")
public class team {

	@PostConstruct
	public void init() {
		System.out.println("hi from init method");
	}
 
	public void m1() {
		System.out.println("hi from m1");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("hi from destroy method");
	}
 
}
