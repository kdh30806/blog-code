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
		
		int count = Integer.parseInt(br.readLine()); // 숫자의 갯수
		String str_num = br.readLine(); // 숫자를 문자열로 입력 받기
		char[] char_num = str_num.toCharArray(); // 숫자를 char[]에 저장
		
		int num = 0;
		int sum = 0;
		
		for(int i = 0 ; i < count ; i++) {
			num = Integer.parseInt(""+char_num[i]); // char를 String으로 변환 시킨후 parseInt
			sum += num;
		}
		
		bw.write(String.format("%d", sum));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
