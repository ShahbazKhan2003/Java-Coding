class Queue
{
    private int[] arr;
    private int head = 0;
    private int tail = 0;

    public Queue()
    {
        this.arr = new int[5];
    }

    public Queue(int cap)
    {
        this.arr = new int[cap];
    }
//2 types of Queue i)Linear ii)circular( iss mei hum bss % use krte hai circular ghumne k liye)
    public boolean isEmpty()
    {
        return this.tail == 0;
    }
    public boolean isFull()
    {
        return this.tail == this.arr.length;
    }
    public int size()
    {
        return this.tail;
    }
    public void Enqueue(int item) throws Exception
    {
        if(isFull())
        {
            throw new Exception("Queue Full hai");
        }
        int i =(this.tail + this. head) % this.arr.length;
        this.arr[i]=item;
        tail++;
    }
    public int Dequeue() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue phele he se he Khali hai");
        }
        int rv = this.arr[head];
        this.head = (this.head+1) % this.arr.length;
        this.tail--;
        return rv;
    }
    public int getFront() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue phele he se he Khali hai");
        }
        return this.arr[head];
    }

    public void Display()
    {
        for(int i=0;i<this.tail;i++)
        {
            int idx = (i+this.head) % this.arr.length;
            System.out.print(this.arr[idx]+" ");
        }
        System.out.println();
    }
    

}
public class QueueFromArray 
{
    public static void main(String[] args) throws Exception{
        Queue qq = new Queue();
        qq.Enqueue(10);
        qq.Enqueue(20);
        qq.Enqueue(30);
        qq.Enqueue(40);
        qq.Display();

        System.out.println(qq.Dequeue());
        System.out.println(qq.Dequeue());

        qq.Display();

        qq.Enqueue(50);
        qq.Enqueue(60);
        qq.Enqueue(70);

        qq.Display();
    }
}
