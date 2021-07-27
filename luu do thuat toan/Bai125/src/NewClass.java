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
         
         System.out.print("Enter x = ");
         
         int a = input.nextInt();
         
         System.out.print("Enter n = ");
         
         int b = input.nextInt();
         
         if(a < 0)
         {
             a = -a;
         }
         
         if(b < 0)
         {
             b = -b;
         }
         
         System.out.println("a = " + a + "b = " + b);     
    }
}
