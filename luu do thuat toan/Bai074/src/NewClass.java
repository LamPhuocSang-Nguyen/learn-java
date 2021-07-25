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
        
        double s = 0;
        
        int m = 1;
        
        int t = 1;
        
        int i = 1;
        
        while(i <= n)
        {
            m = m * i;
            
            t = t * x;
            
            s = s + (double)t / m;
            
            i = i + 1;
        }
        System.out.println("s = " + s);
    }
}