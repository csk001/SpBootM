package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class TestClander {
	
	public static void testCommDate() {
		SimpleDateFormat simdf = new SimpleDateFormat("MM月dd日");
		
		//分别获取当前年、月、日
		Calendar cal = Calendar.getInstance();
		System.out.print(cal.get(cal.YEAR)+" 年 ");
		System.out.print((cal.get(cal.MONTH)+1)+" 月 ");//老外把一月份整成了0，翻译成中国月份要加1
		System.out.println(cal.get(cal.DATE)+" 日");
		 
		cal.set(cal.DAY_OF_WEEK, cal.MONDAY);
		String weekhand = simdf.format(cal.getTime());
		System.out.println("当前所在周周一日期："+weekhand);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.setFirstDayOfWeek(Calendar.MONDAY);
//		cal2.setTime(cal2.getTime());
		 System.out.println("要计算日期为:" + simdf.format(cal.getTime()));
		 
		cal.set(Calendar.DATE, cal.get(cal.DATE) + 6);
		//cal.set(cal.DAY_OF_WEEK, cal.SUNDAY);这个不符合中国人的时间观，老外把上周周日定为一周的开始。
		String weeklast = simdf.format(cal.getTime());
		System.out.println("当前所在周周日日期："+weeklast);
	}
    
	/**
	 * 根据当前日期获得是星期几
	 * time=yyyy-MM-dd
	 * @return
	 */
	public static String getWeek(String time) {
	    String Week = "";
	    SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
	    Calendar c = Calendar.getInstance();
	    try {
	        c.setTime(format.parse(time));
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }

	    int wek=c.get(Calendar.DAY_OF_WEEK);

	    if (wek == 1) {
	        Week += "7";
	    }
	    if (wek == 2) {
	        Week += "1";
	    }
	    if (wek == 3) {
	        Week += "2";
	    }
	    if (wek == 4) {
	        Week += "3";
	    }
	    if (wek == 5) {
	        Week += "4";
	    }
	    if (wek == 6) {
	        Week += "5";
	    }
	    if (wek == 7) {
	        Week += "6";
	    }
	    return Week;
	}
	public static void main(String[] args) {
//		testCommDate();
	}
}
