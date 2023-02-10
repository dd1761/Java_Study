package class__;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str = "학원,집,,게임방";
		
		StringTokenizer st = new StringTokenizer(str, ",");	// ,을 기준으로 자름.
		System.out.println("토큰 개수 = " + st.countTokens());	// "학교" "집" "게임방"
		
		while(st.hasMoreTokens()) {	// 토큰이 있는지 없는지 확인	토큰이 있으면(true) 없으면(false)
			System.out.println(st.nextToken());	//토큰을 꺼내고 다음 토큰으로 이동한다.
			//학원\n 집 \n 게임방
			
		}	// while
		System.out.println("---------------------");
		
		String[] ar = str.split(",");
		
		for(String data : ar) {	//int i = 0; i < ar.length; i++
			System.out.println(data);
		}
		
	}

}
