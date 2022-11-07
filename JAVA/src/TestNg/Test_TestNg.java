package TestNg;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_TestNg {
	
		@BeforeClass
		
		public void beclass() {
			System.out.println("Before class running successfully");	
		}
		
		@BeforeMethod
		
		public void bemethod() {
			System.out.println("Before Method running successfully");	
		}
		
		@Test
		
	    public void test() {
			System.out.println("Test is running successfully");	
		}
}


