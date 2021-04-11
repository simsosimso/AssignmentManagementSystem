//MenuManager.java

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		AssignmentManager assignmentmanager = new AssignmentManager(input);
		//메뉴 번호
		int num =0;

		while(num != 5) {	
		//메뉴 명시
		System.out.println();
		System.out.println("1. add assignment");
		System.out.println("2. delete assignment");
		System.out.println("3. edit assignment");
		System.out.println("4. view assignments");
		System.out.println("5. exit");
		System.out.print("Selcet one number between 1-6: ");
		
		//메뉴 입력
		num = input.nextInt();
		switch(num) {
		case 1:   //1. add assignment
			assignmentmanager.addAssignment();
			break;
		
		case 2:   //2. delete assignment
			assignmentmanager.deleteAssignment();
			break;
			
		case 3:   //3. edit assignment
			assignmentmanager.editAssignment();
			break;
			
		case 4:   //4. view assignment
			assignmentmanager.viewAssignments();
			break;
		}
		
		}
	}
	
	

}