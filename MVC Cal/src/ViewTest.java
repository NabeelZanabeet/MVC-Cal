import static org.junit.Assert.*;

import org.junit.Test;

public class ViewTest {

	@Test
	public void test() {
		View test= new View();
		test.jTextField1.setText(Double.toString(5.5));
		assertTrue(Double.parseDouble(test.jTextField1.getText())==5.5);
	}

}
