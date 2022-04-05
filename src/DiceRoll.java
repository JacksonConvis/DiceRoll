import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// This Project is used to simulate the results of rolling two X-sided dice and displaying their result.
		String choice = "y";
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter sides for a pair of dice");
			int sides = scan.nextInt();

			int die1 = (int) (sides * Math.random());
			int die2 = (int) (sides * Math.random());
			System.out.println("Roll Result:" + "\n" + die1 + "\n" + die2);
			System.out.println("Do you wish to continue? (y/n)");
			choice = scan.next();
		} while (choice.equalsIgnoreCase("y"));
		System.out.println("Have a great day :)");

	}

}
