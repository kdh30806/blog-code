package number_2753;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year;
		year = scan.nextInt();

		if (1 <= year && year <= 4000) {
			if (year % 4 == 0) {
				if (year % 100 != 0 || year % 400 == 0) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			} else {
				System.out.println(0);
			}
		}
	}

}
