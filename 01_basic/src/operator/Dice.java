package operator;



public class Dice {

	public static void main(String[] args) {
		int dice1, dice2;		// double(8), int(4)
		int x = 1, y = 6;
		dice1 = (int)(Math.random() * (y-x+1) + x);
		dice2 = (int)(Math.random() * (y-x+1) + x);
		int sum = dice1 + dice2;
		
		
		System.out.println("주사위1 : " + dice1 + "\t 주사위2 : " + dice2 );
		String result = dice1 > dice2 ? "주사위 1 승" : dice1 < dice2  ?  "주사위 2 승" : "무승부";
		System.out.println(result);
		System.out.println("주사위의 합 : " + sum);
		
	}

}

 
		
		

/*

조건 ? 참 : 거짓


조건 ? 참 : 조건 ? 참 : 거짓

 
 
 
[실행결과]
주사위1 : 3   주사위2 : 1
주사위1 승
-----------------------------
주사위1 : 4   주사위2 : 6
주사위2 승
-----------------------------
주사위1 : 3   주사위2 :3
무승부

난수
- 컴퓨터가 불규칙하게 발생하는 수
- 0 <= 난수 < 1

x ~ y 사이의 난수를 만들고 싶다.
(int)(Math.random() * (y-x+1) +x)

65 ~ 90사이 




*/