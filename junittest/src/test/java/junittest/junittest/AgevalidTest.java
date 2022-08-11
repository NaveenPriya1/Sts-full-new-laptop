package junittest.junittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AgevalidTest {

	

		AgeValidator valid;
		
		@Before
		public void objcreation() {
			 valid= new AgeValidator();
		}
		

		
		@Test
		public void test() {
			assertEquals("welcome to vote", valid.ageValid(89));
		}
		
		@Test
		public void test1() {
			assertEquals("welcome to vote", valid.ageValid(18));
		}
		
		@Test
		public void test2() {
			assertEquals("u need to wait unitl 18", valid.ageValid(10));
		}
		
		@After
		public void objdestroy() {
			valid=null;
		}
		

	}


