package TestNgAllMethods;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutoMobile {
@Parameters("Autoname")
	@Test
	
	public void Test1(String name){
		System.out.println(name);
	}
	
}
