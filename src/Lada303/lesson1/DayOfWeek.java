package Lada303.lesson1;

public enum DayOfWeek {
    MONDAY(1, "Понедельник"),
    TUESDAY(2, "Вторинк"),
    WEDNESDAY(3, "Среда"),
    THURSDAY(4, "Четверг"),
    FRIDAY(5, "Пятница"),
    SATURDAY(6, "Субота"),
    SUNDAY(7, "Воскресенье");
    private final int number;
    private final String russianTitle;


    DayOfWeek(int number, String russianTitle) {
        this.number = number;
        this.russianTitle = russianTitle;
    }

    public int getNumber() {
        return number;
    }

    public String getRussianTitle() {
        return russianTitle;
    }

    public String getWorkingHours(){
        int lengthWorkingWeek = 40;
        int workingHours = lengthWorkingWeek - (this.number - 1) * 8 ;
        if (workingHours > 0) {
            return this.russianTitle + ": осталось " + workingHours + " рабочих часов до конца недели";
        }
        return this.russianTitle + ": сегодня выходной!";
    }

}
