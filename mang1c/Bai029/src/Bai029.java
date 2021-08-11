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

public class Bai029 
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
    
    public static int FirstEven(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 == 0)
            {
                return a[i];
            }
        }
        return 0;
    }
    
    public static int BiggestEven(int[] a)
    {
        int Biggest = FirstEven(a);
        
        if(Biggest == 0)
        {
            return 0;
        }
        
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 == 0)
            {
                if(Biggest < a[i])
                {
                   Biggest = a[i]; 
                }
            }
        }
        return Biggest;
    }
    
    public static void Enumerate(int[] a)
    {
        int BiggestEven = BiggestEven(a);
        
        if(BiggestEven == 0)
        {
            System.out.println("The array has not even number");
        }
        
        for(int i = 0; i < a.length; i++)
        {
            if(BiggestEven == a[i])
            {
                System.out.println(i + " ");
            }
        }
    }
}
