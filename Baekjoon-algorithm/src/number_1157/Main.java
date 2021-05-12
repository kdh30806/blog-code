package number_1157;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int arr[] = new int[26]; //알파벳의 갯수만큼 배열 선언
		
		String word = br.readLine().toUpperCase(); // 입력 받은 문자열을 대문자로 변경
		
		int max = -1;
		char answer = '?';
		
		for(int i = 0 ; i < word.length() ; i++) { // 문자열의 길이만큼 반복
			arr[word.charAt(i) - 65]++; // 해당 알파벳을 카운트
		}
		
		for(int i = 0; i < arr.length; i++) { // 알파벳의 갯수만큼 반복(최대값을 구하기 위함)
			if(max < arr[i]) {  // 최대값 보다 크다면
				max = arr[i]; 
				answer = (char)(i+'A');
			} else if (max == arr[i]) { // 최대값과 같다면
				answer = '?';
			} // else 는 써주지 않는다. 왜냐하면 작은 값은 필요 없기 때문
		}
		
		bw.write(answer);
		
		br.close();
		bw.flush();
		bw.close();
	}

}
