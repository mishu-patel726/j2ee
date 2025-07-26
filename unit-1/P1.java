import java.sql.*;
class P1{
	public static void main(String[] args){
		String dburl="jdbc:mysql://localhost:3306/j2ee";
		String dbuser="root";
	    String dbpassw="";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(dburl,dbuser,dbpassw);
			System.out.println("db connected");
		}
		catch(Exception e){
		e.printStackTrace();
		}
	}
}