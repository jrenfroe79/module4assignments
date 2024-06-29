package module4assignments;
import java.util.*;
import java.io.*;

public class M04assignment2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Java source file: ");
        String filename = input.nextLine();

        File file = new File(filename);
        if (file.exists()) {
            System.out.println("The number of keywords in " + filename
                    + " is " + countKeywords(file));
        } else {
            System.out.println("File " + filename + " does not exist");
        }
    }

    public static int countKeywords(File file) throws Exception {
        // Array of all Java keywords + true, false and null
        String[] keywordString = {"abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "enum",
                "extends", "for", "final", "finally", "float", "goto",
                "if", "implements", "import", "instanceof", "int",
                "interface", "long", "native", "new", "package", "private",
                "protected", "public", "return", "short", "static",
                "strictfp", "super", "switch", "synchronized", "this",
                "throw", "throws", "transient", "try", "void", "volatile",
                "while", "true", "false", "null"};

        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));
        int count = 0;
        boolean inComment = false;
        boolean inString = false;

        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String word = input.next();

            if (!inComment && !inString) {
                if (word.startsWith("//")) {
                    // Line comment, ignore the rest of the line
                    break;
                } else if (word.startsWith("/*")) {
                    // Start of block comment
                    inComment = true;
                } else if (word.startsWith("\"")) {
                    // Start of string
                    inString = true;
                } else if (keywordSet.contains(word)) {
                    count++;
                }
            }

            if (inComment && word.endsWith("*/")) {
                // End of block comment
                inComment = false;
            }

            if (inString && word.endsWith("\"")) {
                // End of string
                inString = false;
            }
        }

        return count;
    }
}
