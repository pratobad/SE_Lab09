package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToAddNumbers {

	@Test
	public void test() {
		Junitfunction junit= new Junitfunction();
        int result= junit.addnumbers(100, 200);
        assertEquals (300,result);
	}

}
