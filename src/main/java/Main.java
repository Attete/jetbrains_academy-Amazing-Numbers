import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        welcomeScreen();
        runAllAppMethods();
    }

    static void runAllAppMethods() {
        System.out.println("Enter a request:");
        long userInput = scanner.nextLong();
        System.out.println();

        String stringInput = String.valueOf(userInput);

        if (userInput > 0) {
            System.out.println("Properties of " + stringInput);
            parityCheck(userInput);
            isBuzz(userInput);
            duckNumberCheck(userInput);
            checkPalindromicNumber(userInput);
            System.out.println();

            runAllAppMethods();
        } else if (userInput < 0) {
            System.out.println("The first parameter should be a natural number or zero.");
            runAllAppMethods();
        } else {
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }

    static void isBuzz(long userInput) {
        if (userInput % 7 == 0 || userInput % 10 == 7) {
            System.out.println("buzz: true");
        } else {
            System.out.println("buzz: false");
        }
    }

    static void parityCheck(long userInput) {
        if (userInput % 2 == 0) {
            System.out.println("even: true\r\n" +
                    "odd: false"
            );
        } else {
            System.out.println("even: false\r\n" +
                    "odd: true"
            );
        }
    }

    static void duckNumberCheck(long userInput) {
        String stringInput = String.valueOf(userInput);

        boolean result = stringInput.substring(1).contains("0");
        System.out.println("duck: " + result);
    }

    static void welcomeScreen() {
        System.out.println("Welcome to Amazing Numbers!\r\n\n"
                + "Supported requests:\r\n"
                + "- enter a natural number to know its properties;\r\n"
                + "- enter 0 to exit.\n");
    }

    static void checkPalindromicNumber(long userInput) {
        StringBuilder sbUserInput = new StringBuilder();
        sbUserInput.append(userInput).reverse();

        String stringSbUserInput = String.valueOf(sbUserInput);
        String stringUserInputReversed = String.valueOf(userInput);

        if (stringUserInputReversed.equals(stringSbUserInput)) {
            System.out.println("palindromic: true");
        } else {
            System.out.println("palindromic: false");
        }
    }
}
