package program.java.filehandling;

import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
	
		char[] array = new char[45];
		try {
			FileReader input = new FileReader("D:\\phase2.txt");
			input.read(array);
			System.out.println("Data in the file");
			System.out.println(array);
			input.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
