package pj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dao {
   public boolean login(String id, String pw) {
   // db���� ������ ��
   //public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        int control=0;
        try {
         Class.forName("com.mysql.jdbc.Driver");
         String url = "jdbc:mysql://localhost:3306/login_db";
         conn = DriverManager.getConnection(url, "root", "1015");
         stmt = conn.createStatement();
 
            String sql;
            sql = "select * FROM login_db;";
 
            ResultSet rs = stmt.executeQuery(sql);
 
            while (rs.next()) {
                if(id.equals(rs.getString("dbId"))) {// && pw.equals(rs.getString("dbPw"))){
                	//id&pw�� ��ġ�� ��� ���� �����
                	control=1;
                	}//��ġ���� �ʴ� ��� ������ �ʴ´�
                else
                	control=0;
              // String dbId = rs.getString("dbId");
               //String dbPw = rs.getString("dbPw");
            }

            rs.close();
            stmt.close();
            conn.close();
        
       
        } catch (Exception e) {
         System.out.println("DB ���� �����Դϴ�. : " + e.getMessage());
         //return false;
        }
		//return false;//����
        if(control==1)
        	return true;
        else
        	return false;
} 
}
 