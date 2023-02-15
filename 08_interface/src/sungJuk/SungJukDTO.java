package sungJuk;

import java.util.Comparator;



public class SungJukDTO implements Comparable<SungJukDTO> {	//1인분
	private int no;	//번호
	private String name;	//이름
	private int kor, eng, math, tot;	//국어, 영어, 수학, 총점
	private double avg;	// 평균
	
	public SungJukDTO(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void calc() {
		tot = kor + eng + math;
		avg = tot / 3.0;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	@Override
		public String toString() {
			return no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg;
		}

	@Override
	public int compareTo(SungJukDTO dto) {
		//age로 오름차순
		if(this.tot > dto.tot) {
			return -1;
		}else if(this.tot < dto.tot) {
			return 1;
		}else {
			return 0;			
		}
	}
	

	
}
