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

public class NewClass {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter n = ");
        
        int n = input.nextInt();
       
       int flag = 0;
       
       int i = 0;
       
       while(i <= n)
       {
           if(i * i == n)
           {
               flag = 1;
           }
           i = i + 1;
       }
       
       if(flag == 1)
       {
           System.out.println("So chinh phuong");
       }
       else
       {
           System.out.println("Khong phai so chinh phuong");
       }
    }
}