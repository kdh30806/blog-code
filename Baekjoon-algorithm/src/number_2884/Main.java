package number_2884;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H, M, set_H, set_M;
		H = scan.nextInt();
		M = scan.nextInt();

		if (0 <= H && 23 >= H && 0 <= M && 59 >= M) {
			set_H = H;
			set_M = M - 45;
			if (set_M < 0) {
				set_H--;
				if (set_H < 0) {
					set_H = 23;
				}
				set_M = set_M + 60;
			}	
			System.out.println(set_H + " " + set_M);
		}

	}

}
