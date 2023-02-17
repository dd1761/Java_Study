package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberService {

//private ArrayList<MemberDTO> arrayList = new ArrayList<MemberDTO>();

	public void menu() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Scanner scanner = new Scanner(System.in);
		Member member = null;
		int num;

		while (true) {
			System.out.println();
			System.out.println("***************");
			System.out.println("1. 등록");
			System.out.println("2. 출력");
			System.out.println("3. 핸드폰 검색");
			System.out.println("4. 이름으로 오름차순");
			System.out.println("5. 파일 저장");
			System.out.println("6. 파일 읽기");
			System.out.println("7. 끝");
			System.out.println("***************");
			System.out.print("번호 입력 : ");

			num = scanner.nextInt();

			if (num == 7) {
				break;
			} else if (num == 1) {
				member = new MemberInsert();
			} else if (num == 2) {
				member = new MemberPrint();
			} else if (num == 3) {
				member = new MemberPhoneSearch();
			} else if (num == 4) {
				member = new MemberNameAsc();
			} else if (num == 5) {
				member = new MemberFileOutput();
			} else if (num == 6) {
				member = new MemberFileIntput();
			} else {
				System.out.println("1 ~ 7번만 입력해주세요");
				continue;
			}
			member.execute(list);
		}

	}
}
