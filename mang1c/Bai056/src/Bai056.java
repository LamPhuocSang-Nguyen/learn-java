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

public class Bai056 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        
        int n = input.nextInt();
        
        int[] a = new int[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        int kq = DemHoanThien(a);
        if(kq != 0)
        {
            System.out.println("So luong so hoan thien trong mang: " + kq);
        }
        else
        {
            System.out.println("Mang khong co so hoan thien");
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
    public static boolean KtHoanThien(int a)
    {
        int s = 0;
        int i = 1;
        while(i < a)
        {
            if(a % i == 0)
            {
                s = s + i;
            }
            i++;
        }
        if(s == a)
        {
            return true;
        }
        return false;
    }
    public static int DemHoanThien(int[] a)
    {
        int Dem = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            if(KtHoanThien(a[i]))
            {
                Dem++;
            }
        }
        return Dem;
    }
}