/**
 * 
 */
package testing;

/**
 * @author crice
 *
 */
public class TestCalcTest {

	CalculatorTest ct = new CalculatorTest();

	try
	{
		ct.setUp();
		ct.testAdd();
		ct.testSub();
		ct.testMult();
		ct.testDiv();
		ct.testForDivZero();
	}catch(
	Exception e)
	{
		e.printStackTrace();
	}

}
