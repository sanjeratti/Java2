package oop.enum1;

import javax.sound.midi.Soundbank;

public class EnumMain {
    public static void main(String[] args) {
        final long ID = 216256716527L;
        System.out.println(ID);

    //enum
        Day current = Day.SATURDAY;
        System.out.println(current);

    // Standard
        WeekDay todaysDate = new WeekDay("Saturday");
        System.out.println(todaysDate);

        WeekDay saturday = WeekDay.SUNDAY;
        System.out.println(saturday);

        Day day = Day.SATURDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Today is monday");
                break;
            case TUESDAY:
                System.out.println("Today is monday");
                break;
            case WEDNESDAY:
                System.out.println("Today is WEDNESDAY");
                break;
            case THURSDAY:
                System.out.println("Today is THURSDAY");
                break;
            case FRIDAY:
                System.out.println("Today is FRIDAY");
                break;
            case SATURDAY:
                System.out.println("Today is SATURDAY");
                break;
            case SUNDAY:
                System.out.println("Today is SUNDAY");
                break;
        }
        System.out.println(day);

        for (Day d: Day.values()){
            System.out.println(d);
        }
    }
}
