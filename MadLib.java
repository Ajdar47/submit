import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {

        Scanner letters = new Scanner(System.in);

        System.out.println("Hi, this is a game called .... from the assignment 1 in chapter 2");
        System.out.println("So the game works by inputing a bunch of strings");
        System.out.println("im gofing to ask you those strings and put them in diffrent sentences");
        System.out.println("Please enter the first string and it should be noun");
        String first = letters.nextLine();
        System.out.println("Please enter the first string and it should be verb");
        String second = letters.nextLine();
        System.out.println("Please enter the first string and it should be adjective");
        String third = letters.nextLine();
        System.out.println("Please enter the first string and it should be noun");
        String fourth = letters.nextLine();

        System.out.println("The doctor asked for a "+ first);
        System.out.println("Jason did "+ second+" to a shop and found a "+first);
        System.out.println("Jason was "+ third);
        System.out.println("But he found out that he picked up a "+ fourth+" instead of a "+first);


    }
}
