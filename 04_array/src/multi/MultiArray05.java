package multi;

import java.util.Scanner;

public class MultiArray05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt, subjectCnt;
		String[] name;
		String[] subject;
		int[] jumsu;
		int stack = 0;
		
		System.out.print("인원수 입력 : ");
		cnt = scanner.nextInt();
		
		name = new String[cnt];		// 만약 인원수 두명이라면 name[2]로 생성
		
		for(int i = 0; i < cnt; i ++) {
			System.out.print("이름 입력 : ");
			name[i] = scanner.next();		// 이름을 입력받아서 name[0]번째 부터 순서대로 이름 삽입.
			
			System.out.print("과목수 입력 : ");
			subjectCnt = scanner.nextInt();
			subject = new String[subjectCnt];	// 과목수를 입력받아서 과목 수 만큼 과목 배열을생성.
			
			for(int j = 0; j < subjectCnt; j++) {
				System.out.print("과목명 입력: ");
				subject[j] = scanner.next();		// 과목배열에 0번째 부터 과목 수 만큼 과목이름 삽입.	
			}
			jumsu = new int[subjectCnt]; 
			for(int score = 0; score < subjectCnt; score++) {
				System.out.print(subject[score] + "점수 입력 : ");
				jumsu[score] = scanner.nextInt();
				continue;
			}
			stack = stack + 1;
			if(stack == cnt) {
				for(int j = 0; j < cnt; j++) {
					for(int k=0; k < subject[j].length(); k++) {
						System.out.print(subject[j]);
					}
				}
			}
		}
		
		
		

	}

}


/*
인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
평균은 소수이하 2째자리까지 출력

[실행결과]
인원수 : 2 (cnt)

이름입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
---------------------
이름입력 : 이기자
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 과학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
---------------------

이름     국어     영어   총점     평균
홍길동    95     100   xxx     xx.xx

이름      국어  영어   과학    총점      평균
이기자   95   100   90    xxx      xx.xx



*/

