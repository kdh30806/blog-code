package number_2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int A, B;	
		A = scan.nextInt();
		B = scan.nextInt();
		System.out.println(A*(B%10));
		System.out.println(A*((B%100-B%10)/10));
		System.out.println(A*((B-B%100)/100));
		System.out.println(A*B);
	}

}
