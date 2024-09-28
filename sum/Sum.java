package sum;

import java.util.regex.*;

public class Sum {

    private class Arrays {
        private static char[] merge(char[] arr1, char[] arr2) {
            int reslen = arr1.length + arr2.length;
            char[] res = new char[reslen];
            System.arraycopy(arr1, 0, res, 0, arr1.length);
            System.arraycopy(arr2, 0, res, arr1.length, arr2.length);
            return res;
        }

        private static int[] merge(int[] arr1, int[] arr2) {
            int reslen = arr1.length + arr2.length;
            int[] res = new int[reslen];
            System.arraycopy(arr1, 0, res, 0, arr1.length);
            System.arraycopy(arr2, 0, res, arr1.length, arr2.length);
            return res;
        }

        private static String[] merge(String[] arr1, String[] arr2) {
            int reslen = arr1.length + arr2.length;
            String[] res = new String[reslen];
            System.arraycopy(arr1, 0, res, 0, arr1.length);
            System.arraycopy(arr2, 0, res, arr1.length, arr2.length);
            return res;
        }
    }

    public static void main(String[] args) {
        
        // char[] arr1 = {'1', '2', '3'};
        // char[] arr2 = {'4', '5', '6'};
        // int[] arr1 = {1, 2, 3};
        // int[] arr2 = {4, 5, 6};

        // int[] newarr = Arrays.merge(arr1, arr2);
        // for (int el : newarr) {
        //     System.out.println(el);
        // }
        // // char[] input = {};
        
        // Pattern pattern = Pattern.compile("\\s+");
        // /* Каждый аргумент обрабатываем, как текст */
        // String[] nums = {};
        // for (String arg : args) {
        //     nums = Arrays.merge(nums, pattern.split(arg));
        // }

        // for (String num : nums) {
        //     System.out.println(num);
        // }
        

        String[] words = {};
        for (String arg : args) {
            /* Удаление пробельных символов в начале и в конце строки, затем
             * разделение строки на слова с использованием регулярного выражения,
             * и добавление получившихся слов к массиву слов. */
            String[] tmp = arg.trim().split("\\s+");
            words = Arrays.merge(words, tmp);
        }

        // for(int i = 0; i < words.length; i++) {
        //     System.out.println(words[i]);
        // }

        int sum = 0;
        int[] nums = new int[words.length];
        boolean flag = true;
        for (int i = 0; i < words.length; i++) {
            try {
                nums[i] = Integer.parseInt(words[i]);
            } catch (NumberFormatException e) {
                if(words[i].isEmpty()) {
                    nums[i] = 0;
                } else {
                    System.err.println("Error. Cast input to integer failed.");
                    System.exit(-1);
                    // System.out.println(-1368);
                    // flag = false;
                }
            }
            
            sum += nums[i];
            // System.out.println(nums[i]);
        }
        System.out.println(sum);
    }
}