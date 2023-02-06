package basic;

public class SungJuk {

   public static void main(String[] args) {
         char name;
         name = 'L';
         
         int kor, eng, math, tot;
         kor = 85;
         eng = 78;
         math = 100;
         tot = kor + eng + math;
         
         double avg;
         avg = (double)tot / 3;
         
         System.out.println("\t" + "\t" + "\t" +  "*** " + name +"의"+ " 성적표 ***");
         System.out.println("국어" + "\t" + "\t" + "영어" + "\t" + "\t" + "수학" + "\t" + "\t" + "총점" + "\t" + "\t" + "평균");
         System.out.println(kor + "\t" + "\t" + eng + "\t" + "\t" + math + "\t" + "\t" + tot + "\t" + "\t" + String.format("%.2f", avg));

   }

}

/*
[문제] 성적계산
이름(name)이 L 이고 국어점수(kor) 85점, 영어점수(eng) 78점, 수학점수(math) 100점일때 총점(tot)과 평균(avg)을 구하시오
단, 평균은 소수이하 2째자리까지 출력하시오

총점 = 국어점수 + 영어점수 + 수학점수 
평균 = 총점 / 과목수

[실행결과]
    *** L 성적표 ***
국어      영어    수학    총점      평균
85      78      100      xxx      xx.xxx
*/