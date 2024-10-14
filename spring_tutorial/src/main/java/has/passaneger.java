package has;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("p")
public class passaneger {
  @Value("1")
  int id;
  @Value("Priya")
  String name;
  @Value("Female")
  String gender;
}
