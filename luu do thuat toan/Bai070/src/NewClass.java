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
         
         System.out.print("Enter n = ");
         
         int n = input.nextInt();
         
         System.out.print("x = ");
         
         int x = input.nextInt();
         
         int s = 0;
         
         int T = 1;
         
         int  i = 2;
         
         while(i <= 2 * n)
         {
             T = T * x * x;
             
             s = s + T;
             
             i = i + 2;
         }
         
         System.out.println("s ="+ s);
    }
}