package junittest.junittest;

public class AgeValidator {
	
	public String ageValid(int age) {
		if(age>=18)
			return "welcome to vote";
		else
			return "u need to wait unitl 18";
	}

}
