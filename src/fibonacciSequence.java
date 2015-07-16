import javax.swing.JOptionPane;

public class fibonacciSequence {

	public static void main(String[] args) {

		String maximum = JOptionPane.showInputDialog("What max value would you like for the sequence?");

		int maxValue = Integer.parseInt(maximum);
		
		int init = 0;

		System.out.println("0");

		int current = init;

		int next = init + 1;
		
		System.out.println(next);

		for (int i = 0; next < maxValue; i++) {

			int previous = current;

			current = next;

			next = previous + current;

			System.out.println(next);
			
			previous = current;

			current = next;

			next = previous + current;

			System.out.println(next);

		}

	}

}
