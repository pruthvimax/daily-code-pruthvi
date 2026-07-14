import java.util.Scanner;


public class SumOfGivenRange {
    public static void main(String [] args ){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Starting range");
        int Starting=sc.nextInt();

        System.out.println("Enter Ending ");
        int Ending=sc.nextInt();

        int sum=0;
        for(int i=Starting;i<=Ending;i++){
            sum=sum+i;
        }
        System.out.println("Sum of Given range is: " +sum);
    }
}
