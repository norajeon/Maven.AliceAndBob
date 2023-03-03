/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input your name: ");
        String userName = userInput.nextLine();

        if (userName.equals("Alice") || userName.equals("Bob")) {
            System.out.println("Hello " + userName + ".");
        }
        else {

        }
    }
}
