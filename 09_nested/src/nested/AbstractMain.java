package nested;

public class AbstractMain {

	public static void main(String[] args) {
		AbstractTest at = new AbstractTest() { // 익명 inner 클래스
			public void setName(String name) { // 구현
				this.name = name;
			}
		}; // 익명 inner 클래스

		InterA in = new InterA() { // 인터페이스를 new 시킨게 아니라 익명 inner클래스를 new시킨것.
			public void aa() {
			}

			public void bb() {
			}
		};

		AbstractExam ae = new AbstractExam() {	//원하는 메소드를 Override 한다.
			
		};

	}

}
