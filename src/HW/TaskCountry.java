package HW;

import java.util.ArrayList;

public class TaskCountry {

    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Germany");
        countries.add("Kyrgyzstan");
        countries.add("Russia");
        countries.add("Kazakhstan");
        countries.add("Uzbekistan");
        countries.add("Pakistan");
        countries.add("Ukraina");

        System.out.println("spisok stran:");


        ArrayList<String> countriesEndingWithStan = new ArrayList<>();

        for (String country : countries) {
            if (country.endsWith("stan")) {
                countriesEndingWithStan.add(country);
            }
        }


        System.out.println("Countries ending with 'stan': " + countriesEndingWithStan);

        System.out.println(countriesEndingWithStan);

        ArrayList<String> countries2 = new ArrayList<>(countriesEndingWithStan);


        System.out.println("spisok stran 2:");
        System.out.println(countries2);

    }


}