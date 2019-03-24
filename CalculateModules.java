import java.util.Scanner;
public class CalculateModules {
	 public static void main(String[] args) {
		 
        Scanner in = new Scanner(System.in); // we're inputting from the keyboard
        System.out.println("This progam calculates the modules of two numbers without using any inbuilt modulus operator.");
        System.out.print("Input the first number : ");
        int a = in.nextInt(); // a takes value from the keyboard
		System.out.print("Input the second number: ");
		int b = in.nextInt(); // b takes value from the keyboard
		
		int DividedNum = a / b; 
		int result = a - (DividedNum * b);
		System.out.println(result); 
		in.close();
	}
 }
 