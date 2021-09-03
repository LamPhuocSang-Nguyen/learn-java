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

public class Bai067
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        
        int n = input.nextInt();
        
        int[] a = new int[n];
        
        int[] b = new int[n];
        
        InputElement(a,b);
        
        OutputElement(a,b);
        
        int kq = DemGiaTri(a,b);
        if(kq != 0)
        {
            System.out.println("So luong cac gia tri chi xuat hien mot trong "
                    + "hai mang la: " + kq);
        }
        else
        {
            System.out.println("2 Mang khong co");
        }
    }
    public static void InputElement(int[] a, int[] b)
    {
        for(int i = 0; i < a.length; i++)
        {
            a[i] = (int)(Math.random() * (100 + 100) - 100);
        }
        for(int i = 0; i < b.length; i++)
        {
            b[i] = (int)(Math.random() * (100 + 100) - 100);
        }
        
    }
    public static void OutputElement(int[] a, int[] b)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        for(int i = 0; i < b.length; i++)
        {
            System.out.print(b[i] + " ");
        }
        System.out.println();    
    }
    public static int TanSuat(int[] a, int b)
    {
        int Dem = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            if(b == a[i])
                Dem++;
        }
        return Dem;
    }
    public static int DemGiaTri(int[] a, int[] b)
    {
        int Dem = 0;
        
        for(int i = 0; i <  a.length; i++)
        {
            boolean flag = true;
            for(int j = 0; j < i; j++)
            {
                if(a[j] == a[i])
                {
                    flag = false;
                }
            }
            if(flag && (TanSuat(b,a[i]) == 0))
            {
                Dem++;
            }
        }
        
        for(int i = 0; i < b.length; i++)
        {
            boolean flag = true;
            for(int j = 0; j < i; j++)
            {
                if(b[i] == b[j])
                {
                    flag = false;
                }
            }
            if(flag && (TanSuat(a,b[i]) == 0))
                Dem++;
        }
        
        return Dem;
    }
}