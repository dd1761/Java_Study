package abstract_;

import java.util.Calendar;
import java.util.Scanner;

class CalendarEx{
	private int year;
	private int month;
	protected Calendar cal = Calendar.getInstance();
	private int dayOfWeek;
	private int end;
	Scanner scanner = new Scanner(System.in);
	
	
	public CalendarEx() {
		
		System.out.print("년도 입력 : ");
		year = scanner.nextInt();
		
		System.out.print("월 입력 : ");
		month = scanner.nextInt();
		
		this.year = year;
		this.month = month;
		calc(year, month);
	    display();

	}
	
	public void calc (int year, int month) {
		cal.set(Calendar.YEAR, year); //입력받은 년도로 세팅
		cal.set(Calendar.MONTH, month); //입력받은 월로 세팅
		

		cal.set(year,month-1,1); //입력받은 월의 1일로 세팅
        //month는 0이 1월이므로 -1을 해준다
		Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);



        cal.set(year, month - 1, 1);
        end = cal.getActualMaximum(Calendar.DATE);
        dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	}
	
	public void display() {

        System.out.println("  일   월  화   수   목  금   토");
        for (int i = 1; i <= end; i++) {
            if (i == 1) {
                for (int j = 1; j < dayOfWeek; j++) {
                    System.out.print("    ");
                }
            }
            if (i < 10) {
                System.out.print(" ");
            }
            System.out.print(" " + i + " ");
            if (dayOfWeek % 7 == 0) {
                System.out.println();
            }
            dayOfWeek++;
        }
        System.out.println();

    }
	

	
	public int getYear(int year) {
		return year;
	}
	public int getMonth(int month) {
		return month;
	}
	public int[] getMaxDate(int[] maxdate) {
		return maxdate;
	}
}

public class CalendarMain {
	
	public static void main(String[] args) {
	    CalendarEx ce = new CalendarEx();
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