//MenuManager.java

import java.util.Scanner;

public class MenuManger {

	public static void main(String[] args) {
		
		//메뉴 번호
		int num =0;
		Scanner input = new Scanner(System.in);
		
		while(num != 6) {	
		//메뉴 명시
		System.out.println("1. add assignment");
		System.out.println("2. delete assignment");
		System.out.println("3. edit assignment");
		System.out.println("4. view assignment");
		System.out.println("5. show a menu");
		System.out.println("6. exit");
		System.out.print("Selcet one number between 1-6: ");
		
		//메뉴 입력
		num = input.nextInt();
		switch(num) {
		case 1:   //1. add assignment
			System.out.println("===assignment will be added===");
			System.out.print("class name: ");
			String className = input.next();
			System.out.print("class professor: ");
			String classProfessor = input.next();
			System.out.print("assignment name: ");
			String assignmentName = input.next();
			System.out.print("assignment deadline(yyyy/mm/dd): ");
			String assignmentDeadline = input.next();
			
			System.out.print(className+"==="+classProfessor+"==="+assignmentName+"==="+assignmentDeadline);
			break;
		
		case 2:   //2. delete assignment
			System.out.print("assignment name: ");
			String assignmentName2 = input.next();
			
//			while(true) {
//				System.out.println("Are you sure you want to delete it? y/n");
//				char yn = input.next().charAt(0);
//				if(yn=='y') {
//					System.out.println("delete the assignment");
//					break;
//				}
//				else if(yn=='n') {
//					System.out.println("don't delete the assignment");
//					break;
//				}
//			}	
			break;
			
		case 3:   //3. edit assignment
			System.out.print("assignment name: ");
			String assignmentName3 = input.next();
			break;
			
		case 4:   //4. view assignment
			System.out.print("assignment name: ");
			String assignmentName4 = input.next();
			break;
			
		case 5:   //5. show a menu
			break;
		
		}
		
		}
	}

}
