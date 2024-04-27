package oop.enum1.season;

public class Year {
    public String name;

    public int year;

    private Season season;

    public Year(String name, int year, Season season) {
        this.name = name;
        this.year = year;
        this.season = season;
    }

    @Override
    public String toString() {
        return "Year{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", season=" + season +
                '}';
    }

    String getSeason(){
        switch(season){
            case WINTER: return "Dec, Jan, Feb";
            case SPRING: return "Mar, Apr, May";
            case SUMMER: return "Iyn, Jul, Aug";
            case OUTUMN: return "Sen, Oct, Nov";
            default: return "Year";
        }


    }

}
