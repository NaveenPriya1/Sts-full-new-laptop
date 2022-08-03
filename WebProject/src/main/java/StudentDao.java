import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao {
	
	public int insert(Student s) throws ClassNotFoundException, SQLException {
		Connection con = Dbcon.dbCon();
		String str= "insert into student values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(str);
		ps.setInt(1, s.getSid());
		ps.setString(2, s.getSname());
		ps.setString(3, s.getSemail());
		int row = ps.executeUpdate();
		return row;
		
	}
	
	public ResultSet retrieve() throws ClassNotFoundException, SQLException {
		Connection con = Dbcon.dbCon();
		String str="select * from student";
		PreparedStatement ps = con.prepareStatement(str);
		ResultSet rs=ps.executeQuery();
		return rs;
		
	}

}
