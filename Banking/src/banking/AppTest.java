package banking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	
	
	@Test 
	void SSNhyphenTest() {
		SSN ssn = new SSN();
		System.out.println(ssn + " = " + "000-000-0000");
		assertTrue(ssn.toString().equals("000-000-0000"));
		
		SSN two = new SSN(1234567890);
		assertTrue(two.toString().equals("123-456-7890"));
	}

}
