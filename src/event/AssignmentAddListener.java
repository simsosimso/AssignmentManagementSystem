package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import assignment.AssignmentInput;
import assignment.AssignmentKind;
import assignment.UniversityAssignment;
import exception.DeadlineFormatException;
import manager.AssignmentManager;

public class AssignmentAddListener implements ActionListener {

	JTextField fieldAName;
	JTextField fieldCName;
	JTextField fieldProfessor;
	JTextField fieldDeadline;
	AssignmentManager assignmentmanager;
	
	public AssignmentAddListener(
			JTextField fieldAName, 
			JTextField fieldCName, 
			JTextField fieldProfessor,
			JTextField fieldDeadline,
			AssignmentManager assignmentmanager) {
		this.fieldAName = fieldAName;
		this.fieldCName = fieldCName;
		this.fieldProfessor = fieldProfessor;
		this.fieldDeadline = fieldDeadline;
		this.assignmentmanager = assignmentmanager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		AssignmentInput assignment = new UniversityAssignment(AssignmentKind.University);
		try {
			assignment.setName(fieldAName.getText());
			assignment.setClassname(fieldCName.getText());
			assignment.setProfessor(fieldProfessor.getText());
			assignment.setDeadline(fieldDeadline.getText());
			assignment.printInfo();
			assignmentmanager.addAssignment(assignment);
			putObject(assignmentmanager,"assignmentmanager.ser");
		} catch (DeadlineFormatException e1) {
			e1.printStackTrace();
		}
	}

	public static void putObject(AssignmentManager assignmentmanager, String fileName) {
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(assignmentmanager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
