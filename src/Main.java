import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		char answer = 's';

		do {
			System.out.print("Type the temperature in Celsius: ");
			double c = input.nextDouble();
			double f = 9.0 * c / 5.0 + 32.0;
			System.out.printf("Equal to Fahrenheit: %.1f%n", f);
			System.out.print("Would like to repeat?(y/n): ");
			answer = input.next().charAt(0);
		} while (answer != 'n');

		input.close();
	}

}
