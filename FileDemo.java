package program.java.filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {

		try {
			File file = new File("D:\\simplelearn\\phase2.txt");
			if (file.createNewFile()) {
				System.out.println("New File is Created");
			} else {
				if (file.exists()) {
					System.out.println("File Already exists");
					System.out.println("File path : " + file.getAbsolutePath());
					System.out.println("File name " + file.getName());
					System.out.println("File class : " + file.getClass());
					System.out.println("File class : " + file.getParent());
					System.out.println("File class : " + file.getUsableSpace());
					System.out.println("File class : " + file.length());
					System.out.println("File list : " + file.list());

				} else {
					System.out.println("File not exists");
				}
			}
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}
}