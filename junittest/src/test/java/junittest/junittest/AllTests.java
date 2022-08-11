package junittest.junittest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AgevalidTest.class, PrimeStringTest.class, PrimevalidTest.class })
public class AllTests {

}
