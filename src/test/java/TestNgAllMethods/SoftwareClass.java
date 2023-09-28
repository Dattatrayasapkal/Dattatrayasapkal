package TestNgAllMethods;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SoftwareClass {
	
	@Parameters("Softname")
	@Test
public void SoftareComapny(String name) {
System.out.println(name);
}
}
