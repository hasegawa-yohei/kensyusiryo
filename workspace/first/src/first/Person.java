package first;

public class Person {

	private String name;
	private int age;

	public void setAge(int newAge) {
		if(newAge>=0) {
			age=newAge;
		}
	}

	public int getAge() {
		return age;
	}

	public void setName(String newName) {
		if((newName!=null)&&(!newName.contentEquals(""))){
		name=newName;
		}
	}
	public String getName() {
		return name;
	}
}
