/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sem2;

import java.util.Scanner;

/**
 *
 * @author Rutul
 */
public class E2 {
    public static void main(String[]args){
        
        System.out.print("Enter your number");
        System.out.printf("If we enter 31, is enough snow for skilling %b%n",timeToSki(31));
         System.out.printf("If we enter 31, is enough snow for skilling %b%n",timeToSki(4));
         starDisplay(5);
         
//         Card myFristCard = new Card("Ace", "Spades", 14);
//         System.out.printf(" my card is %s%n", myFristCard);
//        
        
    }
    
    
    public static boolean timeToSki(int snowDepth){
        if(snowDepth>30)
           return true;
        else
            return false;
    }
    
    public static void starDisplay(int lines){
       for(int i =0; i<lines; i++){
            for(int j =1; j<=1; j++){
                System.out.print("*");
            }
        }
    }
    
}
