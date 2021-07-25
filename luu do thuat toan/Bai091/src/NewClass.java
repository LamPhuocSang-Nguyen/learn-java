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
        
        System.out.print("Enter x = ");
        
        double x = input.nextDouble();
        
        System.out.print("Enter n = ");
        
        int n = input.nextInt();
        
        double s = -1;
        
        double t = 1;
        
        double m = 1;
        
        int i = 2;
        
        int dau = 1;
        
        while(i <= (2 * n))
        {
            t = t * x * x;
            
            m = m * (i - 1) * i;
            
            s = s + dau * (t / m);
            
            i += 2;
            
            dau = -dau;
        }
        
        System.out.println("s = " + s);
    }
}