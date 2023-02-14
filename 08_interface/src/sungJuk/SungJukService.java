package sungJuk;

import java.util.Scanner;

public class SungJukService {
	Scanner scanner = new Scanner(System.in);
	SungJuk sungJuk = null;

	public void menu() {

		while (true) {
			System.out.println();
			System.out.println("***************");
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("4. 삭제");
			System.out.println("5. 정렬");
			System.out.println("6. 끝");
			System.out.println("***************");
			System.out.print("번호 입력 : ");
			
			int num = scanner.nextInt();
			
			if (num == 6) {
				break;
			} else if (num == 1) {
				sungJuk = new SungJukInsert();
			} else if (num == 2) {
				sungJuk = new SungJukList();
			} else if (num == 3) {
				sungJuk = new SungJukUpdate();
			} else if (num == 4) {
				sungJuk = new SungJukDelete();
			} else if (num == 5) {
				
			}else {
				System.out.println("1 ~ 6번만 입력해주세요");
				continue;
			}
			sungJuk.execute();
		}

	}

}
