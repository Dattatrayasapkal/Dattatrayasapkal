package TestNgAllMethods;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestClass {

//	
//	
//	//@Test(description = "Oepn the url")
////	@Test(priority = 2)
//	@Test(dependsOnMethods = {"TestClass1"})
//	public void UrlOpen() {
//		
//	}
//	//@Test(description="This is Testcases1")
////	@Test(priority = 1)
//	@Test
//	public void TestClass1() {
//		
//		System.out.println("Starting TestNg ");
//		
//	}
//	
//	
//	@Test(dependsOnMethods = "testcase2")
//	public void testcase1() {
//		System.out.println("Mobile Testing ");
//	}
//	@Test(enabled = true)
//	public void testcase2() {
//		System.out.println("Automation Testing");
//		Assert.assertTrue(true);
//	}
//	//@Test(dependsOnMethods = "testcase2")
//	@Test(enabled = false)
//	public void testcase3() {
//		System.out.println("Api Testing");
//	}
//	
	
//	@Test(groups = "Software Company")
//	public void Infosys() {
//		System.out.println("Infosys");
//	}
//	@Test(groups = "Software Company")
//
//	public void Wipro() {
//		System.out.println("Wipro");
//	}
//	@Test(groups = "Automible Company")
//
//	public void Maruti() {
//		System.out.println("Maruti");
//	}
//	@Test(groups = "Automobile Company")
//	public void Tata() {
//		System.out.println("Tata");
//	}
//	
//	@Test
//	@Parameters({"i","j"})
//	public void Add (int a,int b) {
//		System.out.println( a+b);
//		
//	}
	@Test
	@Parameters({"I","j"})
	public void M1(int a,int b) {
		System.out.println( a+b);
	}
	
}
