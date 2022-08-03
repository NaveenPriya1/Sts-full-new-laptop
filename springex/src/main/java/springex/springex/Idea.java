package springex.springex;

public class Idea implements Sim{
	
	private String dataStrength;
	
	

	public Idea(String dataStrength) {
		super();
		this.dataStrength = dataStrength;
	}

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

}
