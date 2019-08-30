package first;

public class RobotImpl implements Robot{

	String name = "Mike";
	public void sayHello() {
		System.out.println("Hello! My Name is "+name);
	}
	public void walk() {
		System.out.println("I can walk very well,");
	}
}
