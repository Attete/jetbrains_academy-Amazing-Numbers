import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Amazing Numbers!\r\n");
        welcomeScreen();
        runAllAppMethods();
    }

    static void runAllAppMethods() {
        long userInput = 0;
        System.out.println("Enter a request:");
        userInput = validateUserInput(userInput);

        System.out.println();

        if (userInput > 0) {
            System.out.println("Properties of " + userInput);
            isBuzz(userInput);
            duckNumberCheck(userInput);
            checkPalindromicNumber(userInput);
            checkGapfulNumber(userInput);
            parityCheck(userInput);

            System.out.println();
            runAllAppMethods();

        } else if (userInput < 0) {
            System.out.println("The first parameter should be a natural number or zero.");
            System.out.println();
            runAllAppMethods();
        } else {
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }

    static long validateUserInput(long userInput) {
        try {
            userInput = Long.parseLong(scanner.next());
        } catch (NumberFormatException e) {
            System.out.println();
            System.out.println("The first parameter should be a natural number or zero.");
            System.out.println();
            runAllAppMethods();
        }
        return userInput;
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
        System.out.println(
                "Supported requests:\r\n"
                        + "- enter a natural number to know its properties;\r\n"
                        + "- enter two natural numbers to obtain the properties of the list:\r\n"
                        + "  * the first parameter represents a starting number;\r\n"
                        + "  * the second parameter shows how many consecutive numbers are to be processed;\r\n"
                        + "- separate the parameters with one space;\r\n"
                        + "- enter 0 to exit.\n"
        );
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

    public static void checkGapfulNumber(long userInput) {
        String stringUserInput = String.valueOf(userInput);

        String stringGapfulDivider = String.valueOf(stringUserInput.charAt(0))
                + String.valueOf(stringUserInput.charAt(stringUserInput.length() - 1));

        int intGapfulDivider = Integer.parseInt(stringGapfulDivider);

        if (stringUserInput.length() < 3) {
            System.out.println("gapful: false");
        } else {
            if (userInput % intGapfulDivider == 0) {
                System.out.println("gapful: true");
            } else {
                System.out.println("gapful: false");
            }
        }
    }
}
