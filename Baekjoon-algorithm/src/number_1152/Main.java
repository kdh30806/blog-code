package number_1152;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String sentence = br.readLine().trim(); // 입력 받은 문자열을 trim()을 통해 앞뒤 공백 제거
		String[] arr = sentence.split(" "); // 띄어쓰기를 기준으로 스플릿
		 
		if(sentence.equals("")) { // 문장은 공백과 단어로 구성되어 있기 때문에 공백만 입력되는 것을 생각 해줘야 한다.
			bw.write(String.format("%d", 0));
		}else {
			bw.write(String.format("%d", arr.length));
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
