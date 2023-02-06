class HelloTest{
	public static void main(String[] args){

		System.out.print("안녕하세요\n");
		System.out.println("반갑습니다");
		System.out.println(25 + 3);
		System.out.println("25 + 3");
		System.out.println("25" + "3");	//문자열의 +는 결합
		System.out.println("25 + 3 = " + (25 + 3));
		System.out.println("25 / 3 = " + (25 / 3)); // 정수 / 정수는 정수만 나오게 된다.
		System.out.println("25 / 3 = " + (25.0 / 3)); //실수 / 정수는 실수형이 나오게 된다.
		System.out.println("25 / 3 = " + String.format("%4.2f", 25.0 / 3)); //소수이하 둘째자리
		System.out.println("25 / 3 = " + String.format("%.2f", 25.0 / 3));		
		
		
	}	
}