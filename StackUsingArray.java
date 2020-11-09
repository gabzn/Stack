public class StackUsingArray
{
    private int[] stack;
    private int capacity;
    private int size;

    public StackUsingArray(int capacity)
    {
        this.stack = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public void push(int data) throws Exception
    {
        if(isFull())
        {
            throw new Exception("Stack is full");
        }
        stack[size] = data;
        size++;
    }

    public void pop() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Empty stack");
        }
        size--;
    }

    public int peek() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Empty stack");
        }
        return stack[size-1];
    }

    public boolean isEmpty()
    {
        return (size == 0);
    }

    public boolean isFull()
    {
        return (size == capacity);
    }

    public int getSize()
    {
        return size;
    }
}
