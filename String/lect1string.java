// package String;

public class lect1string {
    public static void main(String[] args) {
        String str = "Shah";
        String str1 = "Shah";
        // System.out.println(str);
        // System.out.println(str1);
        String st = new String("Shah");
        String st1 = new String("Shah");
        // System.out.println(st);
        // System.out.println(st1);

        //Concat
        // str += "baz";
        // st += "baz";
        // System.out.println(str);
        // System.out.println(st);

        //Length of String
        System.out.println(str.length());
        System.out.println(st1.length());

        //Comparison (heap vs string pool)
//(== compare by Addresss)
//(equals compare by Content(Value))
        System.out.println(str == str1);
        System.out.println(st == st1);
        System.out.println(st == str);
        System.out.println(str.equals(st));
        System.out.println(str1.equals(st1));




    }
}
