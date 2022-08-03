package springex.springex;

public class Airtel implements Sim{
	
	private String dataStrength;
	
	

	public String getDataStrength() {
		return dataStrength;
	}

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

}
