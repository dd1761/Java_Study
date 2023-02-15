package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukDelete implements SungJuk{

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

				System.out.println(sungJukDTO);
				
				System.out.println();
				System.out.print("수정할 이름 입력 : ");
				String name = scanner.next();
			
				sungJukDTO.setName(name);

				sungJukDTO.calc();
				
				System.out.println("수정하였습니다.");
				break;
			}//if

		}//for
		if(sw == 0) {
			System.out.println("없는 번호입니다.");
		}//if i==3
		
	}
	

}
