package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("num 1:");
		int n1 = in.nextInt();
		System.out.println("num 2:");
		int n2 = in.nextInt();
		double avg = (n1+n2)/2.0;
		System.out.println("avg is: " + avg);

	}

}
