package constructor;

public class VarArgs {

	public VarArgs() {
		System.out.println("기본 생성자");	//default 생성잔
	}
	
	public int sum(int...ar) {	//배열화 // ...은 int형의 개수만큼 ar배열을 생성한다.
		int hap=0;
		for(int i = 0; i < ar.length; i++) {
			hap += ar[i];
		}
		return hap;
	}
	
	public static void main(String[] args) {
		VarArgs va = new VarArgs(); // 생성자 호출	// 순서 VarArgs() -> main
		System.out.println("합 = " + va.sum(10, 20));	//	합 = 30
		System.out.println("합 = " + va.sum(10, 20, 30));	//합 = 60
		System.out.println("합 = " + va.sum(10, 20, 30, 40));	//합 = 100
	}

}
