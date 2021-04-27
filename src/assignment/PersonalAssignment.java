package assignment;

import java.util.Scanner;

public class PersonalAssignment extends Assignment {
	
	protected AssignmentKind kind = AssignmentKind.Personal;
	protected String rival;
	
	public PersonalAssignment(AssignmentKind kind) {
		super(kind);
	}
	
	public String getRival() {
		return rival;
	}

	public void setRival(String rival) {
		this.rival = rival;
	}
	
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
			else if(answer == 'n'||answer == 'N') {
				this.setProfessor("");
				break;
			}
			else {
				
			}
		
		}	
		
		answer = 'x';
		while(true) {
			System.out.println("Does this class have rival?(Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y'||answer == 'Y') {		
				System.out.print("class rival: ");
				String rival = input.next();
				this.setRival(rival);
				break;
			}
			else if(answer == 'n'||answer == 'N') {
				this.setRival("");
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
		System.out.println("rival="+rival);
		System.out.println("classname="+classname);
		System.out.println("deadline="+deadline);
	}
}
