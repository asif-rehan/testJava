package testJava;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOError;

public class Hist {

	public static void main(String[] args) {
		Scanner data = null;
		ArrayList<Integer> count;
		Integer idx;
		//open file
		try {
			data = new Scanner(new File("test.dat"));
		} catch (Exception e) {
			System.out.println("Can't open the file");
			e.printStackTrace();
			System.exit(0);
		}
		//reset counter array 
		count = new ArrayList<Integer>(10);
		for (int i = 0; i < 10; i++) {
			count.add(i, 0);
		}
		//set tally values
		while (data.hasNextInt()) {
			idx = data.nextInt();
			count.set(idx, count.get(idx)+1);
		}
		//shows tally values 
		idx = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println(idx + "occured " + i + " times");
			idx++;
		}
	}

}
