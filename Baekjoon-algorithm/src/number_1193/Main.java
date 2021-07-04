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

		int X = Integer.parseInt(br.readLine()); // �־��� ���� X
		int floor = 1; // �־��� ���� X�� ��ġ�� �� ��
		int room = 1; // �־��� ���� X�� ��ġ�� ���� ��ġ(���° �ΰ�?)
		while (true) { // �� �� ���ϱ�
			if (X <= (floor * (floor + 1)) / 2) { // �м� ������ ���� X�� ���� ���� ���� ��ġ
				room = X - (floor * (floor - 1)) / 2; // ���� ��ġ ���ϱ�
				break; // ���� ���� ����
			} else { // �ƴϸ�
				floor++; // �� �� �ø���
			}
		}
		
		if(floor % 2 == 0) { // ���� ��ġ�� ¦���� ��
			bw.write(room + "/" + (floor - (room - 1)));
		}else { // ���� ��ġ�� Ȧ���� ��
			bw.write((floor - (room - 1)) + "/" + room);	
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
