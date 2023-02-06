package operator;

public class Operator03 {

	public static void main(String[] args) {
		int a = 5;
		a += 2;	//a = a + 2;
		a *= 3; // a = a * 3;
		a /= 5; // a = a / 5;
		System.out.println(a);	//4
		
		a++;
		System.out.println(a);	//5
		
		int b = a++;			// b = a 먼저 연산 후 a++ 연산
		System.out.println("a = " + a + " b = " + b);
		
		int c = ++a * b--; // ++a 연산  c = a * b  b-- 1) ++a = 7 
						   //2) a * b = 35 
							//3) b--  = 4 
		System.out.println("a++ = " + a++);
		
		System.out.println("a = " + a);
	}

}


/* 
 * a = a+1 -> a += 1 -> ++a / ++a
 * 
 * a = a-1 -> a -= 1 -> a-- / --a
 * 
 * a = a+2 -> a += 2
 * 
 * a = a*3 -> a *= 3
 * 
 * a = a / 5 -> a /= 5
 * 
 * 
 * 
 * 
 * 
 *
 * 
 * 
 * 
 */
