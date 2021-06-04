
import java.io.Serializable;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import assignment.Assignment;
import assignment.AssignmentInput;
import assignment.AssignmentKind;
import assignment.PersonalAssignment;
import assignment.QuickAssignment;
import assignment.UniversityAssignment;

public class AssignmentManager implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5380524482107709002L;
	
	HashSet<AssignmentInput> assignments = new HashSet<AssignmentInput>();
	transient Scanner input;	
	//모든 assignment가 저장된 HashSet

	AssignmentManager(Scanner input){
		this.input = input;
	}

	public void addAssignment() {
		int kind = 0;
		AssignmentInput assignmentInput;

		while(kind!=1 && kind !=2 && kind !=3) {
			try {
				System.out.println("1 for University assignment");
				System.out.println("2 for Personal assignment");
				System.out.println("3 for Quick assignment");
				System.out.print("Select Student Kind 1~3:");
				kind = input.nextInt();



				if (kind==1) {
					assignmentInput = new UniversityAssignment(AssignmentKind.University);
					assignmentInput.getUserInput(input);
					assignments.add(assignmentInput);
					break;
				}
				else if(kind==2) {
					assignmentInput = new PersonalAssignment(AssignmentKind.Personal);
					assignmentInput.getUserInput(input);
					assignments.add(assignmentInput);
					break;

				}
				else if(kind==3) {
					assignmentInput = new QuickAssignment(AssignmentKind.Quick);
					assignmentInput.getUserInput(input);
					assignments.add(assignmentInput);
					break;
				}
				else {
					System.out.print("Select Student Kind 1~3:");	
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}

		//입력값 체크
		//System.out.println(assignment.name+"==="+assignment.professor+"==="+assignment.classname+"==="+assignment.deadline);

	}

	public void deleteAssignment() {
		System.out.print("assignment name: ");
		String assignmentName = input.next();
		removefromAssignments(findAssignment(assignmentName), assignmentName);
	}


	public AssignmentInput findAssignment(String assignmentName) {
		for( AssignmentInput assi : assignments) {
			if(assi.getName().equals(assignmentName)) {
				return assi;
			}
		}
		return null;		
	}



	public void removefromAssignments(AssignmentInput assignment, String assignmentName) {
		if(assignments.isEmpty() || assignment==null) {
			System.out.println("the assignment has not been resistered");
			return;
		}

		assignments.remove(assignment);
		assignment=null;
		System.out.println("the assignment "+assignmentName +" is deleted");

	}

	public void editAssignment() {

		System.out.print("assignment name: ");
		String assignmentName = input.next();
		if(assignments.isEmpty()) {
			System.out.println("the assignment doesn't exist");
			return;
		}
		for(AssignmentInput assi : assignments) {
			if(assi.getName().equals(assignmentName)) {
				int num =-1;
				while(num!=5) {
					showEditMenu();
					//메뉴 입력
					num = input.nextInt();
					switch(num) {
					case 1:  
						assi.setAssignmentName(input);
						break;
					case 2:  
						assi.setAssignmentProfessor(input);
						break;
					case 3:  
						assi.setAssignmentClassname(input);
						break;
					case 4:   
						assi.setAssignmentDeadline(input);
						break;
					default:
						continue;
					}//switch
				}//while
				break;
			}//if
		}//for
	}//method



	public void viewAssignments() {
		System.out.println("#registered students: "+assignments.size());
		for(AssignmentInput assi : assignments) {
			System.out.println("===assignment information===");
			assi.printInfo();
			assi.printremainingtime();
			System.out.println();
		}
	}

	public int size() {
		return assignments.size();
	}
	
	public AssignmentInput get(int index) {
		int i=0;
		for(AssignmentInput assi : assignments) {
			if(i++==index) return assi;
		}
		return null;
		
	}

	public void showEditMenu() {
		System.out.println("1. assignment name");
		System.out.println("2. class professor");
		System.out.println("3. class name");
		System.out.println("4. assignment deadline(yyyy/mm/dd/hh/mm)");
		System.out.println("5. exit");
		System.out.print("select what you want to change: ");
	}

}
