// package String;

public class lect2string {
    public static void main(String[] args) {
        String str = "abcdef";

        // Print "CDE"

        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i) == 'c') {
        //         for (int j = i; j < str.length(); j++) {
        //             if (str.charAt(j) != 'f') {
        //                 System.out.println(str.charAt(j));
        //             } else {
        //                 break;
        //             }
        //         }
        //     }
        // }

        // int low = 0;
        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i) == 'c') {
        //         low = i;
        //     }
        // }
        // int upper = 0;
        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i) == 'e') {
        //         upper = i;
        //     }
        // }
        // for (int i = low; i <= upper; i++) {
        //     System.out.println(str.charAt(i));
        // }

        // Use of Substring

        System.out.println(str.substring(2, 5));
        String s1 = str.substring(1, 5);
        System.out.println(str.concat(s1));
        // System.out.println(str.substring(2));
        // System.out.println(str.substring(2, 6));
        // System.out.println(str.substring(0, 1));

        // Use of CompareTo (compare by char wise)

        String s2 = "abcdef";

        System.out.println(str.compareTo(s2));

        if (str.compareTo(s2) > 0) {
            System.out.println(str);
        } else {
            System.out.println(s2);
        }
    }
}
