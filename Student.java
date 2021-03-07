import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private String studentId;
	private int gradeYear;
	private String courses = " ";
	private int tuitionBalance;
	private static int courseCost = 500;
	private static int id = 100000;
	private int maxCourse = 5; // each student can enroll in a maximum of 5 courses
	
	
	public Student() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter student's first name: ");
		this.firstName = scanner.nextLine();
		

		System.out.print("Please enter student's last name: ");
		this.lastName = scanner.nextLine();
		
		System.out.print("Please enter student's grade: ");
		this.gradeYear = scanner.nextInt();
		
		setStudentId();
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);
		

	}
	
	// Generate an ID
	private void setStudentId() {
		
		// grade level + id gives the student id
		id++;
		this.studentId = gradeYear + "" + id;
		
	}
	
	
	// Enroll in courses
	public void enroll() { 
		
		do {
			System.out.println("Enter course to enroll (q to quit): ");
			Scanner scanner = new Scanner(System.in);
			String course = scanner.nextLine();
			
			if(!course.equals("q")) {
				
				courses = courses +"\n" + course;
				tuitionBalance = tuitionBalance + courseCost;
			}
			
			else {
				
				break;
			}
			
		} while(maxCourse > 0);
			
		
		System.out.println("You have successfully enrolled!"); 
	}
	
	// View balance
   public void viewBalance() {
		System.out.println("Your balance is: " + tuitionBalance);
	}

	
	// Pay tuition
	public void payTuition () { 
		
		viewBalance();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your payment: ");
		int payment = scanner.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println(" Payment of $" + payment + " has done successfully! Thank you.");
		viewBalance();
		
	}
	
	// Show status
	public String showInfo() {
		
		return "Name: " + firstName + " " + lastName +
				"\nCourses Enrolled: " + courses +
				"\nGrade Level : " + gradeYear +
				"\nStudent ID: " + studentId +
				"\nBalance: $" + tuitionBalance;
	}
	
}
