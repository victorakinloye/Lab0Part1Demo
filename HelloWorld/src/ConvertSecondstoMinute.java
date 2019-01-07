import java.util.Scanner;

public class ConvertSecondstoMinute {
	
		public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			System.out.println("What is your name");
			String name = input.nextLine();
			input.nextLine();
		System.out.println("Enter an integer for seconds:");
		int s = input.nextInt();
		
		int minutes = s / 60 ;
		int seconds = s % 60 ;
		
		System.out.println(name + " your input has " + s + " seconds and can be divided into "+ minutes +" minutes and "+ seconds +" seconds");
			input.close();

		}


	}



