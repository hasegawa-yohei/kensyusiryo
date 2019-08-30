package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEnsyu {
	public static void main(String []args) {
	    //JDBCの接続で使う「url,id,pw」を定義
		String url ="jdbc:mysql://localhost/companydb";
		String id ="root";                    //↑①データベース名
		String pw = "password";

		//各オブジェクト「Connection,Statement,ResultSet」を変数定義しておく
		Connection cnct = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//JDBCドライバの登録
			Class.forName("com.mysql.jdbc.Driver");
			//MySQLへ接続(データベースまで)
			cnct =DriverManager.getConnection(url,id,pw);
			st = cnct.createStatement();
			//SQL文の発行
			rs = st.executeQuery("SELECT * from addrbk where id =1");
			                            //↑②SQL文

			//while文でitemテーブルのレコードをnextメソッドがtrueを返す限りループ
			//rs.next()は後ろにレコードが無ければfalseを返す
			while(rs.next()) {
				//getterメソッドでitemテーブルのnameとpriceを持ってくる

				                           //↓③カラム名
				String column = rs.getString(5);
				String name = rs.getString("NAME");
				String age = rs.getString("AGE");

				System.out.println("問1:"+column);
				System.out.println("問2:"+name+age);
			}
		} catch(ClassNotFoundException ex){
			ex.printStackTrace();//どこで例外が起きているか分かる
			} catch(SQLException ex) {
			ex.printStackTrace();
			}finally {
				try {
					//JDBC接続の解除
					if (rs!=null) rs.close();
					if (st!=null) st.close();
					if (cnct!=null) cnct.close();
					} catch(Exception ex) { }
			}
		}
}
