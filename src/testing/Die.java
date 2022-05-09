/**
 * 
 */
package testing;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author crice
 *
 */
public class Die {

	private Integer numberOfFaces, currentFaceValue;

	public Die(Integer numberOfFaces) {
		this.numberOfFaces = numberOfFaces;
	}

	public void roll() {
		ThreadLocalRandom randomNumberGenerator = ThreadLocalRandom.current();
		Integer randomFaceValue = randomNumberGenerator.nextInt(1, numberOfFaces);
		this.currentFaceValue = randomFaceValue;

	}

	public Integer getCurrentFaceValue() {
		return currentFaceValue;
	}

	public Integer getNumberOfFaces() {
		return numberOfFaces;

	}

}
