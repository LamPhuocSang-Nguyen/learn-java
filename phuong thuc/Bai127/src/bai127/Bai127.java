/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai127;

/**
 *
 * @author LPSang
 */

import java.util.Scanner;

public class Bai127 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a =");
        
        double a = input.nextInt();
        
        System.out.print("Enter b = ");
        
        double b = input.nextInt();
        
        double kq = min(a,b);
        
        System.out.println("min = " + kq);
    }
    
    public static double min(double a, double b)
    {
        double lc = a;
        
        if(lc > b)
        {
            lc = b;
        }
        
        return lc;
    }
    
}
