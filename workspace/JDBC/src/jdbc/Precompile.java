package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Precompile {

 public static void main(String []args) throws SQLException {

	//配列の定義
	int newID[] = {14,8,7,15};
	String newName[] = {"佐々木","斎藤","山口","松本"};
	//MySQLに接続するために必要な情報を格納
	String url = "jdbc:mysql://localhost/companydb";
	String id = "root";
	String pw = "password";
	Connection cnct = null;
	PreparedStatement pst = null;
	ResultSet rs =null;
 try {
		//ドライバの登録
		Class.forName("com.mysql.jdbc.Driver");
		//MySQLへの接続
		cnct = DriverManager.getConnection(url,id,pw);
		//オートコミットをオフにする
		cnct.setAutoCommit(false);

		//EMPテーブルのID,NAMEに値を格納するSQL文の発行
		String query = "INSERT INTO EMP (ID,NAME) VALUES (?,?)";
		//String query = "delete from EMP where id between 6 to 10";
		pst = cnct.prepareStatement(query);
		//pst.executeUpdate();

		//for文にてnewIDを回す(最大まで)
	  for(int i=0;i<newID.length;i++){
		 //setメソッドを使い、ID,NAMEに取り出してきた値を格納
	   pst.setInt(1, newID[i]);
	   pst.setString(2, newName[i]);
	   //更新処理を行う
	   pst.executeUpdate();
	}
	   cnct.commit();
	   System.out.println("コミット");
	}catch(ClassNotFoundException ex) {
		ex.printStackTrace();
	}catch(SQLException ex) {
		cnct.rollback();
		 System.out.println("ロールバック");
	}finally {
		try {
			if (pst!=null) pst.close();
			if(cnct!=null) cnct.close();
		}catch(Exception ex) {}

	}

	}

}
