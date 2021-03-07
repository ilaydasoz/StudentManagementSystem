import java.util.Scanner;

public class StudentManagement {
	
	public static void main (String[] args) { 
		
		// Ask how many students to enroll
		System.out.print("Enter number of new students to enroll : ");
		Scanner scanner = new Scanner (System.in);
		int numOfStudents = scanner.nextInt();
		Student[] students = new Student[numOfStudents];
		
		// Create n number of students
		for (int n=0; n < numOfStudents; n++) {
			
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();

		}
		
		// Show students
		System.out.println(" Students' Info: ");
		for (int n=0; n < numOfStudents; n++) {
        	 
        	 System.out.println(students[n].showInfo());
		}
		
	}
}
