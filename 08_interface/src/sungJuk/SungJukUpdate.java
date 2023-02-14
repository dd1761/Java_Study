package sungJuk;

import java.util.ArrayList;

public class SungJukUpdate implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		
		for(int i = 0; i < arrayList.size(); i++) {
			 System.out.println(arrayList.get(i).getNo() + "\t" 
					 			+ arrayList.get(i).getName() + "\t"
					 			+ arrayList.get(i).getKor() + "\t"
					 			+ arrayList.get(i).getEng() + "\t"
					 			+ arrayList.get(i).getMath() + "\t"
					 			+ arrayList.get(i).getTot() + "\t"
					 			+ arrayList.get(i).getAvg() + "\t");
		}
		
		
	}

}
