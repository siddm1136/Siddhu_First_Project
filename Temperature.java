/**
 * Created by PC5 Progen 19341 on 2/19/2017.
 */

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){

        // Reads temperature from user
        System.out.println("Type a temperature in fareinheit: ");
        Scanner siddhu = new Scanner(System.in);

        // Converts celsius to fareinheit
        double celsius = siddhu.nextDouble();
        double fareinheit = ((9.0 / 5.0) * celsius) + 32.0;

        // Prints temperature in fareinheit
        System.out.println("Temperature in fareinheit: " + fareinheit);

    }
}
