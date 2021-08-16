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

public class Bai033 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        
        int n = input.nextInt();
        
        double[] a = new double[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        double kq = Sum(a);
        
        System.out.println("Sum of element array is " + kq);
    }
    
    public static void InputElement(double[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            a[i] = (Math.random() * (100 + 100) - 100);
        }
    }
    
    public static void OutputElement(double[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public static double Sum(double[] a)
    {
        double sum = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            sum = sum + a[i];
        }
        
        return sum;
    }
}
