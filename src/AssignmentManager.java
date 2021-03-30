
import java.util.HashSet;
import java.util.Scanner;

public class AssignmentManager {

	Assignment assignment;
	Scanner input;	
	//assignment 저장된 list
	HashSet<Assignment> assignments = new HashSet<Assignment>();

	AssignmentManager(Scanner input){
		this.input = input;
	}

	public void addAssignment() {

		assignment = new Assignment();
		assignments.add(assignment);

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
		//System.out.println(assignment.name+"==="+assignment.professor+"==="+assignment.classname+"==="+assignment.deadline);

	}

	public void deleteAssignment() {
		System.out.print("assignment name: ");
		String assignmentName = input.next();
		if(assignment == null) {
			System.out.println("the assignment has not been resistered");
			return;
		}
		if(assignment.name.equals(assignmentName)) {
			assignments.remove(assignment);
			assignment=null;
			System.out.println("the assignment is deleted");
		}
	}


	public void editAssignment() {

		System.out.print("assignment name: ");
		String assignmentName = input.next();
		if(assignment == null) {
			System.out.println("the assignment doesn't exist");
			return;
		}
		if(assignment.name.equals(assignmentName)) {
			//assignment=null;
			
			System.out.println("1. assignment name");
			System.out.println("2. class professor");
			System.out.println("3. class name");
			System.out.println("4. assignment deadline(yyyy/mm/dd/hh/mm)");
			System.out.print("select what you want to change: ");
			
			//메뉴 입력
			int num = input.nextInt();
			System.out.print("change: ");
			switch(num) {
			case 1:  
				assignment.name = input.next();
				break;

			case 2:  
				assignment.professor = input.next();
				break;

			case 3:  
				assignment.classname = input.next();
				break;

			case 4:   
				assignment.deadline = input.next();
				break;
			}
			System.out.println("the assignment to be eddited is "+assignmentName);
		}
	}



	public void viewAssignment() {

		System.out.print("assignment name(\"all\" if you want view all assignment): ");
		String assignmentName = input.next();
		if(assignment == null) {
			System.out.println("the assignment doesn't exist");
			return;
		}
		if(assignmentName.equals("all")) {
			for(Assignment assi : assignments) {
				System.out.println("===assignment information===");
				assi.printInfo();
				assi.printremainingtime();
				System.out.println();
			}
		}
		else if(assignment.name.equals(assignmentName)) {
			System.out.println("===assignment information===");
			assignment.printInfo();
			assignment.printremainingtime();
		}
	}


}
