package springjdbctemp.springjdbctemp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentDao implements StudentCrud{
	
	JdbcTemplate temp;

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}

	public int insert(StudentBean s) {
		// TODO Auto-generated method stub
		String sql = "insert into student values("+s.getSid()+",'"+s.getSname()+"')";
		return temp.update(sql);
	}
	
	public int update(StudentBean sb) {
		String sql= "update student set sname='"+sb.getSname()+"'where sid="+sb.getSid();
		return temp.update(sql);
	}
	
	public void delete(StudentBean sb) {
		String sql="delete from student where sid="+sb.getSid();
		temp.update(sql);
	}


	public List<StudentBean> getallstudents() {
		// TODO Auto-generated method stub
		String sql= "select * from student";
		
		return temp.query(sql, new ResultSetExtractor<List<StudentBean>>() {

			public List<StudentBean> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<StudentBean> list = new ArrayList<StudentBean>();
				while(rs.next()) {
					StudentBean sb = new  StudentBean();
					sb.setSid(rs.getInt(1));
					sb.setSname(rs.getString(2));
					list.add(sb);
					
				}
				return list;
			}
			
		});
	}

}
