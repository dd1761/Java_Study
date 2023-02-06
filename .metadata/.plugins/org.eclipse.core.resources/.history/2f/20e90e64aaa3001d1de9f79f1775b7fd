package operator;

public class Boxing {
    
    public static void main(String[] args) {
        int a = 25;
        double b = (double) a / 3;

        String c = "25";

        //int d = (int)c; // error (기본형) 객체형
        int d = Integer.parseInt(c); // 문자열을 정수로 변환

        int e = 5;  //JDK 5.0, auto-boxing
        
        Integer f = e; // auto-boxing
        //Integer f = new Integer(e); // auto-boxing jdk 5.0 이전

        Integer g = 5;
        //int h = g; // auto-unboxing 또는 unauto-boxing  (객체형 -> 기본형) 객체형을 기본형으로 바꿔주는 것.
        int h = g.intValue();
        
        

    }
}

// 25 -> "25"  25 + ""
// "25" -> 25  Integer.parseInt("25")



