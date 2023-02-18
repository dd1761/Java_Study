package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println();
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("번호 입력 : ");
		int no = scanner.nextInt();
	
		int i;
		int sw = 0;

		
		for(SungJukDTO sungJukDTO : arrayList) {	//
			if(sungJukDTO.getNo() == no) {
				sw = 1;
				
				//
				System.out.println(sungJukDTO);
				
				System.out.println();
				System.out.print("수정할 이름 입력 : ");
				String name = scanner.next();
				
				System.out.print("수정할 국어 입력 : ");
				int kor = scanner.nextInt();
				
				System.out.print("수정할 영어 입력 : ");
				int eng = scanner.nextInt();
				
				System.out.print("수정할 수학 입력 : ");
				int math = scanner.nextInt();
				
				
				sungJukDTO.setName(name);
				sungJukDTO.setKor(kor);
				sungJukDTO.setEng(eng);
				sungJukDTO.setMath(math);
				
				sungJukDTO.calc();
				
				System.out.println("수정하였습니다.");
				break;
			}//if

		}//for
		if(sw == 0) {
			System.out.println("없는 번호입니다.");
		}//if i==3
		
//		for(i = 0; i < arrayList.size(); i++) {	//SungJukDTO sungJukDTO : arrayList
//		if(arrayList.get(i).getNo() == no) {
//			break;
//		}//if
//		
//		
//		
//	}//for
	
//		if(i == arrayList.size()) {
//			System.out.println("없는 번호입니다.");
//		}//if i==3
//		else {
//			System.out.println(arrayList.get(i));
//			
//			System.out.print("수정할 이름 입력 : ");
//			String name = scanner.next();
//			
//			System.out.print("수정할 국어 입력 : ");
//			int kor = scanner.nextInt();
//			
//			System.out.print("수정할 영어 입력 : ");
//			int eng = scanner.nextInt();
//			
//			System.out.print("수정할 수학 입력 : ");
//			int math = scanner.nextInt();
//			
//		}//else
		

	}

}
