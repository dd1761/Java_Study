package multi_;

public class MultiFor02 {

	public static void main(String[] args) {
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "단");
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			} //for i
			System.out.println();
		}// for dan

	}

}
