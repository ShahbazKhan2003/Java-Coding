public class trycatch{
    public static void main(String[] args) {
        // int a = 10;
        // int b = 10;
        
        // try{
        //     int div = a/b;
        //     System.out.println("Answer is " + div);
        // }
        // catch(Exception e){
        //     // System.out.println(e.getMessage());  khud se btaiga kya error hai
        //     System.out.println("Bhai 0 se divide kr rha hai");
        // }

        // multiple exception
        // int[] arr = new int[5];
        
        // try{
        //     // arr[6] = 10/0;
        //        arr[6] = 10/1;

        // }
        // catch(ArithmeticException  | ArrayIndexOutOfBoundsException e){
        //     System.out.println(e.getMessage());
        // }

        //Nested Exception
        int[] arr = new int[5];

        try{
            // System.out.println("Exception hai kya");     //print hoga kuki error nhi tha yha tk
            try{
                // System.out.println("Exception hai kya"); //print hoga
                arr[6] = 10;
                System.out.println("Exception hai kya");  //ye nhi hoga kuki iss  k uppr se he waps chala gya code
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Mei toh chalunga he try catch k malum nhi muze");
        }
    }
}