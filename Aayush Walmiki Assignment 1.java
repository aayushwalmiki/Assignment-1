
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Neon Number
        Scanner Sc = new Scanner(System.in);
        // Taking the number for checking the neon number
        System.out.println("Enter the number ");
        int n = Sc.nextInt();
        int sum = 0;
        int square = n * n;
        while (square > 0) {
            int val = square % 10;
            sum = sum + val;
            square = square / 10;
        }
        // Checking if the sum of digit of the number square = number
        if (n == sum) {
            System.out.println("It is an neon number ");
        } else {
            System.out.println("Its is not a neon number");
        }
        ///

        // armstrong number

        Scanner Sc2 = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n1 = Sc2.nextInt();
        int k = n1;
        int arm = 0;
        while (n1 > 0) {
            int digit = n1 % 10;
            int cube = digit * digit * digit;
            arm = arm + cube;
            n1 = n1 / 10;
        }
        if (arm == k) {
            System.out.println("It is an armstrong number");
        } else {
            System.out.println("Number is not an armstrong number");
        }
        /////
        /// ISBN NUMBER
        // Solving this question with the help of Array to take input and processing it

        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        Scanner Sc3 = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {

            array[i] = Sc3.nextInt();
        }

        int sum2 = 0;
        int k2 = 1;
        for (int i = 0; i < 9; i++) {
            sum2 = array[i] * k + sum2;
            ++k2;

        }
        if (sum2 % 11 == 0) {
            System.out.println("It is an ISBN number ");
        } else {
            System.out.println("It is not an ISBN number");
        }

    }
}