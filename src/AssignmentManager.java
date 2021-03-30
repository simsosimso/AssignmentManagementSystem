import java.util.Scanner;

public class AssignmentManager {

	Assignment assignment;
	Scanner input;	
	
	AssignmentManager(Scanner input){
		this.input = input;
	}
	
	public void addAssignment() {

		assignment = new Assignment();
		System.out.println("===assignment will be added===");
		System.out.print("assignment name: ");
		assignment.name = input.next();
		System.out.print("class professor: ");
		assignment.professor = input.next();
		System.out.print("class name: ");
		assignment.classname = input.next();
		System.out.print("assignment deadline(yyyy/mm/dd/hh/mm): ");
		assignment.deadline = input.next();
		
		//입력값 체크
		System.out.println(assignment.name+"==="+assignment.professor+"==="+assignment.classname+"==="+assignment.deadline);
		
	}
	
	public void deleteAssignment() {
		System.out.print("assignment name: ");
		String assignmentName = input.next();
		if(assignment == null) {
			System.out.println("the assignment has not been resistered");
			return;
		}
		if(assignment.name.equals(assignmentName)) {
			assignment=null;
			System.out.println("the assignment is deleted");
		}
	}
	
	
	public void editAssignment() {
		
		System.out.print("assignment name: ");
		String assignmentName = input.next();
		if(assignment.name.equals(assignmentName)) {
			assignment=null;
			System.out.println("the assignment to be eddited is "+assignmentName);
		}
	}
	
	
	
	public void viewAssignment() {
		
		System.out.print("assignment name: ");
		String assignmentName = input.next();
		if(assignment.name.equals(assignmentName)) {
			System.out.println("===assignment information===");
			assignment.printInfo();
			assignment.printremainingtime();
		}
	}
	

}
