package number_2941;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int result = 0;
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < count ; i++) {
			if(check() == true) {
				result++;
			}
		}

		bw.write(String.format("%d", result));

		br.close();
		bw.flush();
		bw.close();
	}
	
	public static boolean check() throws IOException {
		boolean[] alphabet = new boolean[26];
		
		int prevWord = 0; // 이전 문자
		int nowWord = 0; // 현재 문자
		String str = br.readLine();
		
		for(int y = 0 ; y < str.length() ; y++) {
			nowWord = str.charAt(y);			
			if(prevWord != nowWord) { // 이전문자와 같지 않다면 => 중복이 끝난 것
				if(alphabet[nowWord - 'a'] == false) { // 해당문자가 처음 나온 경우
					alphabet[nowWord - 'a'] = true;
					prevWord = nowWord;
				}else { // 해당문자가 이미 나온 경우 => 그룹단어가 아닌 것!!
					return false; // 리턴
				}
			}else { // 같다면 => 중복문자
				continue;
			}
		}
		return true; // return false 되지 않았으면 그룹 단어 !!
	}
}
