/**
 * 
 */
package salarycalculator;

/**
 * @author crice
 *
 */
public class Employee {

	static long employeeId;
	static String employeeName;
	static String employeeAddress;
	static long employeePhone;
	static double basicSalary;
	static double specialAllowance = 250.80;
	static double hra = 1000.50;

	protected static long getEmployeeId() {
		return employeeId;
	}

	protected static void setEmployeeId(long Id) {
		Employee.employeeId = Id;
	}

	protected static String getEmployeeName() {
		return employeeName;
	}

	protected static void setEmployeeName(String Name) {
		Employee.employeeName = Name;
	}

	protected static String getEmployeeAddress() {
		return employeeAddress;
	}

	protected static void setEmployeeAddress(String address) {
		Employee.employeeAddress = address;
	}

	protected static long getEmployeePhone() {
		return employeePhone;
	}

	protected static void setEmployeePhone(long phone) {
		Employee.employeePhone = phone;
	}

	public static void calculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + basicSalary * hra / 100;
		System.out.println(salary);
	}

	public double calculateTransportAllowance() {
		double transportAllowance = 10 / 100 * basicSalary;
		return transportAllowance;
	}
}
