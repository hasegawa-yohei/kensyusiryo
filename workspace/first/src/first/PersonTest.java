package first;

public class PersonTest {
		 public static void main(String[] args) {
		    //tryで、例外が発生するかもしれない処理を囲む
			 try {
		    	 Person1 p=new Person1();
		    	 p.setAge(-10);
			//例外を受け取ったときの処理
			 } catch (Exception e) {
				System.out.println("例外が発生しました");
				e.printStackTrace();
			//必ず実行される処理
			 }finally {
				System.out.println("実行終了");
			}
		 }
		}

