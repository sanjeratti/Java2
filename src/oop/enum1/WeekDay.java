package oop.enum1;

public class WeekDay {

    private String today;
    public WeekDay(String today){
        this.today = today;

    }public static WeekDay SUNDAY = new WeekDay("SUNDAY");

    @Override
    public String toString() {
        return "WeekDay{" +
                "today='" + today + '\'' +
                '}';
    }
}
