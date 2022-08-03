package springex.SpringAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        
        Airtel a = ac.getBean(Airtel.class);
        
           a.dataStrength();
//        a.typeOfSim();
//        a.dataTypeOfSim();
        a.display(); 
    }
}
