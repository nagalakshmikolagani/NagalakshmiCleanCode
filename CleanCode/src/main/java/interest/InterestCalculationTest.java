package interest;
import static org.junit.Assert.*;
import org.junit.*;
public class InterestCalculationTest {

	InterestCalculation interestCalculation;
	@Before
	public void objectCreation()
	{
		interestCalculation=new InterestCalculation();
	}
	@Test
	public void test(){
		assertEquals("80.0Rs/-",interestCalculation.getSimpleInterest(1000.00,4.0,2.0));
	}
	@Test
	public void test1(){
		assertEquals("81.60000000000014Rs/-",interestCalculation.getCompoundInterest(1000.00,4.0,2.0));
	}

}
