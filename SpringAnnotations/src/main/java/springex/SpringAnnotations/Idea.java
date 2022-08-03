package springex.SpringAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Idea implements Sim{
	
	private String dataStrength;
	
	

	

	public void typeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("Idea");
	}

	public void dataTypeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("4g network");
	}
	
	public void dataStrength() {
		System.out.println(dataStrength);
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("From idea display");
	}

}
