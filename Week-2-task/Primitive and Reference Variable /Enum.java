class Enum {

    enum DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    static void checkHoliday(DaysOfWeek day) {
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                System.out.println(day + " is a holiday");
                break;
            default:
                System.out.println(day + " is not a holiday");
        }
    }

    public static void main(String[] args) {
        for (DaysOfWeek day : DaysOfWeek.values()) {
            checkHoliday(day);
        }
    }
}
