package springhybernatetemp.springhybernatetemp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
       
       Employee e = ac.getBean(Employee.class);
       EmployeeDao edao= ac.getBean(EmployeeDao.class);
       
//      if( edao.insert(e)>0)
//    	  System.out.println("Inserted successfully");
//      else
//    	  System.out.println("not Inserted");
      
      
//      List<Employee> elist=edao.getAllEmployess();
//      System.out.println(elist);
       
//       if( edao.update(e)>0)
//    	  System.out.println("updated successfully");
//         else
//    	  System.out.println("not not updated ");
//       
       
       edao.delete(e);
       System.out.println("deleted");
    }
}
