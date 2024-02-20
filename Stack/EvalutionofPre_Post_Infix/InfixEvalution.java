import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class InfixEvalution {
    public static void main(String[] args) {
//Without Brackets
        // String str = "9-5+3*4/6";
        // Stack<Integer> val = new Stack<>();
        // Stack<Character> opr = new Stack<>();

        // for(int i =0;i<str.length();i++)
        // {
        //     char ch = str.charAt(i);
        //     int ascii = (int)ch;

        //     if(ascii >= 48 && ascii <= 57) val.push(ascii-48);
            
        //     else if(opr.isEmpty()) opr.push(ch);

        //     else
        //     {
        //         if(ch=='+' || ch == '-')
        //         {
        //             //work perform
        //             int v2 = val.pop();
        //             int v1 = val.pop();
        //             if(opr.peek() == '+') val.push(v1+v2);
        //             if(opr.peek() == '-') val.push(v1-v2);
        //             if(opr.peek() == '*') val.push(v1*v2);
        //             if(opr.peek() == '/') val.push(v1/v2);
        //             opr.pop();

        //             //push
        //             opr.push(ch);
        //         }
        //         else  //agar ch == * ya %
        //         {
        //             if(opr.peek() == '*' || opr.peek()== '/')
        //             {
        //                 int v2 = val.pop();
        //                 int v1 = val.pop();
        //                 if(opr.peek() == '*') val.push(v1*v2);
        //                 if(opr.peek() == '/') val.push(v1/v2);
        //                 opr.pop();
        //                 //push
        //                 opr.push(ch);
        //             }
        //             else
        //             {
        //                 opr.push(ch);
        //             }
        //         }
        //     }
        // }

        // //If stack is not empty
        // while(val.size()>1)
        // {
        //     int v2 = val.pop();
        //     int v1 = val.pop();
        //     if(opr.peek() == '+') val.push(v1+v2);
        //     if(opr.peek() == '-') val.push(v1-v2);
        //     if(opr.peek() == '*') val.push(v1*v2);
        //     if(opr.peek() == '/') val.push(v1/v2);
        //     opr.pop();
        // }

        // System.out.println(val.peek());




//With Brackets
String str = "9-(5+3)*4/6";
Stack<Integer> val = new Stack<>();
Stack<Character> opr = new Stack<>();

for(int i =0;i<str.length();i++)
{
    char ch = str.charAt(i);
    int ascii = (int)ch;

    if(ascii >= 48 && ascii <= 57) val.push(ascii-48);
    
    else if(opr.isEmpty() || ch == '(' || opr.peek() == '(') 
    {
       opr.push(ch);
    }

    else if(ch == ')')
    {
        while(opr.peek()!='(')
        {
            int v2 = val.pop();
            int v1 = val.pop();
            if(opr.peek() == '+') val.push(v1+v2);
            if(opr.peek() == '-') val.push(v1-v2);
            if(opr.peek() == '*') val.push(v1*v2);
            if(opr.peek() == '/') val.push(v1/v2);
            
            opr.pop();
        }
        opr.pop();
    }

    else
    {
        if(ch=='+' || ch == '-')
        {
            //work perform
            int v2 = val.pop();
            int v1 = val.pop();
            if(opr.peek() == '+') val.push(v1+v2);
            if(opr.peek() == '-') val.push(v1-v2);
            if(opr.peek() == '*') val.push(v1*v2);
            if(opr.peek() == '/') val.push(v1/v2);
            opr.pop();

            //push
            opr.push(ch);
        }
        else  //agar ch == * ya %
        {
            if(opr.peek() == '*' || opr.peek()== '/')
            {
                int v2 = val.pop();
                int v1 = val.pop();
                if(opr.peek() == '*') val.push(v1*v2);
                if(opr.peek() == '/') val.push(v1/v2);
                opr.pop();
                //push
                opr.push(ch);
            }
            else
            {
                opr.push(ch);
            }
        }
    }
}

//If stack is not empty
while(val.size()>1)
{
    int v2 = val.pop();
    int v1 = val.pop();
    if(opr.peek() == '+') val.push(v1+v2);
    if(opr.peek() == '-') val.push(v1-v2);
    if(opr.peek() == '*') val.push(v1*v2);
    if(opr.peek() == '/') val.push(v1/v2);
    opr.pop();
}

System.out.println(val.peek());
        
    }
}
