package scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("s")
@Scope("prototype")
public class student {

public void m3() {
	System.out.println("hi after init method");
}

@PostConstruct
public void m1() {
	System.out.println("init method");
}
@PreDestroy
public void m2() {
	System.out.println("destroy method");
}
}
