
package testhomework;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestHomeWorkTest {
	private TestHomeWork underTest;
	
	@Before
	public void setUp(){
		underTest= new TestHomeWork();		
	}
	@Test
	public void testUltimateAnswerShouldReturnUltimateAnswer(){
		
		// WHEN
		Integer result=underTest.ultimateAnswer();
		// THEN
		Assert.assertEquals(Integer.valueOf(42), result);
	}
	
	@Test
	public void testIsMoreShouldReturnTrue(){
			
		boolean result=underTest.isMore(42);		
		Assert.assertTrue(result);
	}
	@Test(expected = IllegalStateException.class)
	public void testIsMoreShouldReturnFalse(){
				
		boolean result=underTest.isMore(43);		
				
	}
	
	@Test
	public void testIsTheUltimateAnswer(){
		
		boolean result=underTest.isTheUltimateAnswer(42);
		Assert.assertTrue(result);
		
	}
	@Test
	public void testNotTheUltimateAnswer(){
		
		boolean result=underTest.isTheUltimateAnswer(43);
		Assert.assertFalse(result);
		
	}
}
