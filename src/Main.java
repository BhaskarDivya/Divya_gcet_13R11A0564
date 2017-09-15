// import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		String s1 = "05/21/1888";
		Date date = new SimpleDateFormat("mm/dd/yyyy").parse(s1);
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit */
		
		Student st = new Student(15,"harathi",date ,50.75);
		System.out.println(st);
		
		String s2 = "08/13/1897";
		Date date1 = new SimpleDateFormat("mm/dd/yyyy").parse(s2);
		Student st1 = new Student(15,"harathi",date1 ,50.75);
		System.out.println(st1);
		
		String s3 = "02/28/2000";
		Date date2 = new SimpleDateFormat("mm/dd/yyyy").parse(s3);
		Student st2 = new Student(15,"harathi",date2 ,50.75);
		System.out.println(st2);
	}

}
