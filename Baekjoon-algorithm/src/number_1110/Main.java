package number_1110;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {			
		// 규칙
		// 1. 이전의 수의 일의 자리가 다음 수의 십의 자리가 된다.
		// 2. 이전의 수의 각 자리의 합의 일의 자리가 다음 수의 일의 자리가 된다.	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int number = Integer.parseInt(br.readLine());
		int next = (number % 10) * 10 + (((number % 10) + (number / 10)) % 10);
		int count = 1;
			
		while(next != number) {
			count++;
			next = (next % 10) * 10 + (((next % 10) + (next / 10)) % 10);	
		}
		bw.write(count + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
