package number_2908;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] array = br.readLine().split(" ");
		
		StringBuffer sb1 = new StringBuffer(array[0]).reverse();
		StringBuffer sb2 = new StringBuffer(array[1]).reverse();
		
		bw.write(String.format("%d", Math.max(Integer.parseInt(sb1.toString()), Integer.parseInt(sb2.toString()))));
		
		br.close();
		bw.flush();
		bw.close();
	}
}
