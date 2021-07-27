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

public class Bai125 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a = ");
        int a = input.nextInt();
        
        System.out.print("Enter b = ");
        int b = input.nextInt();
        
        int kq = LonNhat(a,b);
        
        System.out.println("Largest = "+ kq);
    }
    
    public static int LonNhat(int a, int b)
    {
        if(a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
}
