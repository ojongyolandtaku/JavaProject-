/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author dell
 */
import java.util.Scanner;
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double currentpop;
        double annualpop;//annual population increase
        double estimatepop;//estimate population
        float growthrate;
     
        System.out.println("Enter the current world population: ");
        currentpop = input.nextDouble();
        
         System.out.println("Enter the population growthrate: ");
         growthrate = input.nextFloat();
        
         annualpop = (growthrate/100)*currentpop;
         
         System.out.printf("annualpop is %s%n", annualpop);
         
         estimatepop = currentpop + annualpop;
         System.out.printf("estimatepop is %s%n", estimatepop);
         
         
        
         System.out.println("The estimate World population after one year: " + estimatepop);
         System.out.println("The estimate World population after two year: " + (estimatepop + annualpop));
         System.out.println("The estimate World population after three year: " + (estimatepop + annualpop*2));
         System.out.println("The estimate World population after four year: " + (estimatepop + annualpop*3));
         System.out.println("The estimate World population after five year: " + (estimatepop + annualpop*4));
    }
    
}
