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

public class Bai023 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        
        int n = input.nextInt();
        
        int[] a = new int[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        Enumerate(a);
    }
    
    public static void InputElement(int[] a)
    {
        for(int  i = 0; i < a.length; i++)
        {
            a[i] = (int)(Math.random() * (100 + 100) - 100);
        }
    }
    
    public static void OutputElement(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public static void Enumerate(int[] a)
    {
        if(a[0] % 2 == 0 && a[1] % 2 == 0)
        {
            System.out.print(a[0] + " ");
        }
        
        for(int i = 1; i < a.length - 1; i++)
        {
            if(a[i] % 2 == 0)
            {
                if(a[i + 1] % 2 == 0 || a[i - 1] % 2 == 0)
                {
                    System.out.print(a[i] + " ");
                }
            }
        }
        
        if(a[a.length - 1] % 2 == 0 && a[a.length - 2] % 2 == 0)
        {
            System.out.print(a[a.length - 1] + " ");
        }
    }
}

