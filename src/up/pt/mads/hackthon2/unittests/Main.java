package up.pt.mads.hackthon2.unittests;

import static org.junit.Assert.*;

import org.junit.Test;

public class Main {

	@Test
	public void test2() {
		assertTrue(true);
	}
	
	@Test
	public void test1(){
		assertEquals(2.2, 2.2, 0);
	
	}
	
	@Test
	public void test3(){
		fail("fail");
	}

}
