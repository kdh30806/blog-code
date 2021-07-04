package number_1193;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int X = Integer.parseInt(br.readLine()); // 주어진 숫자 X
		int floor = 1; // 주어진 숫자 X가 위치한 층 수
		int room = 1; // 주어진 숫자 X가 위치한 방의 위치(몇번째 인가?)
		while (true) { // 층 수 구하기
			if (X <= (floor * (floor + 1)) / 2) { // 분수 갯수의 합이 X를 넘을 때가 층의 위치
				room = X - (floor * (floor - 1)) / 2; // 방의 위치 구하기
				break; // 루프 빠져 나옴
			} else { // 아니면
				floor++; // 층 수 늘리기
			}
		}
		
		if(floor % 2 == 0) { // 층의 위치가 짝수일 때
			bw.write(room + "/" + (floor - (room - 1)));
		}else { // 층의 위치가 홀수일 때
			bw.write((floor - (room - 1)) + "/" + room);	
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
