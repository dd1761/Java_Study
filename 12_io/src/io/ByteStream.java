package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) throws IOException {
			
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("data.txt")));
			int data;
			
			while( (data = bis.read()) != -1) {	// 마지막 다음 값이 없으면 -1을 가지고 온다.
				System.out.print((char)data);	//char형으로 변환하여 출력
			}
			System.out.println();
			
	}

}
