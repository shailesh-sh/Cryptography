/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography;

import java.util.Scanner;

/**
 *
 * @author sk
 */
public class Addition {
    public static void Addition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text for Encryption");
        String plaintext= sc.next();
        System.out.println("Enter the Key for encryption");
        int key = sc.nextInt();
        String ciphertext="";
        for(int i=0;i<plaintext.length();i++){
            if(plaintext.charAt(i)>='A'&&plaintext.charAt(i)<='Z')
                ciphertext+=(char)(((plaintext.charAt(i)+key-'A')%26)+'A');
            else
                ciphertext+=(char)(((plaintext.charAt(i)+key-'a')%26)+'a');
        }
        System.out.println(ciphertext);
    }
    
    public static void DecAddition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text for decryption");
        String ciphertext= sc.next();
        System.out.println("Enter the Key for decryption");
        int key = sc.nextInt();
        String plaintext="";
        for(int i=0;i<ciphertext.length();i++){
            if(ciphertext.charAt(i)>='A'&&ciphertext.charAt(i)<='Z')
                plaintext+=(char)(((ciphertext.charAt(i)-key-'Z')%26)+'Z');
            else
                plaintext+=(char)(((ciphertext.charAt(i)-key-'z')%26)+'z');
        }
        System.out.println(plaintext);        
    }
}
