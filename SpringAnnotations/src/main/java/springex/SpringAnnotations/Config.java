package springex.SpringAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"springex.SpringAnnotations"})
public class Config {

//	   @Bean
//	   public Airtel airtelobject() {
//		   return new Airtel();
//	   }
}
