package number_10818;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main2 {

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
		
		for(int i = 0 ; i < num.length - 1; i++) {
			if(max < Math.max(num[i], num[i+1])) {
				max = Math.max(num[i], num[i+1]);					
			}			
			if(min > Math.min(num[i], num[i+1])) {
				min = Math.min(num[i], num[i+1]);					
			}
		}
				
		bw.write(min + " " + max);

		br.close();

		bw.flush();
		bw.close();
	}

}
