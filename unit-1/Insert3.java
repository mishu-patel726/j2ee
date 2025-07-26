import java.sql.*;
class Insert3{
	public static void main(String[] args){
		String dburl="jdbc:mysql://localhost:3306/j2ee";
		String dbuser="root";
	    String dbpassw="";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(dburl,dbuser,dbpassw);
			System.out.println("db connected");
			String sql="insert into student(name,cource,division)values(?,?,?)";
			PreparedStatement st=con.PreparedStatement(sql);
		  String st= st.setString(1,"hgj","bcom","B");
			int rs=st.executeUpdate();
			System.out.println(rs);
			
				
			
		}
		catch(Exception e){
		e.printStackTrace();
		}
	}
}