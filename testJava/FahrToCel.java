package testJava;
import java.util.Scanner;

public class FahrToCel {

	public static void main(String[] args) {
		Double fahr;
		Double cel;
		Scanner in;
		
		in = new Scanner(System.in);
		System.out.println("Enter F: ");
		fahr = in.nextDouble();
		cel = (fahr - 32)*5.0/9.0;
		System.out.println("in C: " + cel);
		
		System.exit(0);
	}

}
