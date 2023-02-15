package nested;

public abstract class AbstractTest {	//POJO 형식	추상메소드가 있는 클래스는 반드시 추상클래스여야한다.
	String name;

	public String getName() {
		return name;
	}

	public abstract void setName(String name); //추상메소드
}
