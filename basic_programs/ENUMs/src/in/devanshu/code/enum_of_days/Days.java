package in.devanshu.code.enum_of_days;

public enum Days {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWeekDay;

    Days(Boolean isWeekDay){
        this.isWeekDay = isWeekDay;
    }

    public String getType(){
        return isWeekDay ? "Weekday" : "Weekend";
    }
}
