package member;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class MemberFileIntput implements Member {

	@Override
	public void execute(List<MemberDTO> list) {
		System.out.println();

		list.clear(); // 초기화

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Member.txt"));

			while (true) {
				try {
					MemberDTO dto2 = (MemberDTO) ois.readObject();
					list.add(dto2);
				} catch (EOFException e) {
					System.out.println("파일의 끝");
					break;
				}

			}

			ois.close();
			System.out.println("파일 읽기 완료");

		} catch (IOException e) {
			System.out.println("파일을 불러오는데 오류가 발생하였습니다.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		}

	}

}
