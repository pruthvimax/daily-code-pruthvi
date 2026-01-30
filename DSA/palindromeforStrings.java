package DSA;

import java.util.Scanner;

public class palindromeforStrings {
    public static void main (String [] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a String: ");  //Reading  a String From User.
        String str=in.next();

        String rev="";  //A Variable to Store Reversed String

        for (int i = str.length() -1; i >=0;i--){
            rev += str.charAt(i);
        }
        if (str.equals(rev)){
                System.out.println("Entered String is a Palindrome string");
        }
        else{
            System.out.println("The entered string is not a palindrome String");
        }
    }
}
//The above program can work on both strings and Integer Inputs
