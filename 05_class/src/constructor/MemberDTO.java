package constructor;

public class MemberDTO {	//1인분	DTO = Data Transfer Object
							// MemberVO라고 사용하는 사람들도 있다. Value Object
	private String name;
	private int age;
	private String phone;
	private String address;
	
	//생성자를 통해서 데이터 4개를 받아온다.
	//getter 생성.
	
	public MemberDTO(String name, int age, String phone, String address) {

		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setAddres(String address) {
		this.address = address;
	}
}
