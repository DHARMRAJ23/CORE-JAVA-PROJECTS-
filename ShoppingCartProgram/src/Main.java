
import java.util.Scanner;
public class Main {
    public static void main(String[]args){

        // Shopping Cart  Program

        Scanner sc = new Scanner(System.in);

        String item ;

        int Price ;

        int quantity;

        char currency=  '₹' ;

        double total;

        System.out.print(" what item would you like to buy?: ");
        item = sc.nextLine();

        System.out.print(" what is the price for each ?: ");
        Price = sc.nextInt();

        System.out.print(" how many would you like ?: ");
        quantity= sc.nextInt();

        total = Price * quantity;
        System.out.println("\nYou have bought " + quantity + " " + item   );
        System.out.println("Your Total is " + currency + total);


        sc.close();
    }

}
