import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		// Ask how many new users we want to add
		
		System.out.print("Enter number of students to enroll : ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] student = new Student[numOfStudents];
		
		// Create n number of new students
		
		for (int n = 0; n < numOfStudents; n++) {
			student[n] = new Student();
			student[n].enroll();
			student[n].payTuition();
		}
		for (int n = 0; n < numOfStudents; n++) {
			System.out.println(student[n].toString());
		}
		
	}

}
