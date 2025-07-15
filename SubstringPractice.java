package CSC130_SP25;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SubstringPractice {

    public static String[] PROTEINS = { "A", "C", "G", "T" };

    public static void main(String[] args) throws FileNotFoundException {

        Scanner fin = new Scanner(new File("input.in"));
        // read file into a single String
        String inputStr = "";
        while (fin.hasNextLine()) {
            inputStr += fin.nextLine();
        }

        final String SEQUENCE = "ATGT";

        // count # of occurrences using .indexOf
        int count = 0;
        int index = inputStr.indexOf(SEQUENCE, 0);
        while (index != -1) {
            count++;
            index = inputStr.indexOf(SEQUENCE, index + 1);
        }
        System.out.printf("There are %d occurrences of the sequence %s.\n",
                count, SEQUENCE);

                fin.close();
    }

}
