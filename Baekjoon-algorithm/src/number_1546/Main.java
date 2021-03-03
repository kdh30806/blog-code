package number_1546;

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
	
		int count = Integer.parseInt(br.readLine());
		int[] num = new int[count];

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		// StringTokenizer로 분리하여 배열에 저장
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;	
		
		// 반복문을 통해 맥스값 도출
		for(int i  = 0 ; i < num.length ; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		
		// 반복문을 통해 sum 도출
		double sum = 0;	// 소수점 자리까지 계산하기 위해서 sum을 double로 선언해야함	
		for(int i = 0 ; i < num.length ; i++) {
			sum += (double)num[i]/(double)max*100;
		}
		
		bw.write(String.format("%f", (double)sum/(double)num.length));

		br.close();
		bw.flush();
		bw.close();
	}
}
