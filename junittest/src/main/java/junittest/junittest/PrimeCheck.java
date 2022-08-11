package junittest.junittest;

public class PrimeCheck {
	
	public boolean isPrime(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
			
		}
		
		if(c==2) {
			return true;
		}else {
			return false;
		}
	}

}
