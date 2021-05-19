//MenuManager.java

import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		AssignmentManager assignmentmanager = new AssignmentManager(input);
		selectMenu(input, assignmentmanager);
	}

	public static void selectMenu(Scanner input, AssignmentManager assignmentmanager) {
		//메뉴 번호
		int num =0;

		while(num != 5) {	
			try {
				//메뉴 명시
				showMenu();
				//메뉴 입력
				num = input.nextInt();
				switch(num) {
				case 1:   //1. add assignment
					assignmentmanager.addAssignment();
					logger.log("add an assignment");
					break;

				case 2:   //2. delete assignment
					assignmentmanager.deleteAssignment();
					logger.log("delete an assignment");
					break;

				case 3:   //3. edit assignment
					assignmentmanager.editAssignment();
					logger.log("edit an assignment");
					break;

				case 4:   //4. view assignment
					assignmentmanager.viewAssignments();
					logger.log("view assignment");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}


	public static void showMenu() {
		System.out.println();
		System.out.println("1. add assignment");
		System.out.println("2. delete assignment");
		System.out.println("3. edit assignment");
		System.out.println("4. view assignments");
		System.out.println("5. exit");
		System.out.print("Selcet one number between 1-5: ");

	}

}