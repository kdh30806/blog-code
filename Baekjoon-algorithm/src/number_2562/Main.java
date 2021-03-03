package number_2562;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int[] num = new int[9];
		
		for(int i = 0 ; i < 9 ; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		int result = 0;
		
		for(int i  = 0 ; i < num.length ; i++) {
			if(max < num[i]) {
				max = num[i];
				result = i;
			}
		}
		
		bw.write(max + "\n" + (result + 1));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
