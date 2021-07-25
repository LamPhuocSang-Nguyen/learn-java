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
         
         int s = 0;
         
         int i = 2;
         
         while(i <= n)
         {
             if(n % i == 0)
             {
                 s = s + i;
             }
             i = i + 2;
         }
         
         System.out.println("s = " + s);
    }
}