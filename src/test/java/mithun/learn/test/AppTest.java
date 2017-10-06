package mithun.learn.test;

//import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

import mithun.learn.samples.App;

public class AppTest {

	@Test
	public void testPrintMessage() {
		String messageToTest = "HelloWorld";
		assertSame(messageToTest, new App().printMessage(messageToTest));
		//assertThat(new App().printMessage(messageToTest), contains(messageToTest));
		//fail("Not yet implemented");
	}

}
