package oop.enum1.season;

public class SeasonMain {
    public static void main(String[] args) {


        // season
        Season season = Season.WINTER;
        System.out.println(season);

        //year
        Year year = new Year("2024 God Drakona", 2024, Season.OUTUMN);
        System.out.println(year);

        Year year1 = new Year("2024 God Drakona", 2024, Season.SPRING);
        System.out.println(year1.getSeason());

        Year year2 = new Year("2024 God Drakona", 2024, Season.WINTER);
        System.out.println(year2.getSeason());

        Year year3 = new Year("2024 God Drakona", 2024, Season.OUTUMN);
        System.out.println(year3.getSeason());

        Year year4 = new Year("2024 God Drakona", 2024, Season.SUMMER);
        System.out.println(year4.getSeason());

        for (Season years: Season.values()){
            System.out.println(years);
        }
    }

}
