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
public class Multiplication {
    public static void Multiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text for encryption");
        String plaintext= sc.next();
        System.out.println("Enter the Key for encryption");
        int key = sc.nextInt();
        String ciphertext="";
        for(int i=0;i<plaintext.length();i++){
            if(plaintext.charAt(i)>='A'&&plaintext.charAt(i)<='Z')
                ciphertext+=(char)((((plaintext.charAt(i)-'A')*key)%26)+'A');
            else
                ciphertext+=(char)((((plaintext.charAt(i)-'a')*key)%26)+'a');
        }
        System.out.println(ciphertext);
    }
    
    public static void DecMultiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text for decryption");
        String ciphertext= sc.next();
        System.out.println("Enter the Key for decryption");
        int key = sc.nextInt();
        String plaintext="";
        int invkey=key%26;
        
        for(int i=0;i<26;i++){
            if(((invkey*i)%26)==1){
                    invkey=i;
                    break;
            }
        }
        System.out.println("Inverse of "+key+" in mod 26 is "+invkey);
        for(int i=0;i<ciphertext.length();i++){
            if(ciphertext.charAt(i)>='A'&&ciphertext.charAt(i)<='Z')
                plaintext+=(char)((((ciphertext.charAt(i)-'A')*invkey)%26)+'A');
            else
                plaintext+=(char)((((ciphertext.charAt(i)-'a')*invkey)%26)+'a');
        }
        System.out.println(plaintext);        
    }
}
