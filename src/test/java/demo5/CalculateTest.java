package demo5;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {

	@Test
	public void testCalculateIntrest() {
		Calculate obj = new Calculate();
		float expected = obj.calculateIntrest(1000,5,6);
		float actual = 300;
		assertEquals(expected,actual,0.0);
	}
}
