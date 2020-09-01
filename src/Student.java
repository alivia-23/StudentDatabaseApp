import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeyear;
	private String studentID;
	private String courses = " ";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor prompts users to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter student FirstName : " );
		this.firstName = in.nextLine();
		
		System.out.print("Enter student LastName : " );
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen \n2 - Sophomore \n3 - Junior \n4 - Senior\nEnter student class level : " );
		this.gradeyear = in.nextInt();
		
		setStudentID();
		
		System.out.println(firstName + "  " + lastName + "  " + gradeyear + " " + studentID);
	}
	
	
	// Generate an ID
	private void setStudentID() {
		// grade level + ID
		id++;
		this.studentID = gradeyear + "" + id;
	}
	
	// Enroll in a course
	public void enroll() {
		// get inside a loop when user hits 0
		do {
			System.out.println("Enter course to enroll (Q to quit) : ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} 
			 else {
				 break;
			 }
		} while (1 != 0);
	}
	
	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is : $" +tuitionBalance);
	}
	
	// Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment : $");
		Scanner in = new Scanner(System.in);
	    int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for payment of $ " +payment);
		viewBalance();
	}
	
	// Show status
	public String showInfo() {
		return "Name : " + firstName + " " + lastName +
				"\nGrade level : " + gradeyear +
				"\nStudent ID : " + studentID +
				"\nCourses Enrolled:" +courses +
				"\nBalance: $" +tuitionBalance;
	}

}
