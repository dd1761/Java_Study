package while_;

public class DoWhile {

	public static void main(String[] args) {
		int a = 0;
		int count = 0;
		do {
			a++;
			System.out.print(a + " ");
		}while(a < 10);

		System.out.println();
		// 1줄에 7개씩 출력하시오
		
		char ch = 'A';
		do {
			System.out.print(ch + " ");
			ch++;
			
			count = count + 1;	//갯수
			if(count % 7 == 0) {
				System.out.println();
			}
		}while( ch <= 'Z');
	
	
	}

}
