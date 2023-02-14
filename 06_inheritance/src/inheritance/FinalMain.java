package inheritance;

enum Color {//enum 은 상수들의 집합체 인 것이다.  // 이 앞에 public static final이 생략되어 있는 것이다. 
   RED, GREEN, BLUE  //각각의 컴퓨터가 아는 이름이 0,1,2
}
//-----------------------
class Final{
   public final String FRUIT = "사과";
   public final String FRUIT2;
   
   public static final String ANIMAL = "기린"; //STATIC은 실행하자마자 메모리 자동으로 생성 . 마치 시음식. (new 안해도 됨.)
   //그래서 상수를 만들 때 public static final이 앞에 같이 들어간다. 
   public static final String ANIMAL2; //static은 뉴 안해도 생성가능. 그래서 생성자로 static은 초기화 불가능. 
   
   
//   public static final int RED = 0;
//   public static final int GREEN = 1;
//   public static final int BLUE = 2;
   
   
   
   static { //static의 초기화 구역이다
      System.out.println("static 초기화 영역");
      ANIMAL2 = "코끼리";
   }
   
   
   
   public Final() {
      System.out.println("기본 생성자");
      FRUIT2 = "딸기"; //생성자는 초기화 시키는 역할을 가진다. 
   }
}
//------------------------------
public class FinalMain {

   public static void main(String[] args) {
      final int A = 10; //상수화 걸겠다.
      //a = 20;  final은 값을 변경시킬 수 없다
      System.out.println("A = " + A);
      
      final int B; //초기값 안넣으면 한번은 값을 넣을 수 있도록 기회를 준다. 
      B = 30;
      // B = 40; 한번만 된다. 
      System.out.println("B = " + B);

      Final f = new Final();
      System.out.println("FRUIT = " + f.FRUIT);
      System.out.println("FRUIT2 = " + f.FRUIT2);
      
      System.out.println("ANIMAL = " + Final.ANIMAL);//static은 뉴 안해도 생성가능. 그래서 생성자로 static은 초기화 불가능. 
      System.out.println("ANIMAL2 = " + Final.ANIMAL2);
      System.out.println();
      
      System.out.println("빨강 = " + Color.RED); //red라고 나옴
      System.out.println("빨강 = " + Color.RED.ordinal()); //그 수치를 알고싶을때.
      
      for( Color data : Color.values()) {
         System.out.println(data + "\t" + data.ordinal());
      }
      
      
      
      
   }

}