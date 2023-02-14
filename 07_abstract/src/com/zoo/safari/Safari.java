package com.zoo.safari; //com.zoo와는 다른 패키지인 것이다. 

import com.zoo.Zoo;

public class Safari extends Zoo {

   public static void main(String[] args) {
      Zoo z = new Zoo(); //apple 패키지에 없기 때문에 import를 해줘야된다. 
      z.tiger();
//      z.giraffe(); //부모에서는 자식이 안보이기 때문에 에러뜬다. 
//      z.elephant();
//      z.lion(); //문을 안열어놨기 때문에 접근할 수 없다. 
      System.out.println();
      
      Safari s = new Safari();
      s.tiger();
      s.giraffe(); //protected는 다른 패키지에서 sub클래스라면 접근되는데, 단 sub클래스로 생성해야만 한다. 
//      s.elephant();
//      s.lion();

   }

}