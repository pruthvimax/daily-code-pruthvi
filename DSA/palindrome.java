 package DSA;
import java.util.*;
class palindrome {

    public static void main (String args []){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a palidrome num: ");
        int inputInt = input.nextInt();
        String inputStr = Integer.toString(inputInt);

        boolean ispalidrome = true;   //Assuming boolean Var true initially
        int x = 0;   //To point starting index of input
        int y = inputStr.length() - 1;  // End Pointer

        while (x < y){
            if(inputStr.charAt(x) != inputStr.charAt(y)){
                ispalidrome = false;
                break;
            }
            x++; //Increment x to  move strat forward
            y--; //Decrement y to move end backward
        }

if(ispalidrome){
System.out.println("It is a Palidrome");
}
else{
    System.out.println("It is not a palidrome number");
}

    }
}