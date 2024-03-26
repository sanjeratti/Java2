package oop;

public class Programmer {

    // Instance variables
    public String name;

    public int experience;
    public String jobtitle;
    public String education;
    public String Hobby;
    public int age;
    public String Nationality;

    public String coding(){
        return "coding Java";
    }public String relax(){
        return "swimming";
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", jobtitle='" + jobtitle + '\'' +
                ", education='" + education + '\'' +
                ", Hobby='" + Hobby + '\'' +
                ", age=" + age +
                ", Nationality='" + Nationality + '\'' +
                '}';
    }
}
