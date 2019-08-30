package first;

public class Person1 {
 public int age;

 public Person1() {
	 age=0;
 }

 //例外が発生するかもしれないという宣言＝throws Exception
 public void setAge(int age)throws Exception {
	 if(age<0) {
		 //例外を投げる
		 Exception e= new Exception();
		 throw e;
		}
	 this.age= age;
 }

}

