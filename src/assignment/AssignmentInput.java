package assignment;

import java.text.ParseException;
import java.util.Scanner;

import exception.DeadlineFormatException;

public interface AssignmentInput {
	public void getUserInput(Scanner input);

	public String getName();
	
	public void setName(String name);
	
	public String getProfessor();
	
	public void setProfessor(String professor);
	
	public String getClassname();
	
	public void setClassname(String classname);
	
	public String getDeadline();
	
	public void setDeadline(String deadline) throws DeadlineFormatException;
	
	public void printInfo();
	
	public void printremainingtime();
	
	public void setAssignmentName(Scanner input);
	
	public void setAssignmentProfessor(Scanner input);
	
	public void setAssignmentClassname(Scanner input);
	
	public void setAssignmentDeadline(Scanner input);
	
}
