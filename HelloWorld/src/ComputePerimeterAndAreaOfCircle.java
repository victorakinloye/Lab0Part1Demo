import java.util.Scanner;

public class ComputePerimeterAndAreaOfCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter an Integer for Radius:");
		double r = input.nextDouble();
		input.nextLine();
				

	System.out.println("what is your name");
	String name = input.nextLine();
	
	double perimeter = 2 * r * 3.14;
	double area = r * r * 3.14;
		
	System.out.println(name + ", your input circle has a radius " + r + " has a perimeter "+ perimeter +" and area of "+ area +"");
		input.close();

	}


}
