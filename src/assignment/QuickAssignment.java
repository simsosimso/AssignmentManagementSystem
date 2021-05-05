package assignment;

import java.util.Scanner;

public class QuickAssignment extends Assignment implements AssignmentInput{

	protected AssignmentKind kind = AssignmentKind.Quick;
	
	public QuickAssignment(AssignmentKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.println("===assignment will be added===");
		System.out.print("assignment name: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("assignment deadline(yyyy/mm/dd/hh/mm): ");
		String deadline = input.next();
		this.setDeadline(deadline);
	}
	
	public void printInfo(){
		String akind = "none";
		switch(this.kind) {
		case University:
			akind = "Univ.";
			break;
		case Personal:
			akind = "Personal";
			break;
		case Quick:
			akind = "Quick";
		default:
		}
		
		System.out.println("kind="+akind);
		System.out.println("name="+name);
		System.out.println("professor="+professor);
		System.out.println("classname="+classname);
		System.out.println("deadline="+deadline);
	}
	

}

