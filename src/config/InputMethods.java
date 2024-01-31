package config;

import model.Department;
import model.Employee;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class InputMethods {
	
	private static final String ERROR_ALERT = "===>> Định dạng không hợp lệ, hoặc ngoài phạm vi! Vui lòng thử lại....";
	private static final String EMPTY_ALERT = "===>> Trường nhập vào không thể để trống! Vui lòng thử lại....";
	/*========================================Input Method Start========================================*/
	
	/**
	 * getString()  Return a String value from the user.
	 */
	public static String getString() {
		while (true) {
			String result = getInput();
			if (result.trim().equals("")) {
				System.err.println(EMPTY_ALERT);
				continue;
			}
			return result;
		}
	}
	
	/**
	 * getChar()  Return a Character value from the user.
	 */
	public static char getChar() {
		return getString().charAt(0);
	}
	
	/**
	 * getBoolean()  Return a Boolean value from the user.
	 */
	public static boolean getBoolean() {
		String result = getString();
		return result.equalsIgnoreCase("true");
	}
	
	/**
	 * getByte()  Return a Byte value from the user.
	 */
	public static byte getByte() {
		while (true) {
			try {
				return Byte.parseByte(getString());
			} catch (NumberFormatException errException) {
				System.err.println(ERROR_ALERT);
			}
		}
	}
	
	/**
	 * getShort()  Return a Short value from the user.
	 */
	public static short getShort() {
		while (true) {
			try {
				return Short.parseShort(getString());
			} catch (NumberFormatException errException) {
				System.err.println(ERROR_ALERT);
			}
		}
	}
	
	/**
	 * getInteger()  Return a Integer value from the user.
	 */
	public static int getInteger() {
		while (true) {
			try {
				return Integer.parseInt(getString());
			} catch (NumberFormatException errException) {
				System.err.println(ERROR_ALERT);
			}
		}
	}
	
	/**
	 * getLong()  Return a Long value from the user.
	 */
	public static long getLong() {
		while (true) {
			try {
				return Long.parseLong(getString());
			} catch (NumberFormatException errException) {
				System.err.println(ERROR_ALERT);
			}
		}
	}
	
	/**
	 * getFloat()  Return a Float value from the user.
	 */
	public static float getFloat() {
		while (true) {
			try {
				return Float.parseFloat(getString());
			} catch (NumberFormatException errException) {
				System.err.println(ERROR_ALERT);
			}
		}
	}
	
	/**
	 * getDouble()  Return a Double value from the user.
	 */
	public static double getDouble() {
		while (true) {
			try {
				return Double.parseDouble(getString());
			} catch (NumberFormatException errException) {
				System.err.println(ERROR_ALERT);
			}
		}
	}
	/*========================================Input Method End========================================*/
	
	/**
	 * getInput()  Return any String value from the user.
	 */
	private static String getInput() {
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
	
	/**
	 * pressAnyKey()  Press any key to continue....
	 */
	public static void pressAnyKey() {
		getInput();
	}
	
	/*======================================== Other Methods ========================================*/
	
	public static LocalDate getLocalDate() {
		while (true) {
			try {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate localDate = LocalDate.parse(getString(), formatter);
				return localDate;
			} catch (Exception errException) {
				System.err.println(ERROR_ALERT);
			}
		}
	}
	
	public static Employee getManager(List<Employee> employees) {
		for (Employee e : employees) {
			e.displayData();
		}
		System.out.print("Nhập vào id của manager: ");
		String employeeId = getString();
		for (Employee e : employees) {
			if (e.getEmployeeId().equals(employeeId)) {
				return e;
			}
		}
		return null;
	}
	
	public static Department getDepartment(List<Department> departments) {
		for (Department e : departments) {
			e.displayData();
		}
		while (true) {
			System.out.print("Nhập vào id của department: ");
			String departmentId = getString();
			for (Department e : departments) {
				if (e.getDepartmentId().equals(departmentId)) {
					return e;
				}
			}
			System.err.println("ID Không tồn tại");
		}
		
	}
	
}
