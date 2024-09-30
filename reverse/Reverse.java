package reverse;

import java.util.*;

public class Reverse {
    public static void main(String[] args) {

        // String input =
        // """
        // 12 2 12
        // 2

        // 3 1
        // """;
        // Scanner lineScanner = new Scanner(input);

        Scanner lineScanner = new Scanner(System.in);
        
        Stack<Stack<Integer>> valsInStacks = new Stack<>();

        while(lineScanner.hasNextLine()) {
            Scanner intScanner = new Scanner(lineScanner.nextLine());

            valsInStacks.push(new Stack<Integer>());
            while(intScanner.hasNextInt()) {
                valsInStacks.peek().push(intScanner.nextInt());
            }

            intScanner.close();
        }
        lineScanner.close();

        while(!valsInStacks.isEmpty()) {
            Stack<Integer> vals = valsInStacks.pop();
            while(!vals.isEmpty()) {
                Integer val = vals.pop();
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}