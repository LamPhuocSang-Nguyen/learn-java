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

public class Bai061 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        
        int n = input.nextInt();
        
        double[] a = new double[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        int kq = DemGiaTri(a);
        
        if(kq > 0)
        {
            System.out.println("So luong cac phan tu dung sau cung dau va tri "
                    + "tuyet doi lon hon la :" + kq);
        }
        else
        {
            System.out.println("Khong thoa yeu cau");
        }
    }
    public static void InputElement(double[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            a[i] = (Math.random() * (100 + 100) - 100);
        }
    }
    public static void OutputElement(double[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static int DemGiaTri(double[] a)
    {
        int Dem = 0;
        
        if(a.length < 1)
        {
            return 0;
        }
        
        for(int i = 1; i < a.length; i++)
        {
            if((a[i] * a[i - 1]) > 0 && (Math.abs(a[i]) > Math.abs(a[i - 1])))
            {
                Dem++;
            }
        }

        return Dem;
    }
}
