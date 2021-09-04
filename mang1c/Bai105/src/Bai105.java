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

public class Bai105
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        
        int n = input.nextInt();
        
        int[] a = new int[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        int kq = TimGiaTri(a);
        
        if(kq != 0)
        {
            System.out.println("So co cac chu so toan le lon nhat trong mang la: " + kq);
        }
        else
        {
            System.out.println("Mang khong thoa dk");
        }
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
    public static boolean KtToanLe(int a)
    {
       boolean flag = true;
       int t = a;
       
       while(t != 0)
       {
           int dv = t % 10;
           if(dv % 2 == 0)
           {
               flag = false;
           }
           t = t / 10;
       }
       if(flag == true)
       {
           return true;
       }
       return false;
    }
    public static int ToanLeDauTien(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(KtToanLe(a[i]))
            {
                return a[i];
            }
        }
        return 0;
    }
    public static int TimGiaTri(int[] a)
    {
        int lc = ToanLeDauTien(a);
        
        if(lc == 0)
        {
            return 0;
        }
        for(int i = 0; i < a.length; i++)
        {
            if(KtToanLe(a[i]) && a[i] > lc)
            {
                lc = a[i];
            }
        }
        return lc;
    }
}