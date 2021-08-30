package program.java.filehandling;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		try {
			FileWriter output = new FileWriter("D:\\phase2.txt");

			output.write(s1);
			System.out.println("Data is Written to the file");
			output.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
