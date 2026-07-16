import java.util.*;
public class GreatestTwo {
    public static void main (String [] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Number 1: ");
            int a = sc.nextInt();

            System.out.println("Enter Number 2: ");
            int  b = sc.nextInt();
    
            if(a>b){
                        System.out.println("Greatest Number is: " +a);
            }
            else{
                        System.out.println("Greatest Number is: "  +b);
            }
        }
}
