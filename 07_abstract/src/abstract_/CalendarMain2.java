package abstract_;

import java.util.Calendar;
import java.util.Scanner;

//수업시간에 같이 한 것.
class CalendarEx1 {
    private int year; // 년도
    private int month; // 월
    protected Calendar cal = Calendar.getInstance(); // Calendar 객체
    private int week; // 요일
    private int lastDay; // 마지막 일자
    
    Scanner scanner = new Scanner(System.in); // 입력값을 받을 Scanner 객체

    public CalendarEx1() {

        System.out.print("년도 입력 : ");
        this.year = scanner.nextInt(); // 년도 입력 받음

        System.out.print("월 입력 : ");
        this.month = scanner.nextInt(); // 월 입력 받음


    }

    public void calc() {
        Calendar cal = Calendar.getInstance();
        
        //생성할 때 기준인 시스템 날짜, 시간을 내가 원하는 날짜와 시간으로 변경
//        cal.set(Calendar.YEAR, this.year);	//년도
//        cal.set(Calendar.MONTH, this.month-1);	//일
//        cal.set(Calendar.DAY_OF_MONTH, 1);	//일
        
        cal.set(year,  month-1, 1);
        week = cal.get(Calendar.DAY_OF_WEEK);	//1일인 요일 구하기
        lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);	//마지막날 구하기
    }

    public void display() {
    	
    	System.out.println();
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        
        for(int i = 1; i < week; i++) {
        	System.out.print("\t");
        }
        
        for(int i=1; i <= lastDay; i++) {
        	System.out.print(i + "\t");
        	
        	if(week % 7 == 0) {
        		System.out.println();
        	}week++;
        }
    }

}

public class CalendarMain2 {

    public static void main(String[] args) {
        CalendarEx1 c = new CalendarEx1(); // CalendarEx 객체 생성
        c.calc();
        c.display();
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