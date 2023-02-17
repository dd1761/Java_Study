package member;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MemberNameAsc implements Member {
	
//	public void memberasc(List<MemberDTO> list) {
//		Comparator<MemberDTO> com;
//		
//			com = new Comparator<MemberDTO>(){
//				@Override
//				public int compare(MemberDTO s1, MemberDTO s2) {
//					return s1.getName().compareTo(s2.getName());
//				}
//			};
//			Collections.sort(list, com);
//			
//			new MemberPrint().execute(list);
//		
//		
//	}
	
	

	@Override
	public void execute(List<MemberDTO> list){
		Collections.sort(list);

		System.out.println("이름\t나이\t핸드폰\t주소");
		for(MemberDTO memberDTO : list){
			System.out.println(list);
		}
	}


}
