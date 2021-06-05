package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import assignment.AssignmentInput;
import manager.AssignmentManager;

public class AssignmentViewer extends JPanel {
	
	WindowFrame frame;
	
	AssignmentManager assignmentmanager;

	public AssignmentViewer(WindowFrame frame, AssignmentManager assignmentmanager) {
		
		this.frame = frame;
		this.assignmentmanager = assignmentmanager;
		
		System.out.println("###"+assignmentmanager.size()+"###");
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Assignment Name");
		model.addColumn("Class Name");
		model.addColumn("Professor");
		model.addColumn("Deadline");
		
		for(int i=0; i<assignmentmanager.size(); i++) {
			Vector row = new Vector();
			AssignmentInput ai = assignmentmanager.get(i);
			row.add(ai.getName());
			row.add(ai.getClassname());
			row.add(ai.getProfessor());
			row.add(ai.getDeadline());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}

}
