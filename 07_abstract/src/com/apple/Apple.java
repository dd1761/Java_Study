package com.apple;

import com.zoo.Zoo;

public class Apple {

   public static void main(String[] args) {
      System.out.println("빨간 사과");

      Zoo z = new Zoo(); //apple 패키지에 없기 때문에 import를 해줘야된다. 
      z.tiger();
//      z.giraffe();
//      z.elephant();
//      z.lion(); //문을 안열어놨기 때문에 접근할 수 없다. 
      
   }

}