package if_else;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sandy kirgiz");
        int point = scan.nextInt();
        if (point >= 90 && point <= 100) {
            System.out.println("Оценка 5");
        } else if (point >= 70 && point <=89) {
            System.out.println("оценка 4");
        } else if(point >= 40 && point <= 69) {
            System.out.println("оценка 3");}
        else if(point >= 0 && point <=39) {
            System.out.println("оценка 2");
            }
        else {
            System.out.println("Minday San jok.");
        }

        }
    }
