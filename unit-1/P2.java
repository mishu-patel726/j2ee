import java.sql.*;
class P2{
	public static void main(String[] args){
		String dburl="jdbc:mysql://localhost:3306/j2ee";
		String dbuser="root";
	    String dbpassw="";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(dburl,dbuser,dbpassw);
			System.out.println("db connected");
			Statement st=con.createStatement();
			String sql="select*from student";
			ResultSet rs=st.executeQuery(sql);
			
			System.out.println("id\t\tname\t\tcource\t\tdivision");
			while(rs.next()){
				int id=rs.getInt(1);
				String name=rs.getString("name");
				String cource=rs.getString("cource");
				String division=rs.getString("division");
				System.out.println(id+"\t\t"+name+"\t\t"+cource+"\t\t"+division);
			}
		}
		catch(Exception e){
		e.printStackTrace();
		}
	}
}