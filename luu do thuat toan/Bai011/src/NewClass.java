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
        
        System.out.print("Enter x1: ");
        
        double x1 = input.nextDouble();
        
        
        System.out.print("Enter y1: ");
        
        double y1 = input.nextDouble();
        
        
        System.out.print("Enter x2: ");
        
        double x2 = input.nextDouble();
        
        
        System.out.print("Enter y2: ");
        
        double y2 = input.nextDouble();
        
        
        System.out.print("Enter x3: ");
        
        double x3 = input.nextDouble();
        
        
        System.out.print("Enter y3: ");
        
        double y3 = input.nextDouble();
        
        double ab = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        
        double ac = Math.sqrt((x3 - x1 )* (x3 - x1) + (y3 - y1) * (y3 - y1));
        
        double bc = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        
        double p = ab + ac + bc;
        
        double s = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        
        System.out.println("Area is " + s);
    }
    
}