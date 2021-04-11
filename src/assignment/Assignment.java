package assignment;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Assignment {
	
		protected AssignmentKind kind = AssignmentKind.University;
		protected String name;
		protected String professor;
		protected String classname;
		protected String deadline;
		protected String[] deadlineset;
		
		
		public Assignment() {
		}
		
		public Assignment(String name,
				String deadline) {
			this.name= name;
			this.deadline= deadline;
		}

		public Assignment(String name,
				String professor,
				String classname,
				String deadline) {
			this.name= name;
			this.professor= professor;
			this.classname= classname;
			this.deadline= deadline;
			

		}
		
		
		//getters and setters
		public AssignmentKind getKind() {
			return kind;
		}

		public void setKind(AssignmentKind kind) {
			this.kind = kind;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getProfessor() {
			return professor;
		}

		public void setProfessor(String professor) {
			this.professor = professor;
		}

		public String getClassname() {
			return classname;
		}

		public void setClassname(String classname) {
			this.classname = classname;
		}

		public String getDeadline() {
			return deadline;
		}

		public void setDeadline(String deadline) {
			this.deadline = deadline;
		}

		public String[] getDeadlineset() {
			return deadlineset;
		}

		public void setDeadlineset(String[] deadlineset) {
			this.deadlineset = deadlineset;
		}

		
		public void printInfo(){
			System.out.println("name="+name);
			System.out.println("professor="+professor);
			System.out.println("classname="+classname);
			System.out.println("deadline="+deadline);
		}
		
		public void getUserInput(Scanner input) {
			System.out.println("===assignment will be added===");
			System.out.print("assignment name: ");
			String name = input.next();
			this.setName(name);
			
			System.out.print("class professor: ");
			String professor = input.next();
			this.setProfessor(professor);
			
			System.out.print("class name: ");
			String classname = input.next();
			this.setClassname(classname);
			
			System.out.print("assignment deadline(yyyy/mm/dd/hh/mm): ");
			String deadline = input.next();
			this.setDeadline(deadline);
		}
		
		//deadline으로부터 몇시간 남았는지 알리는 method
		public void printremainingtime() {
			deadlineset = this.deadline.split("/");
			
			Calendar Nowcal = Calendar.getInstance();
			Calendar Deadcal = new GregorianCalendar(
					Integer.parseInt(deadlineset[0]),
					Integer.parseInt(deadlineset[1])-1,
					Integer.parseInt(deadlineset[2]),
					Integer.parseInt(deadlineset[3]),
					Integer.parseInt(deadlineset[4]));
			//달 = 현재 달-1
			
			long diffSec = (Deadcal.getTimeInMillis()-Nowcal.getTimeInMillis())/1000;
			//System.out.println(diffSec);
			
			long d = diffSec / (24*60*60);
			diffSec = diffSec % (24*60*60);
			long h = diffSec / (60*60);
			diffSec = diffSec % (60*60);
			long m =diffSec / (60);
			diffSec = diffSec % (60);
			
			System.out.println("deadline까지 "+d+"일 "+h+"시간 "+m+"분 "+diffSec+"초 남았습니다.");
			if(d==0) System.out.println("Hurry up!!");
		
		}
}
