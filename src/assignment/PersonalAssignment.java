package assignment;

import java.util.Scanner;

public class PersonalAssignment extends Assignment {
	
	protected AssignmentKind kind = AssignmentKind.Personal;
	
	public void getUserInput(Scanner input) {
		System.out.println("===assignment will be added===");
		System.out.print("assignment name: ");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x';
		while(true) {
			System.out.println("Does this class have professor?(Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y'||answer == 'Y') {		
				System.out.print("class professor: ");
				String professor = input.next();
				this.setProfessor(professor);
				break;
			}
			else if(answer == 'y'||answer == 'Y') {
				this.setProfessor("");
				break;
			}
			else {
				
			}
		
		}	
		System.out.print("class name: ");
		String classname = input.next();
		this.setClassname(classname);
		
		System.out.print("assignment deadline(yyyy/mm/dd/hh/mm): ");
		String deadline = input.next();
		this.setDeadline(deadline);
	}
}
