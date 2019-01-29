/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 * Name - Aladdin Xiong
 * Email Address - xionga13@csp.edu
 * Date - 1/26/19
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int guessNum = r.nextInt(20);
        int attempt = 0;
        
        Scanner input = new Scanner(System.in);
        int num;
        boolean correct = false;
        
        System.out.print("I'm thinking of a number between 0-20. What is the number? ");
        
        while(correct == false){
            
            num = input.nextInt();
            attempt++;
            
            if(num == guessNum){
                correct = true;
            }
            
            else if(num < guessNum){
                System.out.print("Nope. The number is " + guessNum);
                correct = true;
            }
            
            else if(num > guessNum){
                System.out.print("Nope. The number is " + guessNum);
                correct = true;
            }
        }
        
        System.out.println();
        
    }
    
}
