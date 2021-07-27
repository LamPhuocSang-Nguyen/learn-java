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
        
        System.out.print("Enter a = ");
        
        double a = input.nextDouble();
        
        System.out.print("Enter b = ");
        
        double b = input.nextDouble();
        
        System.out.print("Enter c = ");
        
        double c = input.nextDouble();
        
        if(a > b)
        {
            if(a > c)
            {
                double temp = a;
                
                a = c;
                
                c = temp;
            }
        }
        
        if(b > a)
        {
            if(b > c)
            {
                double temp = b;
                
                b = c;
                
                c = temp;
            }
        }
        
        if(b > c)
        {
            if(b > a)
            {
                double temp = b;
                
                b = c;
                
                c = temp;
            }
        }
        
       
        
        System.out.println("a = " + a + " b = " + b + " c = " + c);
    }
}