package module4assignments;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class M04assignment1 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide the source-code file name as a command-line argument.");
            return;
        }

        String fileName = args[0];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            Stack<Character> stack = new Stack<>();
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    if (c == '(' || c == '{' || c == '[') {
                        stack.push(c);
                    } else if (c == ')' || c == '}' || c == ']') {
                        if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                            System.out.println("Error: Unmatched grouping symbol at line " + lineNumber);
                            return;
                        }
                    }
                }

                lineNumber++;
            }

            if (!stack.isEmpty()) {
                System.out.println("Error: Unmatched grouping symbol at the end of the file");
            } else {
                System.out.println("All grouping symbols are correctly matched.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']');
    }
}