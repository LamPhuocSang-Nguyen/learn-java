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
         
         int flag = 0;
         
         int t = n;
         
         while(t != 0)
         {
             int dv = t % 10;
             
             if(dv % 2 == 0)
             {
                 flag = 1;
             }
             
             t = t / 10;
         }
         
         if(flag == 1)
         {
             System.out.println("yes");
         }
         else
         {
             System.out.print("No");
         }
             
    }
}