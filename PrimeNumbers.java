/**
 * The PrimeNumbers class takes a starting and ending number as input and prints all prime numbers
 * within that range.
 */
// The line `import java.util.Scanner;` is importing the `Scanner` class from the `java.util` package.
// The `Scanner` class is used to read input from the user in the console.
import java.util.Scanner;

/**
 * The PrimeNumbers class is used to find and display prime numbers.
 */
public class PrimeNumbers{
// The code `public static void main(String[] args)` is the main method of the program. It is the entry
// point of the program and is automatically called when the program is run.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      // The code `System.out.print("Enter the starting number of the range: ");` is displaying the
      // message "Enter the starting number of the range: " in the console.
        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();

        // The code `System.out.print("Enter the ending number of the range: ");` is displaying the
        // message "Enter the ending number of the range: " in the console.
        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

      // The code `System.out.println("Prime numbers in the range " + start + " to " + end + ":");` is
      // printing a message to the console indicating the range of numbers for which prime numbers will
      // be printed.
        System.out.println("Prime numbers in the range " + start + " to " + end + ":");
        printPrimesInRange(start, end);

      // The `scanner.close();` statement is used to close the `Scanner` object. It is good practice to
      // close the `Scanner` object after you are done using it to free up system resources.
        scanner.close();
    }

  
   // The `printPrimesInRange` method is a helper method that takes in a starting number (`start`) and
   // an ending number (`end`) as parameters. It iterates through each number in the range from `start`
   // to `end` and checks if each number is prime by calling the `isPrime` method. If a number is
   // prime, it is printed to the console using `System.out.print(i + " ")`.
    private static void printPrimesInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

// The `isPrime` method is a helper method that takes in an integer `num` as a parameter and checks if
// it is a prime number.

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        // The code `for (int i = 2; i <= Math.sqrt(num); i++)` is a for loop that iterates from 2 to
        // the square root of the given number `num`.
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
// The `return true;` statement is used to indicate that the given number `num` is a prime number. It
// is returned by the `isPrime` method to indicate that the number is not divisible by any number other
// than 1 and itself, which is the definition of a prime number.

        return true;
}
}