package abstract_;

import java.util.Calendar;
import java.util.Scanner;

class CalendarEx {
    private int year; // 년도
    private int month; // 월
    protected Calendar cal = Calendar.getInstance(); // Calendar 객체
    private int dayOfWeek; // 요일
    private int end; // 마지막 일자
    
    Scanner scanner = new Scanner(System.in); // 입력값을 받을 Scanner 객체

    public CalendarEx() {

        System.out.print("년도 입력 : ");
        this.year = scanner.nextInt(); // 년도 입력 받음

        System.out.print("월 입력 : ");
        this.month = scanner.nextInt(); // 월 입력 받음


        calc(year, month); // 입력받은 년월을 이용해 계산
        display(); // 결과 출력

    }

    public void calc(int year, int month) {
        cal.set(Calendar.YEAR, year); // 입력받은 년도로 세팅
        cal.set(Calendar.MONTH, month); // 입력받은 월로 세팅

        cal.set(year, month - 1, 1); // 입력받은 월의 1일로 세팅
        // month는 0이 1월이므로 -1을 해준다

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year); // 입력받은 년도로 세팅
        cal.set(Calendar.MONTH, month - 1); // 입력받은 월로 세팅

        cal.set(year, month - 1, 1); // 입력받은 월의 1일로 세팅
        end = cal.getActualMaximum(Calendar.DATE); // 입력받은 월의 마지막 일자
        dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 입력받은 월의 첫 주의 요일
    }

    public void display() {
        System.out.println("일  월  화  수  목  금  토");
        for (int i = 1; i <= end; i++) {
            if (i == 1) {
                for (int j = 1; j < dayOfWeek; j++) {
                    System.out.print("   "); // 첫 주의 시작일까지 공백 출력
                }
            }
            if (i < 10) {
                System.out.print(" "); // 1~9일까지는 한자리수로 출력하기 위해 공백 추가
            }
            System.out.print(i + " "); // 일자 출력
            if (dayOfWeek % 7 == 0) {
                System.out.println(); // 한 주가 끝나면 줄바꿈
            }
            dayOfWeek++;
        }
        System.out.println();
    }

}

public class CalendarMain {

    public static void main(String[] args) {
        CalendarEx ce = new CalendarEx(); // CalendarEx 객체 생성
    }

}

// 31 , 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31

/*
클래스명 : CalendarEx
필드 : 
메소드 - 기본생성자 : 월, 일을 입력
- 메소드 : calc() -> 매달 1일의 요일이 무엇인지? (Calendar에 메소드 준비)
                -> 매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드 준비)
         display() : 출력


[문제] 만년달력
- 년도, 월을 입력하여 달력을 작성하시오
- 기본생성자 : 입력


[실행결과]
년도 입력 : 2002
월 입력 : 10   

일   월   화   수   목   금   토
     1   2   3   4    5
6    7   8   9   10   11   12
13   14  15  16  17   18   19
20   21  22  23  24   25   26
27   28  29  30  31

*/