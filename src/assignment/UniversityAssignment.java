package assignment;

import java.util.Scanner;

public class UniversityAssignment extends Assignment {
	
	public UniversityAssignment(AssignmentKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.println("===assignment will be added===");
		setAssignmentName(input);
		setAssignmentProfessor(input);
		setAssignmentClassname(input);
		setAssignmentDeadline(input);
	}
	
	public void printInfo(){
		String akind = getKindString();
		
		System.out.println("kind="+akind);
		System.out.println("name="+name);
		System.out.println("professor="+professor);
		System.out.println("classname="+classname);
		System.out.println("deadline="+deadline);
	}
	
}
