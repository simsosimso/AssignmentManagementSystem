package assignment;

import java.util.Scanner;

public class PersonalAssignment extends CompetitionAssignment {
	
	protected AssignmentKind kind = AssignmentKind.Personal;

	public PersonalAssignment(AssignmentKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.println("===assignment will be added===");
		setAssignmentName(input);
		setAssignmentProfessorwithYN(input);
		setAssignmentRivalwithYN(input);		
		setAssignmentClassname(input);
		setAssignmentDeadline(input);
		
	}
	
	


}