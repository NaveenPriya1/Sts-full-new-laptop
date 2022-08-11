package junittest.junittest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrimeStringTest {

CheckPrimeString pca;
	
	@Before
	public void objcreation() {
		pca = new CheckPrimeString();
	}
	
	@Test
	public void test() {
		//assertTrue(pc.isPrime(7));
		assertEquals("Yes prime", pca.isPrime(7));
	}
	
	
	@Test
	public void test1() {
		assertEquals("not prime", pca.isPrime(9));
	}
	
	@Test
	public void test2() {
		assertEquals("not prime", pca.isPrime(1));
	}

}
