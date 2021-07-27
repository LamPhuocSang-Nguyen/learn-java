/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LPSang
 */

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter year = ");
        
        int year = input.nextInt();
        
        if((year % 4 == 0 && year % 100 != 0) || year % 4 == 0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not leap year");
        }
    }
}
