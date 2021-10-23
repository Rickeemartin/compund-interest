import java.util.Scanner;

public class CompundInterestDemo {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        double amount ;
        double principal ;
        double rate ;
        double time ;
        System.out.print ("enter the principal amount =");
        principal = scanner.nextDouble ();

        System.out.print ("enter the rate =");
        rate = scanner.nextDouble();

        System.out.print ("enter the time =");
        time = scanner.nextDouble();

        amount = principal * Math.pow(1+rate/100,time);
        System.out.println ("the compund interest is : " +amount);





    }


}