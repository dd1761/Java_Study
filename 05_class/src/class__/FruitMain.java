package class__;

class Fruit{
   private String pum;
   private int jan;
   private int feb;
   private int mar;
   private int tot;
   private int sumJan;
   private int sumFeb;
   private int sumMar;
   
   public Fruit(String pum, int jan, int feb, int mar) {
      this.pum = pum;
      this.feb = feb;
      this.jan = jan;
      this.mar = mar;
      
   }
   
   public void calcTot() {
      this.tot = feb + jan + mar;
   }
   
   public void display() {
      System.out.println("---------------------------------");
      System.out.println("PUM      JAN   FEB   MAR      TOT");
   }
   


   public static void output() {
      System.out.println("static method...");
   }
}

//-------------------
public class FruitMain {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

   }

}


/*
과일 판매량 구하기
월별 매출합계도 구하시오

클래스 : Fruit
필드   : pum, jan, feb, mar, tot
        sumJan, sumFeb, sumMar

메소드 : 생성자(품명, 1월, 2월, 3월)
      calcTot()
      display()
      public static void output() --> sumjan ..

클래스 : FruitMain

[실행결과]
---------------------------------
PUM      JAN   FEB   MAR      TOT
---------------------------------
사과       100    80    75        255 --> 객체 배열
포도        30    25    10        65
딸기        25    30    90        145
---------------------------------
        155   135   175            output()로 처리
*/