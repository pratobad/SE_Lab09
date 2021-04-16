package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToAddString {

	@Test
	public void test() {
		Junitfunction jstr= new Junitfunction();
        String result= jstr.addstring("abc", "cda");
        assertEquals("abccda", result);
	}

}
