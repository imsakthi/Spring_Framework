package annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("s")
public class student {
@Value("1")	
int id;
@Value("sakthi")
String name;
@Override
public String toString() {
	return "student [id=" + id + ", name=" + name + "]";
}

}
