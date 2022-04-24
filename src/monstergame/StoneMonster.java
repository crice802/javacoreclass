/**
 * 
 */
package monstergame;

/**
 * @author crice
 *
 */
public class StoneMonster extends Monster {

	public StoneMonster(String string) {
		super(string);
	}

	public String attack() {
		String attack = "Attack with stones!";
		return attack;
	}
}