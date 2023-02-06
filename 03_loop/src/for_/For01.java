package for_;

public class For01 {

	public static void main(String[] args) {
		
		int i;
		
		for(i = 0; i <= 10; i++) {
			
			System.out.println("Hello Java!!");
			
		}
		System.out.println("탈출 i = " + i);
		System.out.println();
		
		for(i = 10; i >= 1; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		//A B C D E F G~~~ X Y Z
		for( i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i + " ");
		}
		
		
		
	}

}
