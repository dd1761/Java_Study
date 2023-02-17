package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MemberInsert implements Member {

	@Override
	public void execute(List<MemberDTO> list) {
		
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요 : ");
		String name = scanner.next();
		
		System.out.print("나이를 입력해주세요 : ");
		int age = scanner.nextInt();
		
		System.out.print("핸드폰 번호를 입력해주세요 : ");
		String phone = scanner.next();
		
		System.out.print("주소를 입력해주세요 : ");
		String address = scanner.next();
		
		MemberDTO memberDTO = new MemberDTO(name, age, phone, address);

		list.add(memberDTO);
		
		System.out.println("입력하였습니다");
		
	}

}
