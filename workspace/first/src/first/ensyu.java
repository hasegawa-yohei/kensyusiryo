package first;

public class ensyu {

	public static void main(String[] args) {
		String[] name= {"A.Jolie","B.Pitt","C.Diaz","D.Washington","E.Murphy"};
		for(int i= 0;i<=4;i++) {
			System.out.println(name[i]);
		}

	    int X=102;

	    if(X>100||X<0) {
		    System.out.println("不正な数字です");
	    }else if(X>=80) {
	    	System.out.println("Aクラス");
	    }else if(X>=70) {
	    	System.out.println("Bクラス");
	    }else if(X>=60) {
	    	System.out.println("Cクラス");
	    }else if(X<60) {
	    	System.out.println("Dクラス");
	    }

	}
}
