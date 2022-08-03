package springex.SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Airtel implements Sim{
	
	private String dataStrength;
	
	@Autowired
	Idea idea;

	public String getDataStrength() {
		return dataStrength;
	}
	@Required
    @Value("Airtel has good data strength")
	public void setDataStrength(String dataStrength) {
		this.dataStrength = dataStrength;
	}

	public void typeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("Airtel");
		
	}

	public void dataTypeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("4g network");
	}
	
	public void dataStrength() {
		System.out.println(dataStrength);
	}
	
	public void display() {
		idea.display();
	}

}
