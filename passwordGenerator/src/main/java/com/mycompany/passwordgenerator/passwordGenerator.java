package com.mycompany.passwordgenerator;

import java.io.UnsupportedEncodingException;
import static java.lang.Character.getNumericValue;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Scanner;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class passwordGenerator {
    
 
    public static void main(String[] args) throws Exception{
        String firstName, lastName, midName, favNum, city, color, email, 
                encryptionKeyStr;       
        
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUBWXYZ"
                + "abcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*+";
        String randPwd ="";
     
        for (int i=0;i<16;i++){
            //generate a random number
            randPwd = randPwd 
                    + AlphaNumericString.charAt((int)(Math.random()*AlphaNumericString.length()));
        }
        
        AES.setKey("ThisIsSecretKey");
        String encryptedPwd = AES.encrypt(randPwd, "ThisIsSecretKey");
        String decryptedPwd = AES.decrypt(encryptedPwd, "ThisIsSecretKey");
        System.out.println();
       
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        firstName = scan.nextLine().toLowerCase();
        
        System.out.println("Please enter your last name: ");
        lastName = scan.nextLine().toLowerCase();
        
        System.out.println("Please enter your middle name: ");
        midName= scan.nextLine().toLowerCase();
        
        System.out.println("Please enter your favorite 2-digit number: ");
        favNum = scan.nextLine();
        String numStr = "";
        while(numStr.length()!=2){
            numStr = "";
            for (char i : favNum.toCharArray()){
            try{
                numStr = numStr + Integer.parseInt(""+i);
            }
            catch (NumberFormatException e)
            {}
            }
            if(numStr.length()!=2){
            System.out.println("Please enter a two-digit integer: ");
            favNum = scan.nextLine();    
            }
        }
        
        
        
        
        System.out.println("Please enter your City of Birth: ");
        city = scan.nextLine().toLowerCase();
        
        
        System.out.println("Please enter your favorite color: ");
        color = scan.nextLine().toLowerCase();
        
        
        email = lastName + firstName.substring(0,1) + midName.substring(0,1) 
                + "@guilford.edu";
        
        firstName = firstName.substring(0,1).toUpperCase() 
                + firstName.substring(1);
        
        midName = midName.substring(0,1).toUpperCase() 
                + midName.substring(1);
        
        lastName = lastName.substring(0,1).toUpperCase() 
                + lastName.substring(1);
        
        System.out.println(
                "\nYour favorite 2-digitnumber is: " + favNum
                + "\nYour full name in the correct format is: " 
                + firstName + " " + midName + " " +lastName
                + "\nYour email at Guilford in the correct format is: " + email
                + "\nYour Final Pwd is: " + randPwd
                + "\nYour Final Pwd hash is: " + randPwd.hashCode()
                + "\nYour password is: \n\t" + randPwd
                + "\nYour password encrypted using AES and secret key "
                        + "(ThisIsSecretKey) is: " +encryptedPwd
                +"\nYour password decrypted using AES and secret key "
                        + "(ThisIsSecretKey) is: " 
                        + decryptedPwd);
        System.out.println("\n\nHere's some sayings about passwords: \n" +
"Choosing a hard-to-guess, but easy-to-remember password is important! \n" +
" \n" +
"Treat your password like your toothbrush.  \n" +
"Don't let anybody else use it, and get a new one every six months. ");
    }
    
}
