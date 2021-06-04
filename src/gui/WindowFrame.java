package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	
	AssignmentManager assignmentmanager;
	
	MenuSelection menuselection;
	AssignmentAdder assignmentadder;
	AssignmentViewer assignmentviewer;

	
	
	public WindowFrame(AssignmentManager assignmentmanager) {
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.assignmentmanager = assignmentmanager;
		this.menuselection = new MenuSelection(this);
		this.assignmentadder = new AssignmentAdder(this);
		this.assignmentviewer = new AssignmentViewer(this, this.assignmentmanager);
		
		
		this.add(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public AssignmentAdder getAssignmentadder() {
		return assignmentadder;
	}

	public void setAssignmentadder(AssignmentAdder assignmentadder) {
		this.assignmentadder = assignmentadder;
	}

	public AssignmentViewer getAssignmentviewer() {
		return assignmentviewer;
	}

	public void setAssignmentviewer(AssignmentViewer assignmentviewer) {
		this.assignmentviewer = assignmentviewer;
	}
}
