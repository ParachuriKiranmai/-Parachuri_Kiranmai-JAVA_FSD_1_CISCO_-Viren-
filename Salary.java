package program.java.exceptions;

public class Salary {

	static void validate(double salary) throws InvalidSalaryException {
		if (salary < 2000)
			throw new InvalidSalaryException("you need to work hard");
		else if (salary > 2100 && salary < 5000)
			throw new InvalidSalaryException("you salary is somehow good");
		else if (salary > 5100 && salary < 9000)
			System.out.println("salary is very good");
		else
			System.out.println("Great effort");
	}

	public static void main(String[] args) {
		try {
			validate(10000);
		} catch (Exception e) {
			System.out.println("Exception occured:" + e.getMessage());
		}
		System.out.println("rest of the code");
	}

}

class InvalidSalaryException extends Exception {
	InvalidSalaryException(String s) {
		super(s);
	}
}
