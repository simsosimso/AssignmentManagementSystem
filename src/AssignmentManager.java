
import java.util.HashSet;
import java.util.Scanner;

import assignment.Assignment;
import assignment.AssignmentInput;
import assignment.AssignmentKind;
import assignment.PersonalAssignment;
import assignment.QuickAssignment;
import assignment.UniversityAssignment;

public class AssignmentManager {
	
	HashSet<AssignmentInput> assignments = new HashSet<AssignmentInput>();
	Scanner input;	
	//모든 assignment가 저장된 HashSet
	
	AssignmentManager(Scanner input){
		this.input = input;
	}

	public void addAssignment() {

		
		System.out.println("1 for University assignment");
		System.out.println("2 for Personal assignment");
		System.out.println("3 for Quick assignment");
		System.out.print("Select Student Kind 1~3:");
		int kind = 0;
		AssignmentInput assignmentInput;
		while(kind!=1 && kind !=2 && kind !=3) {
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

		//입력값 체크
		//System.out.println(assignment.name+"==="+assignment.professor+"==="+assignment.classname+"==="+assignment.deadline);

	}

	public void deleteAssignment() {
		System.out.print("assignment name: ");
		String assignmentName = input.next();
		if(assignments.isEmpty()) {
			System.out.println("the assignment has not been resistered");
			return;
		}
		for(AssignmentInput assi : assignments) {
			if(assi.getName().equals(assignmentName)) {
				assignments.remove(assi);
				assi=null;
				System.out.println("the assignment "+assignmentName +" is deleted");
				break;
			}
		}
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
					System.out.println("1. assignment name");
					System.out.println("2. class professor");
					System.out.println("3. class name");
					System.out.println("4. assignment deadline(yyyy/mm/dd/hh/mm)");
					System.out.println("5. exit");
					System.out.print("select what you want to change: ");

					//메뉴 입력
					num = input.nextInt();
					switch(num) {
					case 1:  
						System.out.print("assignment name: ");
						String name = input.next();
						assi.setName(name);
						break;

					case 2:  
						System.out.print("class professor: ");
						String professor = input.next();
						assi.setProfessor(professor);
						break;

					case 3:  
						System.out.print("class name: ");
						String classname = input.next();
						assi.setClassname(classname);
						break;

					case 4:   
						System.out.print("deadline: ");
						String deadline = input.next();
						assi.setDeadline(deadline);
						break;
					
					}//switch
				}//while
				break;
			}//if
		}//for
	}//method



	public void viewAssignments() {

//		System.out.print("assignment name: ");
//		String assignmentName = input.next();

//		if(assignments.isEmpty()) {
//			System.out.println("the assignment doesn't exist");
//			return;
//		}
		System.out.println("# of registered students: "+assignments.size());
		for(AssignmentInput assi : assignments) {
			System.out.println("===assignment information===");
			assi.printInfo();
			assi.printremainingtime();
			System.out.println();
		}

	}


}
