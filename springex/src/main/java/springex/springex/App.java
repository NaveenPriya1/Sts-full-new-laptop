package springex.springex;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//bean factory
//       Resource rs = new ClassPathResource("spring.xml");
//       BeanFactory bf = new XmlBeanFactory(rs);
       // Application context
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
       
//    	Sim sim= ac.getBean(Idea.class);
//      Sim sim1= ac.getBean(Airtel.class);
       
    	Idea sim= ac.getBean(Idea.class);
        Airtel sim1= ac.getBean(Airtel.class);
       sim.typeOfSim();
       sim.dataTypeOfSim();
       sim.dataStrength();
       
       sim1.dataTypeOfSim();
       sim1.typeOfSim();
       sim1.dataStrength();
    }
}
