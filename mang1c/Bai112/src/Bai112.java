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

public class Bai112
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of element: ");
        
        int n = input.nextInt();
        
        int[] a = new int[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        LietKe(a);
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
    public static int TanSuat(int[] a, int b)
    {
        int Dem = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            if(b == a[i])
            {
                Dem++;
            }
        }
        return Dem;
    }
    public static int TimGiaTri(int[] a)
    {
        int lc = a[0];
        
        for(int i = 0; i < a.length; i++)
        {
            if(TanSuat(a,lc) < TanSuat(a,a[i]))
            {
                lc = a[i];
            }
        }
        return lc;
    }
    public static void LietKe(int[] a)
    {
        int lc = TimGiaTri(a);
        int ts = TanSuat(a,lc);
        
        for(int i = 0; i < a.length; i++)
        {
            boolean flag = true;
            for(int j = 0; j < i; j++)
            {
                if(a[j] == a[i])
                {
                    flag = false;
                }
            }
            if(flag && (TanSuat(a,a[i]) == ts))
            {
                System.out.print(a[i] + " ");
            }
        }
    }
}
