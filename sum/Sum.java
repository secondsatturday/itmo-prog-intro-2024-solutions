package sum;

public class Sum {

    private static String[] mergeTwoStringArrays(String[] arr1, String[] arr2) {
        int reslen = arr1.length + arr2.length;
        String[] res = new String[reslen];

        System.arraycopy(arr1, 0, res, 0, arr1.length);
        System.arraycopy(arr2, 0, res, arr1.length, arr2.length);

        return res;
    }
    public static void main(String[] args) {
        
        // for (int i = 0; i < args.length; i++) {
        //     System.out.println(args[i]);
        // }

        // String str = "3";
        // String[] newstr = str.split("\s+");
        // for (int i = 0; i < newstr.length; i++) {
        //     System.out.println(newstr[i]);
        // }
        
        // String[] arr1 = {"1", "2"};
        // String[] arr2 = {"3"};
        // String[] arr3 = mergeTwoStringArrays(arr1, arr2);
        // for(int i = 0; i < arr3.length; i++) {
        //     System.out.println(arr3[i]);
        // }
        

        String[] words = {};
        for (int i = 0; i < args.length; i++) {
            /* Удаление пробельных символов в начале и в конце строки, затем
             * разделение строки на слова с использованием регулярного выражения,
             * и добавление получившихся слов к массиву слов. */
            String[] tmp = args[i].trim().split("\s+");
            words = mergeTwoStringArrays(words, tmp);
        }

        // for(int i = 0; i < words.length; i++) {
        //     System.out.println(words[i]);
        // }

        int sum = 0;
        int[] nums = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            try {
                nums[i] = Integer.parseInt(words[i]);
            } catch (NumberFormatException e) {
                if(!words[i].isEmpty()) {
                    System.err.println("Error. Cast input to integer failed.");
                    System.exit(-1);
                } else {
                    nums[i] = 0;
                }
            }
            
            sum += nums[i];
            // System.out.println(nums[i]);
        }
        System.out.println(sum);
    }
}