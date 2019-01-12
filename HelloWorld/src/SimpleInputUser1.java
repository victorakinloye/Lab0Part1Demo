
public class SimpleInputUser1 {
import java.util.*;

public class SimpleUserInput2 {



	public static void main(String[] args) {

		

		Scanner input = new Scanner(System.in);

		

		System.out.println("Enter the 1st number (which can contain a decimal)");

		double n1 = input.nextDouble();

		input.nextLine();

		

		System.out.println("Enter the 2nd number (which can contain a decimal)");

		double n2 = input.nextDouble();

		input.nextLine();		

		

		System.out.println(" whats your name: ");

		String name = input.nextLine();

		

		double average = (n1+n2)/2;

		

		System.out.println(name + " , ");

		System.out.println("the number you entered were " + n1+ " and "+ n2 +" and " );

		System.out.println("the Average is :" + average);
}
