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
        
        System.out.print("Enter x = ");
        
        double x = input.nextDouble();
        
        
        double s = 0;
        
        double t = 1;
        
        int i = 1;
        
        while(i <= n)
        {
            t = t * x;
            
            s = Math.sqrt(t + s);
            
            i = i + 1;
        }
        
        System.out.println("s = " + s);
    }
}