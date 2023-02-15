package sungJuk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class SungJukSort implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. 총점으로 내림차순\n2. 이름으로 오름차순\n3. 이전메뉴");
		System.out.print("번호 입력 : ");

		int num = scanner.nextInt();

		if (num == 1) {

			System.out.println("총점으로 오름차순");
			
			Collections.sort(arrayList);
			

		}

		if (num == 2) {

			System.out.println("이름으로 오름차순");
			Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {

				@Override
				public int compare(SungJukDTO dto1, SungJukDTO dto2) {

					return dto2.getName().compareTo(dto1.getName()) * -1; // 오름차순
				}

			};
			Collections.sort(arrayList, com);

			for (SungJukDTO sungJukDTO : arrayList) {
				System.out.println(sungJukDTO);
			}

		}

	}
}
