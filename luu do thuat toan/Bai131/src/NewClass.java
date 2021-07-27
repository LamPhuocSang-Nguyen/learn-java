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
        
        System.out.print("xA = ");
        
        double xA = input.nextDouble();
        
        System.out.print("yA = ");
        
        double yA = input.nextDouble();
        
        System.out.print("xB = ");
        
        double xB = input.nextDouble();
        
        System.out.print("yB = ");
        
        double yB = input.nextDouble();
        
        System.out.print("xC = ");
        
        double xC = input.nextDouble();
        
        System.out.print("yC = ");
        
        double yC = input.nextDouble();
        
        double AB = Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));
        double AC = Math.sqrt((xC - xA) * (xC - xA) + (yC - yA) * (yC - yA));
        double BC = Math.sqrt((xC - xB) * (xC - xB) + (yC - yB) * (yC - yB));
        
        if((BC + AC) > AB && (AC + AB) > BC && (AB + BC > AC))
        {
            System.out.println("Tam giac");
        }
        else
        {
            System.out.println("Khong phai tam giac");
        }
        
    }
}