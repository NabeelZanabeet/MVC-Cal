import static org.junit.Assert.*;

import org.junit.Test;

public class ModelTest{

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		Model test = new Model();
		test.set_Fnum(6.5);
		assertTrue(test.Fnum==6.5);
		
		test.set_Snum(5.5);
		assertTrue(test.Snum==5.5);
		
		test.Add();
		assertTrue(test.Result==12);
		
		test.Sub();
		assertTrue(test.Result==1);
		
		test.Mul();
		assertTrue(test.Result==35.75);
		
		test.set_Fnum(6.5);
		test.set_Snum(0);
		test.Div();
		assertTrue(test.Result==35.75);
		
		
		
	}

}
