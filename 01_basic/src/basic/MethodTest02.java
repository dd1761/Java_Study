package basic;

import java.util.Arrays;
import java.util.Random;

public class MethodTest02 {

	public static void main(String[] args) {
		//난수 - 컴퓨터가 불규칙적으로 발생하는 수
		//	- 0 <= 난수 < 1
		double a = Math.random();
		System.out.println("난수 = " + a); //난수 = 0.3585105548100035

		Random r = new Random();	// java.util안에 있는 Random을  import시켜준다.
		double b = r.nextDouble();
		System.out.println("난수 = " + b); //난수 = 0.7474797056181735
		// 커밋
		int[] ar = new int[5];	//배열	ar[0]부터 ar[4]까지 5개를 만든다.
		ar[0] = 25;
		ar[1] = 13;
		ar[2] = 45;
		ar[3] = 30;
		ar[4] = 15;
		System.out.println(ar[0] + ", " + ar[1] + ", " + ar[2] + ", " + ar[3] + ", " + ar[4]); //25, 13, 45, 30, 15
		
		Arrays.sort(ar);	//정렬 - 오름차순
		System.out.println(ar[0] + ", " + ar[1] + ", " + ar[2] + ", " + ar[3] + ", " + ar[4]); //13, 15, 25, 30, 45
	}

}
