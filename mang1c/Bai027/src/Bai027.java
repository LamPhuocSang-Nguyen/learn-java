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

public class Bai027 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        
        int n = input.nextInt();
        
        double[] a = new double[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        Enumerate(a);
    }
    
    public static void InputElement(double[] a)
    {
        for(int  i = 0; i < a.length; i++)
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
    
    public static double FirstNegative(double[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] < 0)
            {
                return a[i];
            }
        }
        return 0;
    }
    
    public static void Enumerate(double[] a)
    {
        double Neg = FirstNegative(a);
        
        if(Neg == 0)
        {
            System.out.println("The array has not negative");
            return;
        }
        
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == Neg)
            {
                System.out.println(i + " ");
            }
        }
    }
}

