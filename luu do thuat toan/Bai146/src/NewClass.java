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
       
       int dn = 0;
       
       int t = Math.abs(n);
       
       while(t != 0)
       {
           int dv = t % 10;
           dn = dn * 10 + dv;
           t = t / 10;
       }
       
       if(dn == n)
       {
           System.out.println("So doi xung");
       }
       else
       {
           System.out.println("Khong phai so doi xung");
       }
    }
}
