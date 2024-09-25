package Sum;

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

        String str = "3";
        String[] newstr = str.split("\s+");
        for (int i = 0; i < newstr.length; i++) {
            System.out.println(newstr[i]);
        }
        

        // String[] words = {};
        // for (int i = 0; i < args.length; i++) {
        //     String[] tmp = args[i].split("\s+");
        //     words = mergeTwoStringArrays(words, tmp);
        //     System.out.println(words[i]);
        // }

        // int sum = 0;
        // int[] nums = new int[words.length];
        // for (int i = 0; i < words.length; i++) {
        //     nums[i] = Integer.parseInt(words[i]);
        //     sum += nums[i];
        //     // System.out.println(nums[i]);
        // }
        // System.out.println(sum);
    }
}