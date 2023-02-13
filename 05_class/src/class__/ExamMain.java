package class__;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("인원수 입력 :");
		int cnt = scanner.nextInt();
		
		Exam[] ar = new Exam[cnt];

		for(int k = 0; k < cnt; k++) {
			ar[k] = new Exam();
			ar[k].compare();
			System.out.println();
		}
//		Exam aa = new Exam();
		
		for(Exam e : ar) {
			System.out.println("이름\t 1 2 3 4 5 \t 점수");
			System.out.print(e.getName() + "\t");
			for(int i = 0; i < e.getOX().length; i++) {
				System.out.print(e.getOX()[i] + " ");
				
			}//for i
			System.out.println("\t" + e.getScore());
		}
		
	}
}