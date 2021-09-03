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

public class Bai066
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        
        int n = input.nextInt();
        
        int[] a = new int[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        int kq = DemPhanBiet(a);
        if(kq != 0)
        {
            System.out.println("So luong cac gia tri phan biet " + kq);
        }
        else
        {
            System.out.println("Mang khong co");
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
    public static boolean KtNguyenTo(int a)
    {
        int Dem = 0;
        
        for(int i = 1; i <= a; i++)
        {
            if(a % i == 0)
            {
                Dem++;
            }
        }
        if(Dem == 2)
        {
            return true;
        }
        
        return false;
    }
    public static int DemPhanBiet(int[] a)
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
            if(flag && KtNguyenTo(a[i]))
            {
                Dem++;
            }
        }
        
        return Dem;
    }
}