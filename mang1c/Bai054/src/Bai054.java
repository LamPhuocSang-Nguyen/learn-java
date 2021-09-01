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

public class Bai054 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        
        int n = input.nextInt();
        
        int[] a = new int[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        int kq = DemDoiXung(a);
        if(kq != 0)
        {
            System.out.println("So luong do doi xung trong mang la: " + kq);
        }
        else
        {
            System.out.println("Mang khong co so doi xung");
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
    public static boolean KtDoiXung(int a)
    {
        int Dn = 0;
        int dv;
        int t = Math.abs(a);
        while(t != 0)
        {
            dv = t % 10;
            Dn = Dn * 10 + dv;
            t = t / 10;
        }
        if(Dn == a)
            return true;
        
        return false;
    }
    public static int DemDoiXung(int[] a)
    {
        int Dem = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            if(KtDoiXung(a[i]))
            {
                Dem++;
            }
        }
        return Dem;
    }
}
