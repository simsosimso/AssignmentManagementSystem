package assignment;

import java.util.Scanner;

public class QuickAssignment extends Assignment {

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

}

