

import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Inderjeet
 */
public class Avarege {
    public static void main(String[] args)
    {
        int val1, val2, val3; double average;
    Scanner scan = new Scanner(System.in) ;
// get three values from user
    System.out.println("Please enter three integers and " +
            "Average will be calculated");
    val1=scan.nextInt();
    val2=scan.nextInt();
    val3=scan.nextInt();
    average = (val1+val2+val3)/3;
    System.out.println("Average is =" + average);
    System.out.println("how many integer");

    }


}
