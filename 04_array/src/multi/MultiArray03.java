package multi;

public class MultiArray03 {

	public static void main(String[] args) {
		int[][] jumsu = {{91,95,100,0}, {100,88,75,0}, {75,80,48,0}};
		String[] name = {"홍길동", "프로도", "죠르디"};
		double[] avg = new double[3];
		char[] grade = new char[3];

		
		for(int i=0; i < jumsu.length; i++){
			for(int j = 0; j < jumsu[i].length-1; j++){	//국어, 영어, 수학
				jumsu[i][3] += jumsu[i][j];

				}
				avg[i] = ((double)jumsu[i][3]) / 3;
				
				if(avg[i] >= 90) {
					grade[i] = 'A';
				}
				else if(avg[i] >= 80) {
					grade[i] = 'B';
				}
				else if(avg[i] >= 70) {
					grade[i] = 'C';
				}
				else if(avg[i] >= 60) {
					grade[i] = 'D';
				}
				else {
					grade[i] = 'F';
				}
			}
		System.out.println("------------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("------------------------------------------------------");
		
		for(int i = 0; i < jumsu.length; i++) {
			System.out.print(name[i] + "\t");
			for(int j = 0; j < jumsu[i].length; j++) {
				System.out.print(jumsu[i][j] + "\t");
			}
			System.out.print(String.format("%.2f",avg[i]) + "\t" + grade[i]);
			System.out.println();
		}

	}

}

/*

[문제] 

- 총점, 평균, 학점을 구하시오
- 평균은 소수이하 2번째 자리까지 출력

총점 = 국어 + 영어 + 수학
평균 = 총점 / 과목수
학점은 평균이 90 이상이면 'A'
	 평균이 80 이상이면 'B'
	 평균이 70 이상이면 'C'
	 평균이 60 이상이면 'D'
	 그외는 'F'

----------------------------------------------------
이름      국어      영어      수학      총점      평균      학점
----------------------------------------------------
홍길동   90      95      100
프로도   100      89      75
죠르디   75      80      48
----------------------------------------------------

성적 처리 계산 

*/