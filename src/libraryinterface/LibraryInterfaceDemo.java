/**
 * 
 */
package libraryinterface;

/**
 * @author crice
 *
 */
public class LibraryInterfaceDemo {

	static KidUsers kidUsers = new KidUsers();
	static AdultUsers adultUsers = new AdultUsers();

	public static void main(String[] args) {

		testCase1();
		testCase2();
	}

	public static void testCase1() {

		kidUsers.setAge(10);
		kidUsers.registerAccount();
		kidUsers.setAge(18);
		kidUsers.registerAccount();
		kidUsers.setBookType("kids");
		kidUsers.requestBook();
		kidUsers.setBookType("fiction");
		kidUsers.requestBook();

	}

	public static void testCase2() {

		adultUsers.setAge(5);
		adultUsers.registerAccount();
		adultUsers.setAge(23);
		adultUsers.setBookType("kids");
		adultUsers.requestBook();
		adultUsers.setBookType("fiction");
		adultUsers.requestBook();

	}

}
