package problem;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			printMenu();

			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				System.out.println("�л���>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				inputScore(studentNum, scores, scanner);
			} else if (selectNo == 3) {
				point(studentNum,scores);
			}
			
			 else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;

				for (int i = 0; i < studentNum; i++) {
					sum += scores[i];
					if (scores[i] > max) {
						max = scores[i];
					}

				}
				avg = (double) sum / studentNum;
				System.out.println("�ְ�����:" + max);
				System.out.println("�������:" + avg);

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
	protected static void inputScore(int studentNum, int[] scores, Scanner scanner) {
		if (studentNum > 0) {
			for (int i = 0; i < studentNum; i++) {
				System.out.print("scores[" + i + "]>");
				int score = scanner.nextInt();
				scores[i] = score;
			}
			System.out.println("1.�л����� �Է��ϼ���.");
		}
	}
	protected static void printMenu() {
		System.out.println("----------------------------------------");
		System.out.println("1.�л���|2. �����Է�|3.��������Ʈ|4.�м�|5.����");
		System.out.println("----------------------------------------");
		System.out.print("����>");
	}
	private static void maxValue(int studentNum, int[]scores){
		int sum = 0;
		int max = 0;
		for (int i = 0; i < studentNum; i++) {
			sum += scores[i];
			if (scores[i] > max) {
				max = scores[i];
			}

		}System.out.println("�ְ�����:" + max);
	}
 private static void point(int studentNum,int[]scores) {
	 for (int i = 0; i < studentNum; i++) {
			System.out.println("scores[" + i + "]:" + scores[i]);
		}
 }
	
}


 