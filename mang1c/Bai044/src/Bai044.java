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

public class Bai044 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        
        int n = input.nextInt();
        
        int[] a = new int[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        double kq = TongCucTri(a);
        
        System.out.println("Tong cuc tri: " + kq);
    }
    
    public static void InputElement(int[] a)
    {
        for(int i = 0; i < a.length; i++)
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
    
    public static double TongCucTieu(int[] a)
    {
        int s = 0;
        
        if(a[0] < a[1])
        {
            s = s + a[0];
        }
        
        for(int i = 1; i < a.length - 1; i++)
        {
            if(a[i] < a[i + 1] && a[i] < a[i - 1])
            {
                s = s + a[i];
            }
        }
        
        if(a[a.length - 1] < a[a.length - 2])
        {
            s = s + a[a.length - 1];
        }
        
        return s;
    }
    
    public static double TongCucDai(int[] a)
    {
        int s = 0;
        
        if(a[0] > a[1])
        {
            s = s + a[0];
        }
        
        for(int i = 1; i < a.length - 1; i++)
        {
            if(a[i] > a[i + 1] && a[i] > a[i - 1])
            {
                s = s + a[i];
            }
        }
        
        if(a[a.length - 1] > a[a.length - 2])
        {
            s = s + a[a.length - 1];
        }
        
        return s;
    }
    
    public static double TongCucTri(int[] a)
    {
        double s1 = TongCucDai(a);
        double s2 = TongCucTieu(a);
        
        return (s1 + s2);
    }
        
}
