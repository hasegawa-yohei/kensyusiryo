package first;

public class IfForEnsyuu {



	public static void main(String[] args) {

	//問1
		 int X=10;
		 int Y=20;

		 X=Y;
		 Y-=10;

		 System.out.println(X);
		 System.out.println(Y);

	//問2
		 for(int i=1;i<=9;i++) {
			 System.out.println("▼"+i+"の段▼");
			 for(int j =1;j<=9;j++) {
				 System.out.print(i+"×"+j+"="+i*j+",");
			 }
			 System.out.println(" ");
		 }
	//問3
		 for(int a=1;a<=100;a++) {

			 if(a%3==0&&a%5==0) {
				 System.out.println(a+"  FizzBuzz");
		     } else if(a%3==0) {
				 System.out.println(a+"  Fizz");
			 }else if(a%5==0) {
			 System.out.println(a+"  Buzz");
			 }else {
				 System.out.println(a);
			 }
		 }
	}


}
