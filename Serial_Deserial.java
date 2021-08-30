package program.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serial_Deserial{
	
	public static void main(String[] args) throws IOException {
		Student obj = new Student(10, 25, "Kiranmai", "Hyd", 5);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("D:\\student.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			System.out.println("Serialization Done");
		} catch (IOException e) {
			System.out.println(e);
		}
		finally {
			oos.close();
			fos.close();
		}
		
		Student o = null;
		try {
			FileInputStream fis = new FileInputStream("D:\\student.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			o = (Student) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException ioe) {
			System.out.println("not found");
			ioe.printStackTrace();
			return;
		}
		System.out.println("Name " + o.getStuName());
		System.out.println("Age " + o.getStuAge());
		System.out.println("RollNO " + o.getStuRollno());
	}
}

 class Student implements Serializable {

	private int stuRollno;
	private int stuAge;
	private String stuName;
	private String styAdd;
	private int styheight;
	
	public Student(int stuRollno, int stuAge, String stuName, String styAdd, int styheight) {
		super();
		this.stuRollno = stuRollno;
		this.stuAge = stuAge;
		this.stuName = stuName;
		this.styAdd = styAdd;
		this.styheight = styheight;
	}

	public int getStuRollno() {
		return stuRollno;
	}

	public void setStuRollno(int stuRollno) {
		this.stuRollno = stuRollno;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStyAdd() {
		return styAdd;
	}

	public void setStyAdd(String styAdd) {
		this.styAdd = styAdd;
	}

	public int getStyheight() {
		return styheight;
	}

	public void setStyheight(int styheight) {
		this.styheight = styheight;
	}
}
