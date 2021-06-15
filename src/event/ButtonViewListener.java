package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.AssignmentViewer;
import gui.WindowFrame;
import manager.AssignmentManager;

public class ButtonViewListener implements ActionListener {
	WindowFrame frame;
	AssignmentManager assignmentManager;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		AssignmentManager assignmentManager = getObject("assignmentmanager.ser");
		AssignmentViewer assignmentviewer = frame.getAssignmentviewer();	
		assignmentviewer.setAssignmentmanager(assignmentManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(assignmentviewer);
		frame.revalidate();
		frame.repaint();
	}
	
	public static AssignmentManager getObject(String fileName) {
		AssignmentManager assignmentmanager = null;
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			assignmentmanager = (AssignmentManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return assignmentmanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return assignmentmanager;
	}

}
