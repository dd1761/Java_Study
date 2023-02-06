package operator;

public class Operator04 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		boolean result;
		result = ((num1 += 10) < 0 && (num2+=10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1 + " num2 = " + num2);
		System.out.println();
		
		result = ((num1 += 10) > 0 || (num2+=10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1 + " num2 = " + num2);
		
	}

}




/*
score = 60

score >= 80 && score <= 80

&&연산은 앞연산이 F이면 뒤의 연산을 계산하지 않는다.

score >= 80 & score <= 80
&연산은 앞 연산



*/
