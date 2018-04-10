package filePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
	
		File file = new File("D:\\aaa.txt");
		
		FileInputStream input = new FileInputStream(file);
		byte[] b = new byte[1024];
		int length = 0;
		while ((length = input.read(b)) != -1) {
			System.out.println(new String(b, 0, length));
			
		}
		
//		input.read( b)
//		
//		int content = input.read();
//		
//		System.out.println("读取到的内容:"+(char)content);
		input.close();
	}
}
