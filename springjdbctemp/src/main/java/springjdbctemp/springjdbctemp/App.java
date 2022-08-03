package springjdbctemp.springjdbctemp;

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
       
       StudentBean sb = ac.getBean(StudentBean.class);
       StudentDao sdao = ac.getBean(StudentDao.class);
     
       int row= sdao.insert(sb);
       if(row>0)
    	   System.out.println(row+ " row inserted succesfully");
       else
    	   System.out.println("row not inserted");
       
   /*    List<StudentBean> ls =sdao.getallstudents();
       for(StudentBean sbean:ls) {
    	   System.out.println(sbean.getSid()+"  "+sbean.getSname());
       }*/
       
       
//       int row=sdao.update(sb);
//       if(row>0)
//    	   System.out.println(row+" row updated succesfully");
//       else 
//    	   System.out.println(" not updated");
       
    /*   sdao.delete(sb);
       System.out.println(sb.getSid()+" data deleted succesfully");    */
    }
}
