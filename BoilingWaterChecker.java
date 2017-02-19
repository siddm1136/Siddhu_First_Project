/**
 * Created by PC5 Progen 19341 on 2/19/2017.
 */

import java.util.Scanner;

public class BoilingWaterChecker {

    public static void main(String[] args) {

        //Reads given temperature by user
        System.out.println("Type in a temperature:");
        Scanner siddhu = new Scanner(System.in);
        int temp = siddhu.nextInt();

        //Determines whether the water is boiling
        if (temp >= 100) {
            System.out.println("Water is boiling!");
        } else {
            System.out.println("The water is not boiling!");
        }


    }


}
