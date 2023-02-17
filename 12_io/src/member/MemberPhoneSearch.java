package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberPhoneSearch implements Member {

	@Override
	public void execute(List<MemberDTO> list) {
		System.out.println();
		Scanner scanner = new Scanner(System.in);

		System.out.print("검색할 번호 입력 : ");
		String phone = scanner.next();

		int i;
		int sw = 0;

		for (MemberDTO memberDTO : list) { //
			if (memberDTO.getPhone().equals(phone)) {
				sw = 1;
				System.out.println("이름 : " + memberDTO.getName());
				System.out.println("나이 : " + memberDTO.getAge());
				System.out.println("휴대폰 번호 : " + memberDTO.getPhone());
				System.out.println("주소 : " + memberDTO.getAddress());

				break;
			} // if

		} // for
		if (sw == 0) {
			System.out.println("검색한 번호는 없는 번호입니다.");
		} // if i==3

	}

}
