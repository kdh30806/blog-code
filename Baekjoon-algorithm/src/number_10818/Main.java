package number_10818;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] num = new int[count];

		st = new StringTokenizer(br.readLine()," ");

		for (int i = 0; i < num.length; i++) {
			int A = Integer.parseInt(st.nextToken());
			num[i] = A;
		}
		
		int max = num[0];
		int min = num[0];
		
		for(int i = 0 ; i < num.length; i++) {
			for(int j = i + 1 ; j < num.length; j++) {
				if(max < Math.max(num[i], num[j])) {
					max = Math.max(num[i], num[j]);					
				}
				
				if(min > Math.min(num[i], num[j])) {
					min = Math.min(num[i], num[j]);					
				}
			}
		}
		
		
		bw.write(max + " " + min);

		br.close();

		bw.flush();
		bw.close();
	}

}
