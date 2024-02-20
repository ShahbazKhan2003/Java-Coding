class Stack1
{
    private int[] data;
    private int top =0;
//Default Constuctor if size of array is not declared in main func
    public Stack1()
    {
        this.data = new int[5];
    }
//Parameterized Constructor if size is given in main func
    public Stack1(int cap)
    {
        this.data = new int[cap];
    }
    
//Stack Functions
    public boolean isEmpty()
    {
        return top == 0;
    }
    public boolean isFull()
    {
        return this.top == this.data.length;
    }
    public void push(int item) throws Exception
    {
        if(isFull())
        {
            throw new Exception("Out of Bound hai bhai");
        }

        this.data[top]= item;
        this.top++;
    }
    public int pop() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Bhai phele se Khale hai ab kya khali krega");
        }

        this.top--;
        return this.data[this.top];
    }
    public int peek() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Bhai phele se Khale hai ab kya khali krega");
        }
        return this.data[this.top-1];
    }
    public int size()
    {
        return this.top;
    }
    public void Display()
    {
        for(int i=0;i<top;i++)
        {
            System.out.print(this.data[i]+" ");
        }
        System.out.println();
    }
}

public class StackUsingArray {
    public static void main(String[] args) throws Exception{
        Stack1 s = new Stack1();
        s.push(10);
        //s.push(20);
        // s.push(30);
        // s.push(40);
        // s.push(50);

        // System.out.println(s.pop());
        // s.Display();
        System.out.println(s.peek());
        // s.push(100);
        // s.Display();
        // s.push(120);

        
    }    
}
