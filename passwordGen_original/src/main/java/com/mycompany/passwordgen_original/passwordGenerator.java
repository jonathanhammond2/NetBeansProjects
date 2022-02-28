package com.mycompany.passwordgen_original;

import java.io.UnsupportedEncodingException;
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
    
    private static SecretKeySpec key ;
//    private static byte[] IV;
    private static GCMParameterSpec param;
    
    public static String encrypt(byte[] plaintext) throws Exception 
    {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        
//        SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
        
//        GCMParameterSpec param = new GCMParameterSpec(128, IV);
        
        cipher.init(Cipher.ENCRYPT_MODE, key, param);
        
        return new String(cipher.doFinal(plaintext));
    }
    public static String decrypt(byte[] plaintext) throws Exception 
    {
        
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        
//        SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
        
//        GCMParameterSpec param = new GCMParameterSpec(128, IV);
        
        cipher.init(Cipher.DECRYPT_MODE, key, param);
        
        return new String(cipher.doFinal(plaintext));
    }

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
        
        
        
        byte[] IV = new byte[12];        
        SecureRandom random = new SecureRandom();
        random.nextBytes(IV);
        
        key = new SecretKeySpec("ThisIsASecretKey".getBytes(),"AES");
        param = new GCMParameterSpec(128, IV);
        String encryptedPwd = encrypt(randPwd.getBytes());
        String decryptedPwd = decrypt(encryptedPwd.getBytes());
        
//        AES.setKey("ThisIsSecretKey");
//        String encryptedPwd = AES.encrypt(randPwd, "ThisIsSecretKey");
//        String decryptedPwd = AES.decrypt(encryptedPwd, "ThisIsSecretKey");
//        System.out.println();
//        System.out.println(AES.decrypt(, "ThisIsSecretKey"));
//        String decryptedPwd = "down rn";
/*
 byte[] IV = new byte[12];
        SecretKeySpec key= new SecretKeySpec("ThisIsASecretKey".getBytes(), "AES");
        GCMParameterSpec param = new GCMParameterSpec(128, IV);
        SecureRandom random = new SecureRandom();
        random.nextBytes(IV);
        
        String encryptedPwd = encrypt(randPwd.getBytes(), key, IV, param);
        String decryptedPwd = decrypt(encryptedPwd.getBytes(), key, IV, param);
*/

        
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        firstName = scan.nextLine().toLowerCase();
//        firstName = "bob";
        
        System.out.println("Please enter your last name: ");
        lastName = scan.nextLine().toLowerCase();
//        lastName = "bobson";
        
        System.out.println("Please enter your middle name: ");
        midName= scan.nextLine().toLowerCase();
//        midName = "but";
        
        System.out.println("Please enter your favorite 2-digit number: ");
            favNum = scan.nextLine();
        
//        favNum = 22;
        
        System.out.println("Please enter your City of Birth: ");
        city = scan.nextLine().toLowerCase();
//        city = "Phoenix";
        
        
        System.out.println("Please enter your favorite color: ");
        color = scan.nextLine().toLowerCase();
//        color = "Blue";
        
        
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
                        + "(ThisIsASecretKey) is: " +encryptedPwd
                +"\nYour password decrypted using AES and secret key "
                        + "(ThisIsASecretKey) is: " 
                        + decryptedPwd);
        System.out.println("\n\nHere's some sayings about passwords: \n" +
"Choosing a hard-to-guess, but easy-to-remember password is important! \n" +
" \n" +
"Treat your password like your toothbrush.  \n" +
"Don't let anybody else use it, and get a new one every six months. ");
    }
    
}
