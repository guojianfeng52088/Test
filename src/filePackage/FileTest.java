package filePackage;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		
		File parentFile = new File("D:\\");
		File file = new File("D:\\", "a.txt");
		System.out.println("文件是否存在?"+file.exists());
		
	}
}
