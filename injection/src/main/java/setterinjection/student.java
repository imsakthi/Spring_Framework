package setterinjection;

public class student {
  int id;
  String name;
  public student() {
	// TODO Auto-generated constructor stub
}
public student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "student [id=" + id + ", name=" + name + "]";
}


}
