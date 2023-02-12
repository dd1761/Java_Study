package class__;
import java.util.Scanner;
public class ExamMain {


public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("인원수 입력 :");
      int cnt = sc.nextInt();
      
      Exam[] e = new Exam[cnt];
	 
	   
      
      for(int i=0; i<cnt;i++) {
         e[i] = new Exam();
         e[i].compare();         
      }   
      System.out.println("이름    1 2 3 4 5 점수");
      for(int i=0; i<cnt;i++) {
         System.out.print(e[i].getName() + "\t");
         System.out.print(e[i].getOx());
         System.out.print("\t ");
         System.out.println(e[i].getScore());
      }
   }
}