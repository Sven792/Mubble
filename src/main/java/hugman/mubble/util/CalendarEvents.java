package hugman.mubble.util;

import java.time.LocalDate;

public class CalendarEvents
{
	protected static LocalDate date = LocalDate.now();
	protected static int dayToday = date.getDayOfMonth();
	protected static int monthToday = date.getMonthValue();
    
	public static boolean isNewYear = checkDay(1, 1);
	public static boolean isAprilFools = checkDay(1, 4);
	public static boolean isMubbleBirthday = checkDay(14, 7);
	public static boolean isHugoBirthday = checkDay(3, 10);
	public static boolean isChristmas = checkBeetweenDays(23, 12, 25, 12);
	public static boolean isChristmasSeason = checkBeetweenDays(1, 12, 26, 12);
	public static boolean isDecember = getMonthToday() == 12;
	
	public static int getDayToday()
	{
		return dayToday;
	}
	
	public static int getMonthToday()
	{
		return monthToday;
	}
	
    private static boolean checkDay(int day, int month)
    {
        return day == dayToday && month == monthToday;
    }
    
    private static boolean checkBeetweenDays(int day1, int month1, int day2, int month2)
    {
        return day1 <= dayToday && day2 >= dayToday && month1 <= monthToday && month2 >= monthToday;
    }
}