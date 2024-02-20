

public class Lect1 {
    public static void main(String[] args) {
        String s = "abc";
        String s1 = "abc";
        String s2 = "abdf";
        System.out.println(s);
        s = s.concat("abc");
        String s3 = new  String("ab");
        System.out.println(s);
        System.out.println(s1==s);
        System.out.println(s2.equals(s1));
        System.out.println(s1.charAt(2));
        System.out.println(s1.contains("ab"));
        System.out.println(s1.indexOf('c'));
    }
}
