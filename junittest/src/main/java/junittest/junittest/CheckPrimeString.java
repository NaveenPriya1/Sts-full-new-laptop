package junittest.junittest;

public class CheckPrimeString {

			public String isPrime(int n) {
				int c=0;
				for(int i=1;i<=n;i++) {
					if(n%i==0) {
						c++;
					}
					
				}
				
				if(c==2) {
					return "Yes prime";
				}else {
					return "not prime";
				}
			}

		}


