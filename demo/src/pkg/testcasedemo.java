package pkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcasedemo {

	@Test
	public void test() {
		addition obj=new addition();
		int result=obj.add(10,10);
		assertEquals(20, 20);
	}

}
