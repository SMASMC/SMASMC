import java.util.Calendar;


public class Calendar_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		
		String []yoil= {"일","월","화","수","목","금","토"};
		
		
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;
		int day=calendar.get(Calendar.DAY_OF_MONTH);
		int hour=calendar.get(Calendar.HOUR_OF_DAY);
		int minute=calendar.get(Calendar.MINUTE);
		int second=calendar.get(Calendar.SECOND);
		
		System.out.println(year+"."+month+"."+day);
		System.out.println(hour+":"+minute+":"+second);
		System.out.println(yoil[calendar.get(Calendar.DAY_OF_WEEK)-1]);
		
	}

}
