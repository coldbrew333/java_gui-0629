package java0629;

public class Ex7 {

	public static void main(String[] args) {
		// ������ 2���� �迭 scores
		int[][] scores = {
				{ 85, 60, 70 },
				{ 90, 95, 80 },
				{ 75, 80, 100 },
				{ 80, 75, 95 },
				{ 100, 65, 80 }
		};
		
		// �������
		// 1���л�    85  60  70   ����  ���
		// 2���л�    90  95  80   ����  ���
		// 3���л�    75  80  100  ����  ���
		// 4���л�    80  75  95   ����  ���
		// 5���л�   100  65  80   ����  ���
		int sum = 0;
		double avg = 0;
		for (int r=0; r<scores.length; r++) {
			System.out.print((r + 1) + "���л�: \t");
			sum = 0;
			for (int c=0; c<scores[r].length; c++) {
				System.out.print(scores[r][c] + "\t");
				sum += scores[r][c];
			} // for
			avg = (double) sum / scores[r].length;
			
			System.out.print(sum + "\t");
			System.out.print(avg + "\n");
			
		} // for
	} // main

}
