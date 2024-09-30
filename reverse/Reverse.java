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

        /*
         * Option 1 : Using two-dimensional array. Works slow.
        */

        int[][] valsmtrx = new int[0][0];
        for(int i = 0; lineScanner.hasNextLine(); i++) {
            if(i >= valsmtrx.length) {
                valsmtrx = Arrays.copyOf(valsmtrx, valsmtrx.length+1);
                valsmtrx[i] = new int[0];
            }

            Scanner intScanner = new Scanner(lineScanner.nextLine());
            for(int j = 0; intScanner.hasNextLine(); j++) {
                if (j >= valsmtrx[i].length) {
                    valsmtrx[i] = Arrays.copyOf(valsmtrx[i], valsmtrx[i].length+1);
                }
                valsmtrx[i][j] = intScanner.nextInt();
            }
            intScanner.close();
        }
        lineScanner.close();

        for(int i = valsmtrx.length-1; i >= 0; i--) {
            for(int j = valsmtrx[i].length-1; j >= 0; j--) {
                System.out.print(valsmtrx[i][j] + " ");
            }
            System.out.println();
        }

        /*
         * Option 2 : Using collections framework. Works much faster!
        */
        
        // Stack<Stack<Integer>> valsInStacks = new Stack<>();

        // while(lineScanner.hasNextLine()) {
        //     Scanner intScanner = new Scanner(lineScanner.nextLine());

        //     valsInStacks.push(new Stack<Integer>());
        //     while(intScanner.hasNextInt()) {
        //         valsInStacks.peek().push(intScanner.nextInt());
        //     }

        //     intScanner.close();
        // }
        // lineScanner.close();

        // while(!valsInStacks.isEmpty()) {
        //     Stack<Integer> vals = valsInStacks.pop();
        //     while(!vals.isEmpty()) {
        //         Integer val = vals.pop();
        //         System.out.print(val + " ");
        //     }
        //     System.out.println();
        // }
    }
}