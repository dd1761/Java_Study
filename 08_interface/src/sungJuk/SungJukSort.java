package sungJuk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class SungJukSort implements SungJuk {

	public void menu(ArrayList<SungJukDTO> arrayList) {

		while (true) {
			System.out.println("*****************************");
			System.out.println("1. 총점으로 내림차순\n2. 이름으로 오름차순\n3. 이전메뉴");
			System.out.println("*****************************");
			System.out.print("번호 입력 : ");

			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();

			if (num == 3) {
				break;
			}

			Comparator<SungJukDTO> com;
			if (num == 1) {
				com = new Comparator<SungJukDTO>(){
					@Override
					public int compare(SungJukDTO s1, SungJukDTO s2) {
						if (s1.getTot() > s2.getTot()) {
							return -1;
						} else if (s1.getTot() > s2.getTot()) {
							return -1;
						} else {
							return 0;
						}

					}
				};

			}
			else if(num == 2) {
				com = new Comparator<SungJukDTO>(){
					@Override
					public int compare(SungJukDTO s1, SungJukDTO s2) {
						return s1.getName().compareTo(s2.getName());
					}
				};
			
			}
			else {
				System.out.println("1 ~ 3번까지만 입력하세요");
				continue;
			}
			
			Collections.sort(arrayList, com);
			
			new SungJukList().execute(arrayList);
		}
	}

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println();
		this.menu(arrayList);
		

	}
}


/*
Scanner scanner = new Scanner(System.in);

while(true) {
	System.out.println("*****************************");
	System.out.println("1. 총점으로 내림차순\n2. 이름으로 오름차순\n3. 이전메뉴");
	System.out.println("*****************************");
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
	
	if (num == 3) {
		break;
	}
}
*/