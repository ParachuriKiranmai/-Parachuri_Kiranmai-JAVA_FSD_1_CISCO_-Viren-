package program.java.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamProgram {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\phase2.txt");
		System.out.println(fis.getChannel());
		System.out.println("Number of Bytes read " +fis.available());
		fis.skip(7);
		System.out.println("File Contents : ");
		int ch;
		while((ch=fis.read())!=-1) {
			System.out.println((char)ch);
			fis.close();
		}

	}

}
