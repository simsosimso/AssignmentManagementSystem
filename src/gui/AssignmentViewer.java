package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AssignmentViewer extends JFrame {

	public AssignmentViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Assignment Name");
		model.addColumn("Class Name");
		model.addColumn("Professor");
		model.addColumn("Deadline");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	
	}

}
