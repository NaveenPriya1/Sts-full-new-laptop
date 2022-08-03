package springjdbctemp.springjdbctemp;

import java.util.List;

public interface StudentCrud {
	
	public int insert(StudentBean sb);
	
	public List<StudentBean> getallstudents();
	
	
	

}
