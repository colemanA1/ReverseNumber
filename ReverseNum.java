/**
 * Created by Coleman on 1/20/17.
 */
import java.util.Scanner;
    public class ReverseNum {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter numbers you want reversed: ");//Directs user to input a number
            int userValue = scan.nextInt();

            String userString = String.valueOf(userValue); //Changes the user input to a string
            String reverse = new StringBuilder(userString).reverse().toString();//Reverses that String


            System.out.println("Original numbers:");//Wanted to print original numbers to give context
            System.out.println(userValue);
            System.out.println();
            System.out.println("Reverse numbers: ");//Prints the reversed numbers
            System.out.println(reverse);
        }

    }

