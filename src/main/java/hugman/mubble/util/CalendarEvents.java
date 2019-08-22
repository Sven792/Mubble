package hugman.mubble.util;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class CalendarEvents
{
	public static LocalDate localdate = LocalDate.now();
	public static int dayToday = localdate.get(ChronoField.DAY_OF_MONTH);
	public static int monthToday = localdate.get(ChronoField.MONTH_OF_YEAR);
    
	public static boolean isNewYear = checkDay(1, 1);
	public static boolean isTodayTemp = checkDay(12, 8);
	public static boolean isAprilFools = checkDay(1, 4);
	public static boolean isMiaBirthday = checkDay(12, 1);
	public static boolean isJulesBirthday = checkDay(9, 3);
	public static boolean isMarkBirthday = checkDay(1, 4);
	public static boolean isJoaquinBirthday = checkDay(18, 6);
	public static boolean isMubbleBirthday = checkDay(14, 7);
	public static boolean isAngelicaBirthday = checkDay(11, 8);
	public static boolean isHugmanBirthday = checkDay(3, 10);
	public static boolean isChristmas = checkBeetweenDays(23, 12, 25, 12);
	
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
        return day1 <= dayToday && day2 <= dayToday && month1 <= monthToday && month2 <= monthToday;
    }
}