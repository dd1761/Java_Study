package multi;

import java.util.Scanner;

public class MultiArray05 {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int cnt;
      
      System.out.print("인원수 입력 : ");
      cnt = scanner.nextInt(); 
      String[] name = new String[cnt];      // 만약 인원수 두명이라면 name[2]로 생성
      
      int subjectCnt;
      String subject[][] = new String[cnt][];	// cnt 인원수 만큼 subject의 행을 생성. 그리고 열의 개수는 모르기때문에 놔둔다.
      double[] avg = new double[cnt];
      int jumsu[][] = new int [cnt][];		// 점수 배열을 새로 생성. 인원수 만큼 행을 생성하고 열의 개수는 입력받을 것.
      
      for(int i = 0; i < cnt; i++) {
    	  System.out.print("이름 입력 : ");
    	  name[i] = scanner.next();
      
      
    	  System.out.print("과목수 입력 : ");
          subjectCnt = scanner.nextInt();

          subject[i] = new String[subjectCnt];
          for(int j=0; j < subjectCnt; j++) {
        	  System.out.print("과목명 입력 :");
              subject[i][j] = scanner.next();
            
          }
          jumsu[i] = new int[subjectCnt+1];
          for(int j = 0; j <subjectCnt; j++) {
        	  System.out.print(subject[i][j] + "점수 입력 : ");
              jumsu[i][j] = scanner.nextInt();
              
              
              jumsu[i][subjectCnt] += jumsu[i][j];
          }
          
          avg[i] = (double)jumsu[i][subjectCnt] / subjectCnt;	//여기까지 한사람 분량.
          
          System.out.println("-------------------------");
      }
      
      for(int i=0; i < cnt; i++) {
    	  
    	  System.out.println("이름");
    	  for(int j=0; j<subject[i].length; j++) {
    		  System.out.print(subject[i][j] + "\t");
    	  }
    	  System.out.print("총점\t평균");
    	  
    	  System.out.print("\n" + name[i] + "\t");
    	  for(int j=0; j <jumsu[i].length; j++) {
    		  System.out.print(jumsu[i][j] + "\t");
    	  }
    	  System.out.println(String.format("%.2f", avg[i]) + "\n");
    		  
    	  
    	  
      }
      

   }

}