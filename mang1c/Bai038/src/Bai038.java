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

public class Bai038 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        
        int n = input.nextInt();
        
        int[] a = new int[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        double kq = TongGiaTri(a);
        
        System.out.println("Tong gia tri co chu so dau la le " + kq);
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
    
    public static boolean ChuSoDau(int a)
    {
        int t = Math.abs(a);
        
        while(t >= 10)
        {
            t = t / 10;
        }
        if(t % 2 == 1)
        {
            return true;
        }
        return false;
    }
    
    public static double TongGiaTri(int[] a)
    {
        int s = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            if(ChuSoDau(a[i]))
            {
                s = s + a[i];
            }
        }
        
        return s;
    }
}
