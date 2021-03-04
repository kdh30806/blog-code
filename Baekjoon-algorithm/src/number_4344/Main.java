package number_4344;

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
		
		int caseCount = Integer.parseInt(br.readLine()); // 테스트 케이스 갯수 입력
		Double[] result = new Double[caseCount]; // 테스트 케이스의 결과를 담을 배열
		
		for(int i = 0 ; i < caseCount ; i++) {	// 테스트 케이스의 갯수만큼 반복	
			StringTokenizer st = new StringTokenizer(br.readLine()," "); // 입력받은 테스트케이스 자르기
			int stdCount = Integer.parseInt(st.nextToken()); // 첫번째 숫자(학생수)
			int[] score = new int[stdCount]; // 학생수로 점수 배열 생성
			int sum = 0;
			for(int j = 0 ; j < stdCount ; j++) {
				score[j] = Integer.parseInt(st.nextToken()); // 입력 받은 점수 score 배열에 담기
				sum += score[j]; // 평균을 구하기 위한 sum
			}
			
			int overCount = 0; // 평균 넘는 학생 수 선언
			
			double avg = (double)sum/(double)stdCount; // 평균
			
			for(int z = 0 ; z < score.length ; z++) { // score 배열을 돌면서 평균 이상인 학생 수를 구한다.
				if(score[z] > avg) {
					overCount++;
				}
			}		
			result[i] = (double)overCount/(double)stdCount;	// 테스트 케이스 결과 값을 result에 저장			
		}
		
		for(int i = 0 ; i < result.length ; i++) {
			bw.write(String.format("%.3f%%\n", result[i]*100)); // 출력
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}
