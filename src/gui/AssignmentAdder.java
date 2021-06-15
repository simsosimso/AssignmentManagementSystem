package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.AssignmentAddCancelListener;
import event.AssignmentAddListener;
import manager.AssignmentManager;

public class AssignmentAdder extends JPanel{
	
	WindowFrame frame;
	AssignmentManager assignmentmanager;

	public AssignmentAdder(WindowFrame frame, AssignmentManager assignmentmanager) {
		
		this.frame = frame;
		this.assignmentmanager = assignmentmanager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
	
		JLabel labelAName = new JLabel("Assignment Name: ",JLabel.TRAILING);
		JTextField fieldAName = new JTextField(10);
		labelAName.setLabelFor(fieldAName);
		panel.add(labelAName);
		panel.add(fieldAName);
		
		JLabel labelCName = new JLabel("Class Name: ",JLabel.TRAILING);
		JTextField fieldCName = new JTextField(10);
		labelCName.setLabelFor(fieldCName);
		panel.add(labelCName);
		panel.add(fieldCName);
		
		JLabel labelProfessor = new JLabel("Professor: ",JLabel.TRAILING);
		JTextField fieldProfessor = new JTextField(10);
		labelProfessor.setLabelFor(fieldProfessor);
		panel.add(labelProfessor);
		panel.add(fieldProfessor);
		
		JLabel labelDeadline = new JLabel("Deadline: ",JLabel.TRAILING);
		JTextField fieldDeadline = new JTextField(10);
		labelDeadline.setLabelFor(fieldDeadline);
		panel.add(labelDeadline);
		panel.add(fieldDeadline);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new AssignmentAddListener(
				fieldAName, fieldCName, fieldProfessor, fieldDeadline, assignmentmanager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new AssignmentAddCancelListener(frame));
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
	
		this.add(panel);
		this.setVisible(true);
	}

}
