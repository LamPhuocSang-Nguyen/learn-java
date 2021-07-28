/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai130;

/**
 *
 * @author LPSang
 */

import java.util.Scanner;

public class Bai130 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("x = ");
        
        double x = input.nextDouble();
        
        System.out.print("y = ");
        
        double y = input.nextDouble();
        
        System.out.print("z = ");
        
        double z = input.nextDouble();
        
        boolean kq = Check(x,y,z);
        
        if(kq)
        {
            System.out.println("It is triangle");
        }
        else
        {
            System.out.println("It is not triangle");
        }
    }
    
    public static boolean Check(double x, double y, double z)
    {
        if(x + y > z && x + z > y && y + z > x)
        {
            return true;
        }
        
        return false;
    }
    
}
