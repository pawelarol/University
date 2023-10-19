import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Year2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String userAnswer;
            do {
                System.out.println("Please enter a year (or 'close' to exit):");
                userAnswer = scanner.nextLine();

                if (userAnswer.equalsIgnoreCase("close")) {
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                }

                try {
                    int year = Integer.parseInt(userAnswer);
                    int daysInYear = isLeapYear(year);


                    if (daysInYear == 366) {
                        System.out.println("The " + year + " is a leap year.");
                    } else {
                        System.out.println("The " + year + " is not a leap year.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid year or 'close' to exit.");
                }

            } while (!userAnswer.equalsIgnoreCase("close"));

        }

        private static int isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 366 : 365;
        }
    }


