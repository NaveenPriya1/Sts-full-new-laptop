package junittest.junittest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrimevalidTest {

	PrimeCheck pc;
	
	@Before
	public void objcreation() {
		pc = new PrimeCheck();
	}
	
	@Test
	public void test() {
		assertTrue(pc.isPrime(7));
	}
	
	
	@Test
	public void test1() {
		assertFalse(pc.isPrime(9));
	}
	
	@Test
	public void test2() {
		assertFalse(pc.isPrime(1));
	}

}
