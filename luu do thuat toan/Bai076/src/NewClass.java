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
        
        int x = input.nextInt();
        
        double s = 1 + x;
        
        int m = 1;
        
        int t = x;
        
        int i = 3;
        
        while(i <= (2 * n + 1))
        {
            m = m * i * (i - 1);
            
            t = t * x * x;
            
            s = s + (double)t / m;
            
            i = i + 2;
        }
        System.out.println("s = " + s);
    }
}