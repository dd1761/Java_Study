package class_;

public class SungJukMain2 {

	public static void main(String[] args) {
		SungJuk aa;
		SungJuk bb;
		SungJuk cc;

		SungJuk[] ar = new SungJuk[3]; // 객체 배열	배열생성  ar ---> { {ar[0]} {ar[1]} {ar[2]} }
		ar[0] = new SungJuk();	// 클래스 생성
		ar[0].setData("홍길동", 91, 95, 100);
		
		ar[1] = new SungJuk();	// 클래스 생성
		ar[1].setData("프로도",100, 89, 75);

		ar[2] = new SungJuk();	// 클래스 생성
		ar[2].setData("죠르디",75, 80, 48);
		
		
		for(int i = 0; i < ar.length; i++) {
			ar[i].calc();
			System.out.println(ar[i].getName() + "\t" 
					+ ar[i].getKor() + "\t" 
					+ ar[i].getEng() + "\t" 
					+ ar[i].getMath() + "\t" 
					+ ar[i].getTot() + "\t" 
					+ ar[i].getAvg() + "\t"
					+ ar[i].getGrade());
		}
		
	

	}	
	
}
