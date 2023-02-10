package inheritance;

class AA{
	public int a = 3;
	public void disp() {
		a += 5;
		System.out.print("AA : " + a + " ");
	}
}
//------------------------

class BB extends AA{
	public int a = 8;
	public void disp() {
		a += 5;
		System.out.print("BB : " + a + " ");
	}
}


//--------------------
public class OverrideMain {

	public static void main(String[] args) {
		BB aa = new BB();
		aa.disp();	//13	
		System.out.println("aa : " + aa.a);
		System.out.println();
		
		AA bb = new BB();	//부모 = 자식
		bb.disp();
		System.out.println("aa : " + bb.a);
		
		BB cc = (BB)bb;
		cc.disp();
		System.out.println("cc : " + cc.a);	//18
		System.out.println();
		
		AA dd = new AA();
		dd.disp();
		System.out.println("dd : " + dd.a);
		
		
	}

}
