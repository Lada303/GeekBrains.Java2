package Lada303.lesson1;

public class DayOfWeekMain {

    private static final int LENGTH_WORKING_WEEK = 40;

    public static void main(String[] args) {
        //1 Вариант
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
        System.out.println(getWorkingHours(DayOfWeek.TUESDAY));
        System.out.println(getWorkingHours(DayOfWeek.WEDNESDAY));
        System.out.println(getWorkingHours(DayOfWeek.THURSDAY));
        System.out.println(getWorkingHours(DayOfWeek.FRIDAY));
        System.out.println(getWorkingHours(DayOfWeek.SATURDAY));
        System.out.println(getWorkingHours(DayOfWeek.SUNDAY));
        System.out.println();
        //2 вариант
        System.out.println(DayOfWeek.MONDAY.getWorkingHours());
        System.out.println(DayOfWeek.TUESDAY.getWorkingHours());
        System.out.println(DayOfWeek.WEDNESDAY.getWorkingHours());
        System.out.println(DayOfWeek.THURSDAY.getWorkingHours());
        System.out.println(DayOfWeek.FRIDAY.getWorkingHours());
        System.out.println(DayOfWeek.SATURDAY.getWorkingHours());
        System.out.println(DayOfWeek.SUNDAY.getWorkingHours());
        System.out.println();

    }

    public static String getWorkingHours(DayOfWeek day) {
        return (LENGTH_WORKING_WEEK - (day.getNumber() - 1) * 8 > 0 ?
                day.getRussianTitle() + " : " +(LENGTH_WORKING_WEEK - (day.getNumber() - 1) * 8) :
                day.getRussianTitle() + " : " + "Сегодня выходной");
    }
}
