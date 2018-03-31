/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography;

import java.util.*;
/**
 *
 * @author sk
 */
public class Cryptography {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       while(true){
       System.out.println("Choose\n1. Encryption\n2. Decryption\n3. Exit");
       Scanner sc= new Scanner(System.in);
       int choice=sc.nextInt();
       switch(choice){
           case 1:    

                System.out.println("Choose the type of encryption\n1.Addition\n2.Multiplication\n3.Exit");
                choice=sc.nextInt();
                switch(choice){
                    case 1: Addition.Addition();
                    break;
                    case 2: Multiplication.Multiplication();
                    break;
                    case 3: 
                    case 0: System.exit(0);
                    break;
                    default: System.out.println("Invalid input. Try again!!");
                }
            break;
           case 2:    

                System.out.println("Choose the type of decryption\n1.Addition\n2.Multiplication\n3.Exit");
                choice=sc.nextInt();
                switch(choice){
                    case 1: Addition.DecAddition();
                    break;
                    case 2: Multiplication.DecMultiplication();
                    break;
                    case 3: 
                    case 0: System.exit(0);
                    break;
                    default: System.out.println("Invalid input. Try again!!");
                }
            break; 
           case 3: System.exit(0);
           break;
           default: System.out.println("Invalid input.Try Again!!");
            }
       }  
    } 
}
