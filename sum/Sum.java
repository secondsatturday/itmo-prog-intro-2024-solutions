package sum;

import java.util.regex.*;

public class Sum {

    private class Arrays {
        private static String[] merge(String[] arr1, String[] arr2) {
            int reslen = arr1.length + arr2.length;
            String[] res = new String[reslen];
            System.arraycopy(arr1, 0, res, 0, arr1.length);
            System.arraycopy(arr2, 0, res, arr1.length, arr2.length);
            return res;
        }
    }

    public static void main(String[] args) {
        
        String[] words = {};
        Pattern pattern = Pattern.compile("[\\s\\u2029\\u001c\\u0000-\\u0020\\u1680\\u2000-\\u200f\\u2028-\u202f\\u205f-\\u206f\\u3000]+");
        for (String arg : args) {
            String[] tmp = pattern.split(arg);
            words = Arrays.merge(words, tmp);
        }

        int sum = 0;
        int[] nums = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            try {
                nums[i] = Integer.parseInt(words[i]);
            } catch (NumberFormatException e) {
                if(words[i].isEmpty()) {
                    nums[i] = 0;
                } else {
                    System.err.println("Error. Casting \"" + words[i] + "\" string to integer failed.");
                    System.exit(-1);
                }
            }
            sum += nums[i];
        }


        System.out.println(sum);
    }
}