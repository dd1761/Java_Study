package constructor;

import java.util.Scanner;

public class MemberService {
	Scanner scanner = new Scanner(System.in); // 전역에서 scanner 사용가능

	private MemberDTO[] ar = new MemberDTO[5]; // 객체 배열 //나중에 유동적으로 바꾸고 싶으면 MemberDTO를 배열로 잡지말고 arrayList로 잡으면 된다.

	public MemberService() {
		System.out.println("기본 생성자");
	}

	public void menu() {
		int num;

		while (true) {
			System.out.println();
			System.out.println("*************");
			System.out.println("1. 가입");
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("4. 탈퇴");
			System.out.println("5. 끝내기");
			System.out.println("*************");
			System.out.print("번호 : ");

			num = scanner.nextInt();

			System.out.println();
			if (num == 5) {
				break;
			}

			if (num == 1) {
				insert();

			} else if (num == 2) {
				list();

			} else if(num == 3) {
				update();
			}
			else if(num == 4) {
				delete();
			}
		}

	}

	public void list() {
		System.out.println("이름\t나이\t핸드폰\t주소");
		for(MemberDTO dto : ar) {	// (MemberDTO dto : ar) 로 사용가능.
			if(dto != null) {
				System.out.println(dto.getName() + "\t"
									+ dto.getAge() + "\t"
									+ dto.getPhone() + "\t"
									+ dto.getAddress()
									);
			}
			
		}
	}

	public void insert() {
		int i;
		for(i = 0; i < ar.length; i++) {
			if(ar[i] == null) {
				break;
			}
			
		}
		
		if(i == ar.length) {
			System.out.println(ar.length + "명의 정원이 꽉 찼습니다.");
			return;	//함수를 벗어나라
		}
		// 데이터 입력
		
		System.out.print("이름을 입력해주세요 : ");
		String name = scanner.next();

		System.out.print("나이를 입력해주세요 : ");
		int age = scanner.nextInt();

		System.out.print("핸드폰 번호를 입력해주세요 : ");
		String phone = scanner.next();

		System.out.print("주소를 입력해주세요 : ");
		String address = scanner.next();

		for(i = 0; i < ar.length; i++) {	
			if(ar[i] == null) {
				// MemberDTO 클래스 생성
				ar[i] = new MemberDTO(name, age, phone, address);							
				break;	// for문을 벗어나라.
			}
		}

		System.out.println("1 row created");
	}
	
	public void update() {
		
		String find;
		System.out.print("핸드폰 번호 입력 : ");
		find = scanner.next();
		
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] != null) {
				if(ar[i].getPhone().equals(find)) {
					
					System.out.println(ar[i].getName() + "\t"
							+ ar[i].getAge() + "\t"
							+ ar[i].getPhone() + "\t"
							+ ar[i].getAddress()
							);
					
					System.out.print("수정 할 이름 입력 : ");
					String name = scanner.next();
									
					System.out.print("수정 할 핸드폰 입력 : ");
					String phone = scanner.next();
					
					System.out.print("수정 할 주소 입력 : ");
					String address = scanner.next();
				
					
					ar[i].setName(name);
					ar[i].setPhone(phone);
					ar[i].setAddres(address);
					
					System.out.println("1 row(s) updated");
					break;
						
				}
				else {
					System.out.println("같은 번호가 없음");
				}
			}
			
		}
	}
	
	public void delete() {
		System.out.print("휴대폰 번호 입력 : ");
		String phone;
		phone = scanner.next();
		for(int i = 0; i < ar.length; i++) {
			if(ar[i].getPhone().equals(phone)) {
				ar[i] = null;
				System.out.println("1 row created");
				break;
			}
		}
	}
}
