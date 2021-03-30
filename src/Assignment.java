import java.util.Calendar;
import java.util.GregorianCalendar;

public class Assignment {

		String name;
		String professor;
		String classname;
		String deadline;
		String[] deadlineset;
		
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
		
		public void printInfo(){
			System.out.println("name="+name);
			System.out.println("professor="+professor);
			System.out.println("classname="+classname);
			System.out.println("deadline="+deadline);
		}
		
		
		//deadline으로부터 몇시간 남았는지 알림
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
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(diffSec);
			
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
