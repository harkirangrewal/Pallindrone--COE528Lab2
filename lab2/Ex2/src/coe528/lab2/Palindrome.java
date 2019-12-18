/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab2;

/**
 *
 * @author hari
 */
public class Palindrome {
    
    //Requires: an input string
    //Effects: outputs true if the word can be read the same forwards and 
                    //backwards, outputs false if otherwise
    
    public static boolean isPalindrome(String a)
    {
        if(a == null)
            return false;
            
         else if(a.equals(""))
            return false;
            
        String rev = "";
        int length =0, i=0;
        length= a.length();
               
       
        for(i = length-1; i>=0; i--)
        {
            rev = rev + a.charAt(i);
        }
        
        if(a.equals(rev))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    
           public static void main(String[] args) {   
        if(args.length == 1) {
            if (args[0].equals("1"))
                System.out.println(isPalindrome(null));
            else if (args[0].equals("2")) 
                System.out.println(isPalindrome(""));
            else if (args[0].equals("3")) 
                System.out.println(isPalindrome("deed"));
            else if (args[0].equals("4"))
                System.out.println(isPalindrome("abcd"));
        }
     }
           

}
