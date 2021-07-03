package number_2292;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int a = 0;
		while(true) {
			if(N <= 1 + 3 * a * (a+1)) {
				break;
			}else {
				a++;
			}
		}

		bw.write(String.valueOf(a+1));

		br.close();
		bw.flush();
		bw.close();
	}
}
