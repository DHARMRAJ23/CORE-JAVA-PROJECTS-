import java.util.Scanner;

public class main {
    public static void main(String[]args){
        // MAD LIB GAME

        Scanner scanner = new Scanner(System.in);

        String Adjective1;
        String noun;
        String Adjective2;
        String verb;
        String Adjective3;

        System.out.print(" Enter A Adjective (Description) : ");
        Adjective1 = scanner.nextLine();
        System.out.print(" Enter Noun (Person OR  Animal ) : ");
        noun  = scanner.nextLine();
        System.out.print(" Enter A Adjective (Description) : ");
        Adjective2 = scanner.nextLine();
        System.out.print(" Enter verb end with -ing (Action): ");
        verb  = scanner.nextLine();
        System.out.print(" Enter A Adjective (Description) : ");
        Adjective3  = scanner.nextLine();

        System.out.println( "\n Today I went to "+ Adjective1 + "Zoo.");
        System.out.println("In a exhibit , I saw " + noun + ". " );
        System.out.println(noun + " was "+ Adjective2 + " and " + verb + "!");
        System.out.println("I Was "+ Adjective3 + "!");





        scanner.close();


    }


}
