package baseball;

import java.util.Scanner;

public class BBgame {

	int[] comNum = new int[3];
	int[] usrNum = new int[3];

	// constructor
	BBgame() {
	};

	// method
	void makeComNum() {
		while (true) {
			if ((comNum[0] != comNum[1]) && (comNum[0] != comNum[2]) && (comNum[1] != comNum[2])) {
				break;
			}
			for (int i = 0; i < comNum.length; i++) {
				comNum[i] = (int) (Math.random() * 10);
				System.out.println(comNum[i]);
			}
		}

	}

	void getUsrNum() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");

		for (int i = 0; i < usrNum.length; i++) {
			System.out.print(i + 1 + "번째 수:");
			usrNum[i] = scanner.nextInt();
			// System.out.println(usrNum[i]);

			if (usrNum[i] >= 10 || usrNum[i] < 1) {
				System.out.println("0~9의 숫자만 입력하세요 ");
				System.out.print((i + 1) + "번째 수:");
				usrNum[i] = scanner.nextInt();
			}
		}

	}

	void compareNum() {
		
	
		while (true) {
			int strike = 0;
			int ball = 0;
			makeComNum();
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (comNum[i] == usrNum[j] && i == j) {						
						strike = strike + 1;
					} else if (comNum[i] == usrNum[j] && i != j) {
						ball = ball + 1;
					}
				}
			}

			if (strike == 3) {
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println(strike + "strike, " + ball + "ball \n");

			}
		}
	}
}
