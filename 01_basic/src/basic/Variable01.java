package basic;

public class Variable01 {

   /**
    * @param args
    */
   public static void main(String[] args) {
      System.out.println(Integer.MIN_VALUE + "," + Integer.MAX_VALUE);	//전부 대문자는 상수 변하지 않는 값.
      System.out.println(Long.MIN_VALUE + "," + Long.MAX_VALUE);
      System.out.println( 25 > 36 );
      
      boolean a;   //논리형 1bit 
      a = 25 > 36;   
      System.out.println("a = " + a);  // false가 나온다. 메모리는 0으로 저장
      
      char b;   //문자형 16bit. 16글자들어간다는 것. 
      b = 'A'; // 65, 0100 0001
      System.out.println("b = " + b); //b = A
      
      char c; //문자형
      c = 65; //A의 아스키 코드. char에서 나오니까 무조건 문자형으로 받는 것임
      System.out.println("c = " + c); //c = A
      
      byte d=0; //1byte, 8bit, -128~+127가 최대값이라는 것. 
      //d = 128; - error: Type mismatch: cannot convert from int to byte
      System.out.println("d = " + d); //d = 127
      
      int e; //4byte, 32bit
      e = 65; //0100 0001
      System.out.println("e = " + e); //e = 65
      
      int f;
      f = 'A'; //아스키 코드로 65이기에 충분히 받아짐. 
      System.out.println("f = " + f); //f = 65 // int형으로 잡았기 때문에 65로 나옴. 
      
      long g;
      g = 25L; //25L은 Long형 상수 (상수는 변하지 않는 값을 뜻함)
      
      float h;
      //h = 43.8; //43.9 은 double형 상수로 봐서 에러가 난다. 
      //h = (float)43.8; //강제형변환 --> 요때만 바꿔주는 것임. 
      h = 43.8F; //43.8F는 태어날 때 부터 float형 상수
      
      
      System.out.println("g = " + g);
   }

}