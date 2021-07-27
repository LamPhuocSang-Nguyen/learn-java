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
        
        System.out.print("xM = ");
        
        double xM = input.nextDouble();
        
        System.out.print("yM = ");
        
        double yM = input.nextDouble();
        
        double Sabc = (1.0 / 2) * Math.abs((xA * yB) + (xB * yC) + (xC * yA) - (xB * yA) - (xC * yB) - (xA * yC));
        double Smab = (1.0 / 2) * Math.abs((xM * yA) + (xA * yB) + (xB * yM) - (xA * yM) - (xB * yA) - (xB * yM));
        double Smbc = (1.0 / 2) * Math.abs((xM * yB) + (xB * yC) + (xC * yM) - (xB * yM) - (xC * yB) - (xC * yM));
        double Smca = (1.0 / 2) * Math.abs((xM * yC) + (xC * yA) + (xA * yM) - (xC * yM) - (xA * yC) - (xA * yM));
        
        if(Sabc == Smab + Smbc + Smca)
        {
            System.out.println("M nam trong");
        }
        else
        {
            System.out.println("M nam ngoai");
        }
               
        
    }
}
