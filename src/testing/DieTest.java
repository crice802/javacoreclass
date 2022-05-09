package testing;

import static org.junit.Assert.assertNotEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DieTest {
	@Test
	public void testConstructor() {
		// given
		Integer expectedFaceValue = null;
		Integer exceptedNumberOfFaces = null;

		// when
		Die die = new Die(exceptedNumberOfFaces);
		Integer actualFaceValue = die.getCurrentFaceValue();
		Integer actualNumberOfFaces = die.getNumberOfFaces();

		// then
		Assert.assertEquals(expectedFaceValue, actualFaceValue);
		Assert.assertEquals(exceptedNumberOfFaces, actualNumberOfFaces);
	}

	@Test
	public void testRoll() {
		// given
		Integer numberOfFaces = 2;
		Integer unexpected = null;
		Die die = new Die(numberOfFaces);

		// when
		die.roll();
		Integer actual = die.getCurrentFaceValue();

		// then
		assertNotEquals(unexpected, actual);
	}
}
