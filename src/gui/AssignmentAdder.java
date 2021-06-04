package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AssignmentAdder extends JPanel{
	
	WindowFrame frame;

	public AssignmentAdder(WindowFrame frame) {
		
		this.frame = frame;
		
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
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
	
		this.add(panel);
		this.setVisible(true);
	}

}
