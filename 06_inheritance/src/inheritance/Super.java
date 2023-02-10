package inheritance;


public class Super extends Object { //항상 extends Object가 붙어있었다. Object를 상속받고 있엇음\
	protected double weight, height;
	
	Super(){
		System.out.println("Super 기본 생성자");
	}
	
	Super(double weight, double height){
		this.weight = weight;
		this.height = height;
		
	}
	
	public void disp() {
		System.out.println("몸무게 : " + weight);
		System.out.println("키 : " + height);
	}
	
	
}
