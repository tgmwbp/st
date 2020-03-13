package st_lab1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Lab1Test {
	private int input;
	private boolean expected;
	private Lab1 lab1=null;
	
	public Lab1Test(int input,boolean expected) {
		this.input=input;
		this.expected=expected;
	}
	
	@Before
	public void setUp() {
		lab1=new Lab1();
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
			{0,false},
			{1,true},
			{2,true},
			{4,false},
			{93,true},
			{94,false}
		});
	}
	 
	@Test
	public void testLab1() {
		assertEquals(this.expected,lab1.check(input));
		//assertEquals(true,Lab1.check(3));

	}
}
