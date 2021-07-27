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
        
        if(a > b)
        {
            double temp = a;
            
            a = b;
            
            b = temp;
        }
        
        System.out.println("a = " + a + " b = " + b);
    }
}
