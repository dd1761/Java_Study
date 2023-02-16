package collection;

import java.util.Iterator;
import java.util.Vector;

// Vector 클래스
// 1. Vector 클래스는 List 인터페이스를 구현한 클래스
// 2. Vector 클래스는 배열을 이용하여 데이터를 저장

public class VectorMain {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("벡터 크기 = " + v.size());
		System.out.println("벡터 용량 = " + v.capacity());
		System.out.println();
		
		System.out.println("항목 추가");
		for(int i = 0; i < 10; i++) {
			v.add((i + 1)+"");
			System.out.print(v.get(i) + " ");
		}	//for
		System.out.println();
		System.out.println("벡터 크기 = " + v.size());
		System.out.println("벡터 용량 = " + v.capacity());
		System.out.println();
		
		System.out.println("항목 1개 추가");
		v.addElement(5 + "");	//중복 허용
		System.out.println("벡터 크기 = " + v.size());
		System.out.println("벡터 용량 = " + v.capacity());
		System.out.println();
		
		for(int i = 0; i < v.size(); i++) 
			System.out.print(v.get(i) + " ");
		
		System.out.println();
		
		v.remove(v.size() - 1);
		//v.remove("5");	// 앞부분의 "5"항목이 삭제
//		v.remove(10);	//10번 위치의 항목을 삭제
		System.out.println("마지막 항목 삭제");

		Iterator<String> it = v.iterator();	//인터페이스 생성
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		
	}

}
