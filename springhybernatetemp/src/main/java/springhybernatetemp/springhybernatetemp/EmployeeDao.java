package springhybernatetemp.springhybernatetemp;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDao implements EmployeeCurd{
	
	HibernateTemplate temp;
	
	

	public void setTemp(HibernateTemplate temp) {
		this.temp = temp;
	}

	//insert method
	public int insert(Employee e) {
		// TODO Auto-generated method stub
		return (Integer) temp.save(e);
	}
	
	public int update(Employee e) {
		
		String sql="update Employee e set e.empname='"+e.getEmpname()+"' where e.empname='Sridhar'";
	return (Integer) temp.save(sql);
		
	}
	
	public void delete(Employee e) {
		
		String sql="delete from Employee e where e.empname='"+e.getEmpname()+"'";
	 temp.delete(sql);
		
	}

	public List<Employee> getAllEmployess() {
		// TODO Auto-generated method stub
		String sql="from Employee";
		return (List<Employee>) temp.find(sql);
	}

}
