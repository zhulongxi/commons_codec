package apache_commons_codec;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({ commons_codecTest.class })
public class AllTests {
	public static Test suite() {
		TestSuite suite = new TestSuite("All Junit Test");
		suite.addTest(new JUnit4TestAdapter(commons_codec.class));
		return suite;
	}
}
