package assignments;

public class StudentMarks {

	String name;
	int age;
	char section;
	char gender;
	float subject1, subject2, subject3;

	public StudentMarks(String s, int a, char sec, char g, float sub1, float sub2, float sub3) {
		name = s;
		age = a;
		section = sec;
		gender = g;
		subject1 = sub1;
		subject2 = sub2;
		subject3 = sub3;
	}

	public StudentMarks(String s, int a, char sec, char g, float sub2, float sub3) {
		name = s;
		age = a;
		section = sec;
		gender = g;
		subject2 = sub2;
		subject3 = sub3;
	}
	
	void display() {
		float marks = subject1 + subject2 + subject3;
		double percentage = (marks / 2);
		System.out.println("Name of the student: "+ name);
		System.out.println("Age of the student: "+ age);
		System.out.println("Section of the student: "+ section);
		System.out.println("Gender of the student: "+ gender);
		System.out.println("Total Marks : " + marks);
		System.out.println("Percentage : " + percentage);
	}
	
	void show() {
		float marks = subject2 + subject3;
		double percentage = (marks / 300)*100;
		System.out.println("Name of the student: "+ name);
		System.out.println("Age of the student: "+ age);
		System.out.println("Section of the student: "+ section);
		System.out.println("Gender of the student: "+ gender);
		System.out.println("Total Marks : " + marks);
		System.out.println("Percentage : " + percentage);
	}

	public static void main(String[] args) {
		StudentMarks s1 = new StudentMarks("Kiranmai", 20, 'A', 'F', 100, 100, 100);
		s1.display();
		StudentMarks s2 = new StudentMarks("Raju", 21, 'B', 'M', 70, 70);
		s2.show();
		StudentMarks s3 = new StudentMarks("Joseph", 19, 'C', 'M', 80,90);
		s3.show();
		StudentMarks s4 = new StudentMarks("Kiran", 21, 'A', 'F', 100, 50, 50);
		s1.display();
				
	}

}
