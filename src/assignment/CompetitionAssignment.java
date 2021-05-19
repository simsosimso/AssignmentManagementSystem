package assignment;

import java.util.Scanner;

public abstract class CompetitionAssignment extends Assignment {
	
	protected String rival;
	
	public CompetitionAssignment(AssignmentKind kind) {
		super(kind);
	}
	
	public String getRival() {
		return rival;
	}

	public void setRival(String rival) {
		this.rival = rival;
	}
	
	public void setAssignmentRival(AssignmentInput assignment, Scanner input) {
		System.out.print("class rival: ");
		String rival = input.next();
		this.setRival(rival);
	}
	
	@Override
	public abstract void getUserInput(Scanner input);
	@Override
	public void printInfo(){
		String akind = getKindString();
		
		System.out.println("kind="+akind);
		System.out.println("name="+name);
		System.out.println("professor="+professor);
		System.out.println("rival="+rival);
		System.out.println("classname="+classname);
		System.out.println("deadline="+deadline);
	}
	
	public void setAssignmentProfessorwithYN(Scanner input) {
		char answer = 'x';
		while(true) {
			System.out.println("Does this class have professor?(Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y'||answer == 'Y') {		
				setAssignmentProfessor(input);
				break;
			}
			else if(answer == 'n'||answer == 'N') {
				this.setProfessor("");
				break;
			}
			else {
				
			}
		
		}	
	}
	
	public void setAssignmentRivalwithYN(Scanner input) {
		char answer = 'x';
		while(true) {
			System.out.println("Does this class have rival?(Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y'||answer == 'Y') {		
				setAssignmentRival(this, input);
				break;
			}
			else if(answer == 'n'||answer == 'N') {
				this.setRival("");
				break;
			}
			else {
				
			}
		}	
	}

}
