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
				System.out.println("학생수>");
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
				System.out.println("최고점수:" + max);
				System.out.println("평균점수:" + avg);

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	protected static void inputScore(int studentNum, int[] scores, Scanner scanner) {
		if (studentNum > 0) {
			for (int i = 0; i < studentNum; i++) {
				System.out.print("scores[" + i + "]>");
				int score = scanner.nextInt();
				scores[i] = score;
			}
			System.out.println("1.학생수를 입력하세요.");
		}
	}
	protected static void printMenu() {
		System.out.println("----------------------------------------");
		System.out.println("1.학생수|2. 점수입력|3.점수리스트|4.분석|5.종료");
		System.out.println("----------------------------------------");
		System.out.print("선택>");
	}
	private static void maxValue(int studentNum, int[]scores){
		int sum = 0;
		int max = 0;
		for (int i = 0; i < studentNum; i++) {
			sum += scores[i];
			if (scores[i] > max) {
				max = scores[i];
			}

		}System.out.println("최고점수:" + max);
	}
 private static void point(int studentNum,int[]scores) {
	 for (int i = 0; i < studentNum; i++) {
			System.out.println("scores[" + i + "]:" + scores[i]);
		}
 }
	
}


 