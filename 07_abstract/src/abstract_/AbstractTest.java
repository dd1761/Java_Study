package abstract_;

public class AbstractTest {	//POJO	(Plain Old Java Object)
	private String name;
	
	public AbstractTest() {
		
	}
	
	public AbstractTest(String name) {
		super();
		this.name = name;
	}


	public String getName() {	// 구현
		return name;
	}

	public void setName(String name) {	// 구현
		this.name = name;
	}
	
}
