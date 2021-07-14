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
        Double x1 = input.nextDouble();
        
        System.out.print("Enter y1: ");
        Double y1 = input.nextDouble();
        
        System.out.print("Enter x2: ");
        Double x2 = input.nextDouble();
        
        System.out.print("Enter y2: ");
        Double y2 = input.nextDouble();
        
        Double distance = Math.sqrt((x2 - x1) * (x2- x1) + (y2 - y1) * (y2 - y1));
        
        System.out.println("Distance is: " + distance);
    }
    
}
