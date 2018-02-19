package Test.PracticeOne.Maven_Practice1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java {
	static Java calc = new Java();

	public static void main(String[] args) {

		calc.calculator();

	}

	public void calculator() {
		try {
			int a, b, c;

			Scanner input = new Scanner(System.in);
			System.out.println();
			System.out.println("Enter First Number =" + " ");
			a = input.nextInt();
			System.out.println("Enter Second Number =" + " ");
			b = input.nextInt();

			c = a + b;
			System.out.println("Addition of Two Numbers is = " + " " + c);
			c = a - b;
			System.out.println("Substraction of Two Numbers is =" + " " + c);
			c = a * b;
			System.out.println("Multiplication of Two Numbers is =" + " " + c);
			c = a / b;
			System.out.println("Division of Two Numbers is =" + " " + c);

			// System.out.println("You have entered ="+" "+a);

		} catch (Exception e) {

			System.out.println("Warning : Please Give Number Only");
			System.out.println();
			throw new InputMismatchException("Invalid Input");

		}

		finally {
			calc.calculator();
		}

	}

}