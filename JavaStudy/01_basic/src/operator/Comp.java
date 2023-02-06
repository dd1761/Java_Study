package operator;



public class Comp {

	public static void main(String[] args) {
		
		char ch = 'B';
		/*int a = (int)ch;
		
		char result = a >= 65 && a <= 97 ?  (char)(a+32) : (char)(a-32);
		System.out.println(result);
		*/
		 int result = ch >= 'A' && ch <='Z' ? ch+32 : ch-32;
		 System.out.println(ch + " -> " + (char)result);
		
	}

}



/*

[문제] 변수의 값이 대문자이면 소문자로 변환해서 출력, 소문자이면 대문자로 변환해서 출력하시오

[실행결과]
B → b         e → E











*/