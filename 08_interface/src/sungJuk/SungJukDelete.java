package sungJuk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {	// arrayList는 주소값을 가지고 온다.
		System.out.println();
		Scanner scanner = new Scanner(System.in);

		System.out.print("삭제할 이름 입력 : ");
		String name = scanner.next();

		//같은 이름 삭제
		int count = 0;

//		for(int i = 0; i < arrayList.size(); i++) {
//			if(arrayList.get(i).getName().equals(name)) {
//				arrayList.remove(i);
//				count++;	//	지운 횟수
//			}
//		}//for
		
//		for (SungJukDTO sungJukDTO : arrayList) {
//			if (sungJukDTO.getName().equals(name)) {
//				arrayList.remove(sungJukDTO);
//				count++;
//			} // if
//
//		} // for java.util.ConcurrentModificationException 에러 발생
		
		Iterator<SungJukDTO> it = arrayList.iterator();
		while(it.hasNext()) {
			SungJukDTO sungJukDTO = it.next();	
			
			if(sungJukDTO.getName().equals(name)){
				it.remove();	//it.next()가 반환하는 항목을 지운다.
				count++;
			}
		}	//while
		
		
		if(count == 0) {
			System.out.println("회원의 정보가 없습니다.");
		}
		else {
			System.out.println(count + "건을 삭제하였습니다.");
		}
		
		

	}

}


/*
int i;
		int sw = 0;

for (SungJukDTO sungJukDTO : arrayList) {
	if (sungJukDTO.getName().equals(name)) {
		sw = 1;
		arrayList.remove(sungJukDTO);
		System.out.println();
		System.out.println("삭제하였습니다.");
		sungJukDTO.calc();
		break;
	} // if

} // for
if (sw == 0) {
	System.out.println("없는 이름입니다.");
} // if i==3
*/