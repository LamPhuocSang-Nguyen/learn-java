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
         
         int t = 1;
         
         int T = n;
         
         while(T != 0)
         {
             int dv = T % 10;
             t = t * dv;
             T = T / 10;
         }
         
         System.out.println("t = " + t);
    }
}