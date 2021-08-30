package program.java.filehandling;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamProgram {

	public static void main(String[] args) throws IOException {
		
		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fos = new FileOutputStream("D:\\phase2.txt", true);
		BufferedOutputStream bout = new BufferedOutputStream(fos, 1024);
		System.out.println("Enter text ( @ at the end ) :");
		char ch;
		while((ch=(char)dis.read())!='@') {
			bout.write(ch);
		}
        bout.close();
	}

}
