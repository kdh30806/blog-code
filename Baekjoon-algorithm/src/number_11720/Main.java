package number_11720;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		String str_num = br.readLine();
		char[] char_num = str_num.toCharArray();
		
		int num = 0;
		int sum = 0;
		
		for(int i = 0 ; i < count ; i++) {
			num = Integer.parseInt(""+char_num[i]);
			sum += num;
		}
		
		bw.write(String.format("%d", sum));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
