import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void welcomeScreen() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.welcomeScreen();

        String expectedOutput =
                  "Supported requests:\r\n"
                + "- enter a natural number to know its properties;\r\n"
                + "- enter two natural numbers to obtain the properties of the list:\r\n"
                + "  * the first parameter represents a starting number;\r\n"
                + "  * the second parameter shows how many consecutive numbers are to be processed;\r\n"
                + "- separate the parameters with one space;\r\n"
                + "- enter 0 to exit.";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void parityCheckTest13() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.parityCheck(13);

        String expectedOutput = "even: false\r\n" +
                                "odd: true";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void parityCheckTest14() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.parityCheck(14);

        String expectedOutput = "even: true\r\n" +
                                "odd: false";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void isBuzzTest14() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.isBuzz(14);

        String expectedOutput = "buzz: true";

        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void isBuzzTest17() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.isBuzz(17);

        String expectedOutput = "buzz: true";

        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void isBuzzTest7() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.isBuzz(7);

        String expectedOutput = "buzz: true";

        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    @DisplayName("isBuzzTest13()")
    void isBuzzTest13() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.isBuzz(13);

        String expectedOutput = "buzz: false";

        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void duckNumberTest3210() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.duckNumberCheck(3210);

        String expectedOutput = "duck: true";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void duckNumberTest8050896() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.duckNumberCheck(8050896);

        String expectedOutput = "duck: true";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void duckNumberTest12345() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.duckNumberCheck(12345);

        String expectedOutput = "duck: false";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void duckNumberTest70709() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.duckNumberCheck(70709);

        String expectedOutput = "duck: true";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void checkForPalindromicNumberTest17371() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.checkPalindromicNumber(17371);

        String expectedOutput = "palindromic: true";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void checkPalindromicNumberTest1234() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.checkPalindromicNumber(1234 );

        String expectedOutput = "palindromic: false";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

}