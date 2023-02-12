package class__;

import java.util.Scanner;

public class Exam {

   Scanner scanner = new Scanner(System.in);
   
   private String name = null;
   private String dap = null;
   private char[] ox = null;
   private int score = 0;
   private final String JUNG = "11111";
   
   public Exam(String name, String dap){
      System.out.print("이름 입력 : ");
      this.name = scanner.next();
      
      System.out.print("답 입력 : ");
      this.dap = scanner.next();
   
      compare();
   }
   
   public void compare() {
      for(int i = 0; i < JUNG.length(); i++) {
         if(dap.charAt(i) == JUNG.charAt(i)) {
            ox[i] = 'o';
            System.out.println(ox[i]);
         }
         else {
            ox[i] = 'x';
            System.out.println(ox[i]);
         }
         
      }
      
   }

   public String getName(String name) {
      return name;
   }
   
   public String getDap(String dap) {
      return dap;
   }
   
   public char[] getOX(char[] ox) {
      return ox;
   }

   public int getScore(int score) {
	  return score;
	
		
   
   }  
}