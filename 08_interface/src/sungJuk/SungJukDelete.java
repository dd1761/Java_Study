package sungJuk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println();
		Scanner scanner = new Scanner(System.in);

		System.out.print("삭제할 이름 입력 : ");
		String name = scanner.next();

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

	}

}
