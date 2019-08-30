package first;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Dentaku {
	  static boolean flg;
	  static double sum;
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("パスワードを入力してください");
	  while(true) {
		String word =br.readLine();
		String pw ="pass";
		if(word.equals(pw)) {
			System.out.println("パスワードを認証しました");
			break;
		}
		else {
			System.out.println("パスワードが違います");
		}
	  }

	  System.out.println("数値,演算子,数値の順で入力してください");
	  while(flg==false) {
	     String str =br.readLine();
		  double num1=Double.parseDouble(str);
		 String e =br.readLine();
		 String str2 =br.readLine();
		 double  num2=Double.parseDouble(str2);

		switch(e) {
		 case "+":
			sum=num1+num2;
			System.out.println(num1+"+"+num2+"="+sum);
			flg=true;
			break;
		 case"-":
			 sum=num1-num2;
			 System.out.println(num1+"-"+num2+"="+sum);
			 flg=true;
			 break;
		 case"*":
			 sum=num1*num2;
			 System.out.println(num1+"*"+num2+"="+sum);
			 flg=true;
			 break;
		 case"/":
			 sum=num1/num2;
			 System.out.println(num1+"/"+num2+"="+sum);
			 flg=true;
			 break;
		 case"%":
			 sum=num1%num2;
			 System.out.println(num1+"%"+num2+"="+sum);
			 flg=true;
			 break;
		 default:
			 System.out.println("演算子は + - * / % で入力してください");
		}
	  }


	}

}
