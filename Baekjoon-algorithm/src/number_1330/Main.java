package number_1330;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A;
		int B;
		while(true) {
			A = scan.nextInt();
			B = scan.nextInt();	
			if(A <= 10000 && A >= -10000 && B <= 10000 && B >= -10000) {
				if(A == B) {
					System.out.println("==");
				}else if(A > B) {
					System.out.println(">");
				}else {
					System.out.println("<");
				}
				break;
			}else {
				System.out.println("숫자를 다시 입력해주세요!");
			}
		}
	}
}
