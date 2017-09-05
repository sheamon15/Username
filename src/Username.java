/**
 * Author@ Shea Salloum
 * License@GNU
 * purpose: Display a enter username and enter password screen then welcome the user
 *
changes 1
        */
import java.util.Scanner;
public class Username {
    public static void main(String[] args){
            String name;
            Scanner keyboard = new Scanner(System.in);
                System.out.println("Enter your Username");
                name = keyboard.nextLine();
                System.out.println("Enter Your Password");
                String password;
                password = keyboard.nextLine();


                //output to display
                System.out.print("Hello, " + name);
                System.out.print( " Welcome to CSC200 class! and Your password is " + password);
    }
}
